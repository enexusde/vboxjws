
package org.virtualbox_4_2.jaxws;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="returnMetricNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnObjects" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnUnits" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnScales" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnSequenceNumbers" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnDataIndices" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnDataLengths" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnval" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "returnMetricNames", "returnObjects", "returnUnits", "returnScales",
		"returnSequenceNumbers", "returnDataIndices", "returnDataLengths", "returnval" })
@XmlRootElement(name = "IPerformanceCollector_queryMetricsDataResponse")
public class IPerformanceCollectorQueryMetricsDataResponse {

	protected List<String> returnMetricNames;
	protected List<String> returnObjects;
	protected List<String> returnUnits;
	@XmlElement(type = Long.class)
	@XmlSchemaType(name = "unsignedInt")
	protected List<Long> returnScales;
	@XmlElement(type = Long.class)
	@XmlSchemaType(name = "unsignedInt")
	protected List<Long> returnSequenceNumbers;
	@XmlElement(type = Long.class)
	@XmlSchemaType(name = "unsignedInt")
	protected List<Long> returnDataIndices;
	@XmlElement(type = Long.class)
	@XmlSchemaType(name = "unsignedInt")
	protected List<Long> returnDataLengths;
	@XmlElement(type = Integer.class)
	protected List<Integer> returnval;

	/**
	 * Gets the value of the returnMetricNames property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the returnMetricNames property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getReturnMetricNames().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getReturnMetricNames() {
		if (returnMetricNames == null) {
			returnMetricNames = new ArrayList<String>();
		}
		return this.returnMetricNames;
	}

	/**
	 * Gets the value of the returnObjects property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the returnObjects property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getReturnObjects().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getReturnObjects() {
		if (returnObjects == null) {
			returnObjects = new ArrayList<String>();
		}
		return this.returnObjects;
	}

	/**
	 * Gets the value of the returnUnits property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the returnUnits property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getReturnUnits().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getReturnUnits() {
		if (returnUnits == null) {
			returnUnits = new ArrayList<String>();
		}
		return this.returnUnits;
	}

	/**
	 * Gets the value of the returnScales property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the returnScales property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getReturnScales().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Long }
	 * 
	 * 
	 */
	public List<Long> getReturnScales() {
		if (returnScales == null) {
			returnScales = new ArrayList<Long>();
		}
		return this.returnScales;
	}

	/**
	 * Gets the value of the returnSequenceNumbers property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the returnSequenceNumbers property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getReturnSequenceNumbers().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Long }
	 * 
	 * 
	 */
	public List<Long> getReturnSequenceNumbers() {
		if (returnSequenceNumbers == null) {
			returnSequenceNumbers = new ArrayList<Long>();
		}
		return this.returnSequenceNumbers;
	}

	/**
	 * Gets the value of the returnDataIndices property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the returnDataIndices property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getReturnDataIndices().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Long }
	 * 
	 * 
	 */
	public List<Long> getReturnDataIndices() {
		if (returnDataIndices == null) {
			returnDataIndices = new ArrayList<Long>();
		}
		return this.returnDataIndices;
	}

	/**
	 * Gets the value of the returnDataLengths property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the returnDataLengths property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getReturnDataLengths().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Long }
	 * 
	 * 
	 */
	public List<Long> getReturnDataLengths() {
		if (returnDataLengths == null) {
			returnDataLengths = new ArrayList<Long>();
		}
		return this.returnDataLengths;
	}

	/**
	 * Gets the value of the returnval property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the returnval property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getReturnval().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Integer }
	 * 
	 * 
	 */
	public List<Integer> getReturnval() {
		if (returnval == null) {
			returnval = new ArrayList<Integer>();
		}
		return this.returnval;
	}

}
