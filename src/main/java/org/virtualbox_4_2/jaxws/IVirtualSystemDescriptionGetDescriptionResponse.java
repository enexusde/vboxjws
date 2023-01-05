
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
 *         &lt;element name="aTypes" type="{http://www.virtualbox.org/}VirtualSystemDescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aRefs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aOvfValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aVBoxValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aExtraConfigValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "aTypes", "aRefs", "aOvfValues", "avBoxValues", "aExtraConfigValues" })
@XmlRootElement(name = "IVirtualSystemDescription_getDescriptionResponse")
public class IVirtualSystemDescriptionGetDescriptionResponse {

	protected List<VirtualSystemDescriptionType> aTypes;
	protected List<String> aRefs;
	protected List<String> aOvfValues;
	@XmlElement(name = "aVBoxValues")
	protected List<String> avBoxValues;
	protected List<String> aExtraConfigValues;

	/**
	 * Gets the value of the aTypes property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the aTypes property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getATypes().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link VirtualSystemDescriptionType }
	 * 
	 * 
	 */
	public List<VirtualSystemDescriptionType> getATypes() {
		if (aTypes == null) {
			aTypes = new ArrayList<VirtualSystemDescriptionType>();
		}
		return this.aTypes;
	}

	/**
	 * Gets the value of the aRefs property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the aRefs property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getARefs().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getARefs() {
		if (aRefs == null) {
			aRefs = new ArrayList<String>();
		}
		return this.aRefs;
	}

	/**
	 * Gets the value of the aOvfValues property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the aOvfValues property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAOvfValues().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getAOvfValues() {
		if (aOvfValues == null) {
			aOvfValues = new ArrayList<String>();
		}
		return this.aOvfValues;
	}

	/**
	 * Gets the value of the avBoxValues property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the avBoxValues property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAVBoxValues().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getAVBoxValues() {
		if (avBoxValues == null) {
			avBoxValues = new ArrayList<String>();
		}
		return this.avBoxValues;
	}

	/**
	 * Gets the value of the aExtraConfigValues property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the aExtraConfigValues property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAExtraConfigValues().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getAExtraConfigValues() {
		if (aExtraConfigValues == null) {
			aExtraConfigValues = new ArrayList<String>();
		}
		return this.aExtraConfigValues;
	}

}
