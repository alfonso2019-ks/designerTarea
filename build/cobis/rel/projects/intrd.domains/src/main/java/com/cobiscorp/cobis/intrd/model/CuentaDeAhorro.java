package com.cobiscorp.cobis.intrd.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class CuentaDeAhorro {

	public static final String EN_CUENTADOE_370 = "EN_CUENTADOE_370";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "CuentaDeAhorro";
	
	
	public static final Property<Integer> TRN = new Property<Integer>("trn", Integer.class, false);
	
	public static final Property<Double> SALDO = new Property<Double>("saldo", Double.class, false);
	
	public static final Property<String> CEDULACLIENTE = new Property<String>("cedulaCliente", String.class, false);
	
	public static final Property<Character> OPERACION = new Property<Character>("operacion", Character.class, false);
	
	public static final Property<String> NUMEROCUENTA = new Property<String>("numeroCuenta", String.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
