/*
 * Copyright © 2016 buenas and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.application.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.opencsv.bean.CsvBindByPosition;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CsvElement {

	@XmlAnyElement
	@CsvBindByPosition(position = 0)
	private Integer atomicNumber;

	@XmlAnyElement
	@CsvBindByPosition(position = 1)
	private String element;

	@XmlAnyElement
	@CsvBindByPosition(position = 2)
	private String symbol;

	@XmlAnyElement
	@CsvBindByPosition(position = 3)
	private double atomicWeight;

	@XmlAnyElement
	@CsvBindByPosition(position = 4)
	private Integer period;

	@XmlAnyElement
	@CsvBindByPosition(position = 5)
	private Integer group;

	@XmlAnyElement
	@CsvBindByPosition(position = 6)
	private String phase;

	@XmlAnyElement
	@CsvBindByPosition(position = 7)
	private String mostStable;

	@XmlAnyElement
	@CsvBindByPosition(position = 8)
	private String type;

	@XmlAnyElement
	@CsvBindByPosition(position = 9)
	private double ionicRadius;

	@XmlAnyElement
	@CsvBindByPosition(position = 10)
	private double electronegativity;

	@XmlAnyElement
	@CsvBindByPosition(position = 11)
	private double firstionizationPotential;

	@XmlAnyElement
	@CsvBindByPosition(position = 12)
	private double density;

	@XmlAnyElement
	@CsvBindByPosition(position = 13)
	private double meltingPoint;

	@XmlAnyElement
	@CsvBindByPosition(position = 14)
	private double boilingPoint;

	@XmlAnyElement
	@CsvBindByPosition(position = 15)
	private Integer isotopes;

	@XmlAnyElement
	@CsvBindByPosition(position = 16)
	private String discoverer;

	@XmlAnyElement
	@CsvBindByPosition(position = 17)
	private Integer yearOfDiscovery;

	@XmlAnyElement
	@CsvBindByPosition(position = 18)
	private double specificHeatCapacity;

	@XmlAnyElement
	@CsvBindByPosition(position = 19)
	private String electronConfiguration;

	@XmlAnyElement
	@CsvBindByPosition(position = 20)
	private Integer displayRow;

	@XmlAnyElement
	@CsvBindByPosition(position = 21)
	private Integer displayColumn;


	public Integer getAtomicNumber() {
		return atomicNumber;
	}
	public void setAtomicNumber(Integer atomicNumber) {
		this.atomicNumber = atomicNumber;
	}
	public String getElement() {
		return element;
	}
	public void setElement(String element) {
		this.element = element;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public double getAtomicWeight() {
		return atomicWeight;
	}
	public void setAtomicWeight(double atomicWeight) {
		this.atomicWeight = atomicWeight;
	}
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
	public Integer getGroup() {
		return group;
	}
	public void setGroup(Integer group) {
		this.group = group;
	}
	public String getPhase() {
		return phase;
	}
	public void setPhase(String phase) {
		this.phase = phase;
	}
	public String getMostStable() {
		return mostStable;
	}
	public void setMostStable(String mostStable) {
		this.mostStable = mostStable;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getIonicRadius() {
		return ionicRadius;
	}
	public void setIonicRadius(double ionicRadius) {
		this.ionicRadius = ionicRadius;
	}
	public double getElectronegativity() {
		return electronegativity;
	}
	public void setElectronegativity(double electronegativity) {
		this.electronegativity = electronegativity;
	}
	public double getFirstionizationPotential() {
		return firstionizationPotential;
	}
	public void setFirstionizationPotential(double firstionizationPotential) {
		this.firstionizationPotential = firstionizationPotential;
	}
	public double getDensity() {
		return density;
	}
	public void setDensity(double density) {
		this.density = density;
	}
	public double getMeltingPoint() {
		return meltingPoint;
	}
	public void setMeltingPoint(double meltingPoint) {
		this.meltingPoint = meltingPoint;
	}
	public double getBoilingPoint() {
		return boilingPoint;
	}
	public void setBoilingPoint(double boilingPoint) {
		this.boilingPoint = boilingPoint;
	}
	public Integer getIsotopes() {
		return isotopes;
	}
	public void setIsotopes(Integer isotopes) {
		this.isotopes = isotopes;
	}
	public String getDiscoverer() {
		return discoverer;
	}
	public void setDiscoverer(String discoverer) {
		this.discoverer = discoverer;
	}
	public Integer getYearOfDiscovery() {
		return yearOfDiscovery;
	}
	public void setYearOfDiscovery(Integer yearOfDiscovery) {
		this.yearOfDiscovery = yearOfDiscovery;
	}
	public double getSpecificHeatCapacity() {
		return specificHeatCapacity;
	}
	public void setSpecificHeatCapacity(double specificHeatCapacity) {
		this.specificHeatCapacity = specificHeatCapacity;
	}
	public String getElectronConfiguration() {
		return electronConfiguration;
	}
	public void setElectronConfiguration(String electronConfiguration) {
		this.electronConfiguration = electronConfiguration;
	}
	public Integer getDisplayRow() {
		return displayRow;
	}
	public void setDisplayRow(Integer displayRow) {
		this.displayRow = displayRow;
	}
	public Integer getDisplayColumn() {
		return displayColumn;
	}
	public void setDisplayColumn(Integer displayColumn) {
		this.displayColumn = displayColumn;
	}

	@Override
	public boolean equals(Object obj){
		if(obj == this){
			return true;
		}
		if(!(obj instanceof CsvElement)){
			return false;
		}
		CsvElement csvelement = (CsvElement) obj;

		return new EqualsBuilder()
				.append(atomicNumber, csvelement.atomicNumber)
				.append(element, csvelement.element)
				.append(symbol, csvelement.symbol)
				.append(atomicWeight, csvelement.atomicWeight)
				.append(period, csvelement.period)
				.append(group, csvelement.group)
				.append(phase, csvelement.phase)
				.append(mostStable, csvelement.mostStable)
				.append(type, csvelement.type)
				.append(ionicRadius, csvelement.ionicRadius)
				.append(electronegativity, csvelement.electronegativity)
				.append(firstionizationPotential, csvelement.firstionizationPotential)
				.append(density, csvelement.density)
				.append(meltingPoint, csvelement.meltingPoint)
				.append(boilingPoint, csvelement.boilingPoint)
				.append(isotopes, csvelement.isotopes)
				.append(discoverer, csvelement.discoverer)
				.append(yearOfDiscovery, csvelement.yearOfDiscovery)
				.append(specificHeatCapacity, csvelement.specificHeatCapacity)
				.append(electronConfiguration, csvelement.electronConfiguration)
				.append(displayRow, csvelement.displayRow)
				.append(displayColumn, csvelement.displayColumn)
				.isEquals();
	}

	@Override
	public int hashCode(){

		return new HashCodeBuilder(27, 57)
				.append(atomicNumber)
				.append(element)
				.append(symbol)
				.append(atomicWeight)
				.append(period)
				.append(group)
				.append(phase)
				.append(mostStable)
				.append(type)
				.append(ionicRadius)
				.append(electronegativity)
				.append(firstionizationPotential)
				.append(density)
				.append(meltingPoint)
				.append(boilingPoint)
				.append(isotopes)
				.append(discoverer)
				.append(yearOfDiscovery)
				.append(specificHeatCapacity)
				.append(electronConfiguration)
				.append(displayRow)
				.append(displayColumn)
				.hashCode();
	}

	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}




}
