package com.cobiscorp.cobis.intrd.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class Entity2 {

	public static final String EN_2QLJEVRXD_226 = "EN_2QLJEVRXD_226";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "Entity2";
	
	
	public static final Property<String> ATTRIBUTE1 = new Property<String>("attribute1", String.class, false);
	
	public static final Property<String> ATTRIBUTE2 = new Property<String>("attribute2", String.class, false);
	
	public static final Property<String> ATTRIBUTE3 = new Property<String>("attribute3", String.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
