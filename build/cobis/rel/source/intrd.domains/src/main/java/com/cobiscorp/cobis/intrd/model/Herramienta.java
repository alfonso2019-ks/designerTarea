package com.cobiscorp.cobis.intrd.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class Herramienta {

	public static final String EN_HERRAMIET_966 = "EN_HERRAMIET_966";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "Herramienta";
	
	
	public static final Property<String> HERRAMIENTA = new Property<String>("herramienta", String.class, false);
	
	public static final Property<Integer> TRN = new Property<Integer>("trn", Integer.class, false);
	
	public static final Property<String> URL = new Property<String>("url", String.class, false);
	
	public static final Property<Character> OPERACION = new Property<Character>("operacion", Character.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
