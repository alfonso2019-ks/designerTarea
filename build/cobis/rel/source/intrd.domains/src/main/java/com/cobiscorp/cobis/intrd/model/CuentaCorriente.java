package com.cobiscorp.cobis.intrd.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class CuentaCorriente {

	public static final String EN_CUENTACNN_200 = "EN_CUENTACNN_200";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "CuentaCorriente";
	
	
	public static final Property<Double> SALDO = new Property<Double>("saldo", Double.class, false);
	
	public static final Property<String> NUMERODECUENTA = new Property<String>("numeroDeCuenta", String.class, false);
	
	public static final Property<Character> OPERACION = new Property<Character>("operacion", Character.class, false);
	
	public static final Property<String> CEDULACLIENTE = new Property<String>("cedulaCliente", String.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
