package org.brijframework.dao;

import org.brijframework.bean.BeanObject;
import org.brijframework.support.beans.Attribute;
import org.brijframework.support.beans.Bean;
import org.brijframework.support.enums.Scope;
import org.brijframework.support.mapper.Mapper;
import org.brijframework.support.model.Construct;
import org.brijframework.support.model.Logic;
import org.brijframework.support.model.Model;
import org.brijframework.support.model.Param;
import org.brijframework.support.model.Property;
import org.brijframework.support.model.Relation;
import org.brijframework.util.support.Access;

@Model(id = "Address_001", access = Access.PRIVATE, 
  constructor = @Construct(params = {@Param(type = String.class, index = 0), @Param(type = String.class, index = 1) }))
@Bean(id = "Address_001", scope=Scope.PROTOTYPE,  model = "Address_001", 
  constructor = @Construct(params = {@Param(type = String.class, index = 0), @Param(type = String.class, index = 1) }), 
  properties = {@Attribute(name = "line", value = "noida"), @Attribute(name = "landMark", value = "Globel") 
})
@Model
@Bean(scope=Scope.SESSION)
@Mapper(source = "")
public class Address implements BeanObject {
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	public Address() {
	}

	public Address(String line, String landMark) {
		this.line = line;
		this.landMark = landMark;
	}

	@Property(access = Access.PUBLIC, value = "Sector 71")
	public String line;

	@Relation(mappedBy = "City",access = Access.PUBLIC)
	private City city;

	@Mapper(source = "LANDMARK", destination="landMark")
	@Property(access = Access.PUBLIC, value = "Noida")
	private String landMark;

	// public Employee employee;

	@Logic
	public void logicInfo() {
	}

	@Logic
	public void logicInfo(int i) {

	}

	@Logic
	public void logicInfo(String i) {

	}

	@Logic
	public void logicInfo(String i, int j) {

	}

	@Override
	public <T> T setProperty(String _keyPath, T _value) {
		System.out.println("Address ppt call");
		return BeanObject.super.setProperty(_keyPath, _value);
	}

	@Override
	public String toString() {
		return super.toString()+"[line=" + line + ", city=" + city + ", landMark=" + landMark + "]";
	}
	
	
}
