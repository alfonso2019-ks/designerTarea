package com.cobiscorp.cobis.intrd.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class Operacion {

	public static final String EN_OPERACINO_209 = "EN_OPERACINO_209";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "Operacion";
	
	
	public static final Property<Double> NUMERO1 = new Property<Double>("numero1", Double.class, false);
	
	public static final Property<Double> RESULTADO = new Property<Double>("resultado", Double.class, false);
	
	public static final Property<Double> NUMERO2 = new Property<Double>("numero2", Double.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
