/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.cdc.dhcs.hehr.dcp.direct.service;

import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.xml.namespace.QName;

/**
 *
 * @author sai
 */
public class DocumentRepositoryHandler implements SOAPHandler<SOAPMessageContext>{

    @Override
    public Set<QName> getHeaders() {
    	Set<QName> set = new HashSet<QName>();
    	set.add(new QName("http://www.w3.org/2005/08/addressing", "Action")); 
    	set.add(new QName("http://www.w3.org/2005/08/addressing", "To"));         
        return set; 
    }

    @Override
    public boolean handleMessage(SOAPMessageContext arg0) {
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext arg0) {
        return true;
    }

    @Override
    public void close(MessageContext arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
