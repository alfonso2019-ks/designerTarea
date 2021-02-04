package com.cobiscorp.cobis.intrd.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class CuentaOrigen {

	public static final String EN_CUENTAORN_260 = "EN_CUENTAORN_260";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "CuentaOrigen";
	
	
	public static final Property<Double> VALORATRANSFERIR = new Property<Double>("valorATransferir", Double.class, false);
	
	public static final Property<Integer> NUMEROCUENTA = new Property<Integer>("numeroCuenta", Integer.class, false);
	
	public static final Property<Double> SALDO = new Property<Double>("saldo", Double.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
