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

import com.cobiscorp.cobis.intrd.model.Herramienta;

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
  @Property(name = "bli.id", value = "BLI1284_bli_insertarherramienta")
})
public class BLI1284_bli_insertarherramienta implements IBLIExecutor {
  private static final ILogger logger = LogFactory.getLogger(BLI1284_bli_insertarherramienta.class);

  public void execute(DynamicRequest dynamicRequest) {
    Mapper mapper = null;
    try {
      DataEntity row = BLIUtils.getRowDataEntity(dynamicRequest);
      List<Object> outListEntities = new ArrayList<Object>();
      DataEntity rowHerramienta;
      if (row != null && Herramienta.ENTITY_NAME.equals(row.getEntityName())) {
        rowHerramienta = row;
      } else {
        rowHerramienta = BLIUtils.getDataEntity(dynamicRequest, Herramienta.ENTITY_NAME);
        if (rowHerramienta == null) {
          throw new DesignerRuntimeException("No existe entidad " + Herramienta.ENTITY_NAME);
        }
      }

      String wherramienta = rowHerramienta.get(Herramienta.HERRAMIENTA);
      String wurl = rowHerramienta.get(Herramienta.URL);

      if (logger.isDebugEnabled()) {
        logger.logDebug("inputParameters: " + " HERRAMIENTA: " + wherramienta + " URL: " + wurl);
      }

      mapper = MapperManager.get(Mapper.class);
      mapper.addInputParameter("@t_trn", SqlType.SMALLINT, "15261");
      mapper.addInputParameter("@i_operacion", SqlType.VARCHAR, "I");

      if (wherramienta != null){
        mapper.addInputParameter("@i_herramienta", SqlType.VARCHAR, BLIUtils.convertToType(wherramienta, String.class));
      }

      if (wurl != null){
        mapper.addInputParameter("@i_ref", SqlType.VARCHAR, BLIUtils.convertToType(wurl, String.class));
      }
      boolean ret = mapper.execute(".cobis.sp_herramienta");
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
