
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IHostDrivePartition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IHostDrivePartition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="type" type="{http://www.virtualbox.org/}PartitionType"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="typeMBR" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="startCylinder" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="startHead" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="startSector" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="endCylinder" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="endHead" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="endSector" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="typeUuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IHostDrivePartition", propOrder = {
    "number",
    "size",
    "start",
    "type",
    "active",
    "typeMBR",
    "startCylinder",
    "startHead",
    "startSector",
    "endCylinder",
    "endHead",
    "endSector",
    "typeUuid",
    "uuid",
    "name"
})
public class IHostDrivePartition {

    @XmlSchemaType(name = "unsignedInt")
    protected long number;
    protected long size;
    protected long start;
    @XmlElement(required = true)
    protected PartitionType type;
    protected boolean active;
    @XmlSchemaType(name = "unsignedInt")
    protected long typeMBR;
    @XmlSchemaType(name = "unsignedInt")
    protected long startCylinder;
    @XmlSchemaType(name = "unsignedInt")
    protected long startHead;
    @XmlSchemaType(name = "unsignedInt")
    protected long startSector;
    @XmlSchemaType(name = "unsignedInt")
    protected long endCylinder;
    @XmlSchemaType(name = "unsignedInt")
    protected long endHead;
    @XmlSchemaType(name = "unsignedInt")
    protected long endSector;
    @XmlElement(required = true)
    protected String typeUuid;
    @XmlElement(required = true)
    protected String uuid;
    @XmlElement(required = true)
    protected String name;

    /**
     * Gets the value of the number property.
     * 
     */
    public long getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(long value) {
        this.number = value;
    }

    /**
     * Gets the value of the size property.
     * 
     */
    public long getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(long value) {
        this.size = value;
    }

    /**
     * Gets the value of the start property.
     * 
     */
    public long getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     */
    public void setStart(long value) {
        this.start = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PartitionType }
     *     
     */
    public PartitionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartitionType }
     *     
     */
    public void setType(PartitionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the typeMBR property.
     * 
     */
    public long getTypeMBR() {
        return typeMBR;
    }

    /**
     * Sets the value of the typeMBR property.
     * 
     */
    public void setTypeMBR(long value) {
        this.typeMBR = value;
    }

    /**
     * Gets the value of the startCylinder property.
     * 
     */
    public long getStartCylinder() {
        return startCylinder;
    }

    /**
     * Sets the value of the startCylinder property.
     * 
     */
    public void setStartCylinder(long value) {
        this.startCylinder = value;
    }

    /**
     * Gets the value of the startHead property.
     * 
     */
    public long getStartHead() {
        return startHead;
    }

    /**
     * Sets the value of the startHead property.
     * 
     */
    public void setStartHead(long value) {
        this.startHead = value;
    }

    /**
     * Gets the value of the startSector property.
     * 
     */
    public long getStartSector() {
        return startSector;
    }

    /**
     * Sets the value of the startSector property.
     * 
     */
    public void setStartSector(long value) {
        this.startSector = value;
    }

    /**
     * Gets the value of the endCylinder property.
     * 
     */
    public long getEndCylinder() {
        return endCylinder;
    }

    /**
     * Sets the value of the endCylinder property.
     * 
     */
    public void setEndCylinder(long value) {
        this.endCylinder = value;
    }

    /**
     * Gets the value of the endHead property.
     * 
     */
    public long getEndHead() {
        return endHead;
    }

    /**
     * Sets the value of the endHead property.
     * 
     */
    public void setEndHead(long value) {
        this.endHead = value;
    }

    /**
     * Gets the value of the endSector property.
     * 
     */
    public long getEndSector() {
        return endSector;
    }

    /**
     * Sets the value of the endSector property.
     * 
     */
    public void setEndSector(long value) {
        this.endSector = value;
    }

    /**
     * Gets the value of the typeUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeUuid() {
        return typeUuid;
    }

    /**
     * Sets the value of the typeUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeUuid(String value) {
        this.typeUuid = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
