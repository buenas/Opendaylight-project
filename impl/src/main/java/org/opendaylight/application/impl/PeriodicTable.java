/*
 * Copyright © 2016 buenas and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.application.impl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PeriodicTable {


	@XmlElementWrapper(name = "periodic_elements")
	@XmlElement(name = "periodic_elements")
	private List<CsvElement> elements = new ArrayList<CsvElement>();

	public List<CsvElement> getCsvElement(){
		return elements;
	}

	public void setCsvElement(List<CsvElement> elements){
		this.elements = elements;
	}

	@Override
	public boolean equals(Object obj){
		if(obj == this){
			return true;
		}
		if(!(obj instanceof PeriodicTable)){
			return false;
		}
		PeriodicTable periodictable = (PeriodicTable)obj;
		return new EqualsBuilder().append(elements, periodictable.elements).isEquals();
	}

	@Override
	public int hashCode(){
		return new HashCodeBuilder(27, 57).append(elements).hashCode();
	}

}
