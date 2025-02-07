//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.05 at 03:22:44 PM KST 
//

package org.oliot.epcis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Subscribe complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Subscribe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="params" type="{urn:epcglobal:epcis-query:xsd:2}QueryParams"/>
 *         &lt;element name="dest" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="controls" type="{urn:epcglobal:epcis-query:xsd:2}SubscriptionControls"/>
 *         &lt;element name="subscriptionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscribe", namespace = "urn:epcglobal:epcis-query:xsd:2", propOrder = { "queryName", "params", "dest",
		"controls", "subscriptionID" })
public class Subscribe {

	@XmlElement(required = true)
	protected String queryName;
	@XmlElement(required = true)
	protected QueryParams params;
	@XmlElement(required = true)
	@XmlSchemaType(name = "anyURI")
	protected String dest;
	@XmlElement(required = true)
	protected SubscriptionControls controls;
	@XmlElement(required = true)
	protected String subscriptionID;

	/**
	 * Gets the value of the queryName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQueryName() {
		return queryName;
	}

	/**
	 * Sets the value of the queryName property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setQueryName(String value) {
		this.queryName = value;
	}

	/**
	 * Gets the value of the params property.
	 * 
	 * @return possible object is {@link QueryParams }
	 * 
	 */
	public QueryParams getParams() {
		return params;
	}

	/**
	 * Sets the value of the params property.
	 * 
	 * @param value allowed object is {@link QueryParams }
	 * 
	 */
	public void setParams(QueryParams value) {
		this.params = value;
	}

	/**
	 * Gets the value of the dest property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDest() {
		return dest;
	}

	/**
	 * Sets the value of the dest property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDest(String value) {
		this.dest = value;
	}

	/**
	 * Gets the value of the controls property.
	 * 
	 * @return possible object is {@link SubscriptionControls }
	 * 
	 */
	public SubscriptionControls getControls() {
		return controls;
	}

	/**
	 * Sets the value of the controls property.
	 * 
	 * @param value allowed object is {@link SubscriptionControls }
	 * 
	 */
	public void setControls(SubscriptionControls value) {
		this.controls = value;
	}

	/**
	 * Gets the value of the subscriptionID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSubscriptionID() {
		return subscriptionID;
	}

	/**
	 * Sets the value of the subscriptionID property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSubscriptionID(String value) {
		this.subscriptionID = value;
	}

}
