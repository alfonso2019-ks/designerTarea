package com.cobiscorp.cobis.intrd.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class Grupo {

	public static final String EN_GRUPOAIQH_970 = "EN_GRUPOAIQH_970";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "Grupo";
	
	
	public static final Property<Integer> UBICACION = new Property<Integer>("ubicacion", Integer.class, false);
	
	public static final Property<String> DESCRIPCION = new Property<String>("descripcion", String.class, false);
	
	public static final Property<Integer> NIVEL = new Property<Integer>("nivel", Integer.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
