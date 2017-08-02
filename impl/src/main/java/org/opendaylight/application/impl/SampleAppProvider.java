/*
 * Copyright © 2016 buenas and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.application.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.eclipse.persistence.jaxb.JAXBContextProperties;
import org.eclipse.persistence.oxm.MediaType;
import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;

public class SampleAppProvider{

    private static final Logger LOG = LoggerFactory.getLogger(SampleAppProvider.class);
    private static final String CSV_FILE_PATH = "/src/main/resources/Periodic Table of Elements.csv";


    private final DataBroker dataBroker;
    private PeriodicTable periodicTable;

    public SampleAppProvider(final DataBroker dataBroker){
        this.dataBroker = dataBroker;
    }

	/**
     * Method called when the blueprint container is created.
     */
    public void init() throws FileNotFoundException{
        LOG.info("Sample-appProvider Session Initiated");
        periodicTable = parseCsvFile(SampleAppProvider.class.getResourceAsStream(CSV_FILE_PATH));
       saveCsvFile(periodicTable, MediaType.APPLICATION_JSON.getMediaType(), new FileOutputStream(new File("src/main/resources/PeriodicElements.json")));
       saveCsvFile(periodicTable, MediaType.APPLICATION_XML.getMediaType(), new FileOutputStream(new File("src/main/resources/PeriodicElements.xml")));
    }

    /**
     * Method called when the blueprint container is destroyed.
     */
    public void close()
   {
     LOG.info("Sample-appProvider Closed");
  }
    public PeriodicTable gePeriodicTable(){
    	return periodicTable;
    }

   public  PeriodicTable parseCsvFile(InputStream input){
    	ColumnPositionMappingStrategy <CsvElement> strategy = new ColumnPositionMappingStrategy<>();
    	strategy.setType(CsvElement.class);
    	List<CsvElement> csvelements = new CsvToBean<CsvElement>().parse(strategy, new TrimCsvReader(new InputStreamReader(input)));
    	csvelements.forEach(element -> LOG.info("{}", element));
    	PeriodicTable periodictable = new PeriodicTable();
    	periodictable.setCsvElement(csvelements);
		return periodicTable;

    }
     public void saveCsvFile(PeriodicTable periodicTable, String format, OutputStream outputStream){
    	try{
    		Map<String, Object> properties = new HashMap<String, Object>(2);
    		properties.put(JAXBContextProperties.MEDIA_TYPE, format);
    		properties.put(JAXBContextProperties.JSON_WRAPPER_AS_ARRAY_NAME, true);
    		JAXBContext jaxbContext = org.eclipse.persistence.jaxb.JAXBContext.newInstance("org.opendaylight.application.impl", PeriodicTable.class.getClassLoader(), properties);
    		Marshaller marshaller = jaxbContext.createMarshaller();
    		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,  true);
    		marshaller.marshal(periodicTable, outputStream);
    	}catch(JAXBException e){
    		LOG.error("Cannot marshal periodic table to {}", format, e);
    	}
    }

}
