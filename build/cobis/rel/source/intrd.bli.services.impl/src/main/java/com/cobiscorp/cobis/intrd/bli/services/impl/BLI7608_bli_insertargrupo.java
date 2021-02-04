package com.cobiscorp.cobis.intrd.bli.services.impl;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.cobiscorp.cobis.cwc.context.MapperManager;
import com.cobiscorp.cobis.cwc.kernel.sp.dto.MapperResult;
import com.cobiscorp.cobis.cwc.kernel.sp.impl.ExecutorSP;

import com.cobiscorp.cobis.intrd.model.Grupo;

import com.cobiscorp.designer.api.DataEntity;
import com.cobiscorp.designer.api.DataEntityList;
import com.cobiscorp.designer.api.DynamicRequest;
import com.cobiscorp.designer.bli.util.BLIUtils;
import com.cobiscorp.designer.bli.api.IBLIExecutor;
import com.cobiscorp.designer.exception.DesignerRuntimeException;
import com.cobiscorp.designer.bli.manager.BliManagerException;
import com.cobiscorp.cobis.cwc.server.information.ServerParamUtil;
import com.cobiscorp.cobis.commons.domains.log.ILogger;
import com.cobiscorp.cobis.commons.log.LogFactory;
import com.cobiscorp.ecobis.map.Mapper;
import com.cobiscorp.ecobis.map.dto.Result;
import com.cobiscorp.ecobis.map.enums.SqlType;

@Component
@Service({ IBLIExecutor.class })
@Properties({
  @Property(name = "task.module", value = "INTRD"),
  @Property(name = "bli.id", value = "BLI7608_bli_insertargrupo")
})
public class BLI7608_bli_insertargrupo implements IBLIExecutor {
  private static final ILogger logger = LogFactory.getLogger(BLI7608_bli_insertargrupo.class);

  public void execute(DynamicRequest dynamicRequest) {
    Mapper mapper = null;
    try {
      DataEntity row = BLIUtils.getRowDataEntity(dynamicRequest);
      List<Object> outListEntities = new ArrayList<Object>();
      DataEntity rowGrupo;
      if (row != null && Grupo.ENTITY_NAME.equals(row.getEntityName())) {
        rowGrupo = row;
      } else {
        rowGrupo = BLIUtils.getDataEntity(dynamicRequest, Grupo.ENTITY_NAME);
        if (rowGrupo == null) {
          throw new DesignerRuntimeException("No existe entidad " + Grupo.ENTITY_NAME);
        }
      }

      String wdescripcion = rowGrupo.get(Grupo.DESCRIPCION);
      Integer wnivel = rowGrupo.get(Grupo.NIVEL);
      Integer wubicacion = rowGrupo.get(Grupo.UBICACION);

      if (logger.isDebugEnabled()) {
        logger.logDebug("inputParameters: " + " DESCRIPCION: " + wdescripcion + " NIVEL: " + wnivel + " UBICACION: " + wubicacion);
      }

      mapper = MapperManager.get(Mapper.class);
      mapper.addInputParameter("@t_trn", SqlType.INT, "15785");

      if (wdescripcion != null){
        mapper.addInputParameter("@i_descripcion", SqlType.VARCHAR, BLIUtils.convertToType(wdescripcion, String.class));
      }
      mapper.addInputParameter("@i_operacion", SqlType.CHAR, "I");

      if (wnivel != null){
        mapper.addInputParameter("@i_nivel", SqlType.TINYINT, BLIUtils.convertToType(wnivel, String.class));
      }

      if (wubicacion != null){
        mapper.addInputParameter("@i_ubicacion", SqlType.TINYINT, BLIUtils.convertToType(wubicacion, String.class));
      }
      boolean ret = mapper.execute(".cobis.sp_grupos");
      int retCode = mapper.returnCode();
      if (ret && (retCode == 0)) {




        if (logger.isDebugEnabled()) {
          logger.logDebug("returnCode: " + retCode);
        }
      } else {
        BliManagerException.handleMapperException(mapper);
      }
    } catch (Exception ex) {
      BliManagerException.handleBliException(ex);
    } finally {
      if (mapper != null)
        mapper.check();
    }
  }

}
