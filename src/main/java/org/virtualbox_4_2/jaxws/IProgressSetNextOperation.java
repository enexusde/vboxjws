
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nextOperationDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nextOperationsWeight" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_this", "nextOperationDescription", "nextOperationsWeight" })
@XmlRootElement(name = "IProgress_setNextOperation")
public class IProgressSetNextOperation {

	@XmlElement(required = true)
	protected String _this;
	@XmlElement(required = true)
	protected String nextOperationDescription;
	@XmlSchemaType(name = "unsignedInt")
	protected long nextOperationsWeight;

	/**
	 * Gets the value of the this property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getThis() {
		return _this;
	}

	/**
	 * Sets the value of the this property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setThis(String value) {
		this._this = value;
	}

	/**
	 * Gets the value of the nextOperationDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNextOperationDescription() {
		return nextOperationDescription;
	}

	/**
	 * Sets the value of the nextOperationDescription property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setNextOperationDescription(String value) {
		this.nextOperationDescription = value;
	}

	/**
	 * Gets the value of the nextOperationsWeight property.
	 * 
	 */
	public long getNextOperationsWeight() {
		return nextOperationsWeight;
	}

	/**
	 * Sets the value of the nextOperationsWeight property.
	 * 
	 */
	public void setNextOperationsWeight(long value) {
		this.nextOperationsWeight = value;
	}

}
