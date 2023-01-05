
package org.virtualbox_4_2.jaxws;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="target" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mode" type="{http://www.virtualbox.org/}CloneMode"/>
 *         &lt;element name="options" type="{http://www.virtualbox.org/}CloneOptions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_this", "target", "mode", "options" })
@XmlRootElement(name = "IMachine_cloneTo")
public class IMachineCloneTo {

	@XmlElement(required = true)
	protected String _this;
	@XmlElement(required = true)
	protected String target;
	@XmlElement(required = true)
	protected CloneMode mode;
	protected List<CloneOptions> options;

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
	 * Gets the value of the target property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * Sets the value of the target property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTarget(String value) {
		this.target = value;
	}

	/**
	 * Gets the value of the mode property.
	 * 
	 * @return possible object is {@link CloneMode }
	 * 
	 */
	public CloneMode getMode() {
		return mode;
	}

	/**
	 * Sets the value of the mode property.
	 * 
	 * @param value allowed object is {@link CloneMode }
	 * 
	 */
	public void setMode(CloneMode value) {
		this.mode = value;
	}

	/**
	 * Gets the value of the options property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the options property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getOptions().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link CloneOptions
	 * }
	 * 
	 * 
	 */
	public List<CloneOptions> getOptions() {
		if (options == null) {
			options = new ArrayList<CloneOptions>();
		}
		return this.options;
	}

}
