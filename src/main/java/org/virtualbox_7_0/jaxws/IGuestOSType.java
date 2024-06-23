
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IGuestOSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IGuestOSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="familyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="familyDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="is64Bit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recommendedIOAPIC" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recommendedVirtEx" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recommendedRAM" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="recommendedGraphicsController" type="{http://www.virtualbox.org/}GraphicsControllerType"/>
 *         &lt;element name="recommendedVRAM" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="recommended2DVideoAcceleration" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recommended3DAcceleration" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recommendedHDD" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="adapterType" type="{http://www.virtualbox.org/}NetworkAdapterType"/>
 *         &lt;element name="recommendedPAE" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recommendedDVDStorageController" type="{http://www.virtualbox.org/}StorageControllerType"/>
 *         &lt;element name="recommendedDVDStorageBus" type="{http://www.virtualbox.org/}StorageBus"/>
 *         &lt;element name="recommendedHDStorageController" type="{http://www.virtualbox.org/}StorageControllerType"/>
 *         &lt;element name="recommendedHDStorageBus" type="{http://www.virtualbox.org/}StorageBus"/>
 *         &lt;element name="recommendedFirmware" type="{http://www.virtualbox.org/}FirmwareType"/>
 *         &lt;element name="recommendedUSBHID" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recommendedHPET" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recommendedUSBTablet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recommendedRTCUseUTC" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recommendedChipset" type="{http://www.virtualbox.org/}ChipsetType"/>
 *         &lt;element name="recommendedIommuType" type="{http://www.virtualbox.org/}IommuType"/>
 *         &lt;element name="recommendedAudioController" type="{http://www.virtualbox.org/}AudioControllerType"/>
 *         &lt;element name="recommendedAudioCodec" type="{http://www.virtualbox.org/}AudioCodecType"/>
 *         &lt;element name="recommendedFloppy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recommendedUSB" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recommendedUSB3" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recommendedTFReset" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recommendedX2APIC" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recommendedCPUCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="recommendedTpmType" type="{http://www.virtualbox.org/}TpmType"/>
 *         &lt;element name="recommendedSecureBoot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recommendedWDDMGraphics" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IGuestOSType", propOrder = {
    "familyId",
    "familyDescription",
    "id",
    "description",
    "is64Bit",
    "recommendedIOAPIC",
    "recommendedVirtEx",
    "recommendedRAM",
    "recommendedGraphicsController",
    "recommendedVRAM",
    "recommended2DVideoAcceleration",
    "recommended3DAcceleration",
    "recommendedHDD",
    "adapterType",
    "recommendedPAE",
    "recommendedDVDStorageController",
    "recommendedDVDStorageBus",
    "recommendedHDStorageController",
    "recommendedHDStorageBus",
    "recommendedFirmware",
    "recommendedUSBHID",
    "recommendedHPET",
    "recommendedUSBTablet",
    "recommendedRTCUseUTC",
    "recommendedChipset",
    "recommendedIommuType",
    "recommendedAudioController",
    "recommendedAudioCodec",
    "recommendedFloppy",
    "recommendedUSB",
    "recommendedUSB3",
    "recommendedTFReset",
    "recommendedX2APIC",
    "recommendedCPUCount",
    "recommendedTpmType",
    "recommendedSecureBoot",
    "recommendedWDDMGraphics"
})
public class IGuestOSType {

    @XmlElement(required = true)
    protected String familyId;
    @XmlElement(required = true)
    protected String familyDescription;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String description;
    protected boolean is64Bit;
    protected boolean recommendedIOAPIC;
    protected boolean recommendedVirtEx;
    @XmlSchemaType(name = "unsignedInt")
    protected long recommendedRAM;
    @XmlElement(required = true)
    protected GraphicsControllerType recommendedGraphicsController;
    @XmlSchemaType(name = "unsignedInt")
    protected long recommendedVRAM;
    protected boolean recommended2DVideoAcceleration;
    protected boolean recommended3DAcceleration;
    protected long recommendedHDD;
    @XmlElement(required = true)
    protected NetworkAdapterType adapterType;
    protected boolean recommendedPAE;
    @XmlElement(required = true)
    protected StorageControllerType recommendedDVDStorageController;
    @XmlElement(required = true)
    protected StorageBus recommendedDVDStorageBus;
    @XmlElement(required = true)
    protected StorageControllerType recommendedHDStorageController;
    @XmlElement(required = true)
    protected StorageBus recommendedHDStorageBus;
    @XmlElement(required = true)
    protected FirmwareType recommendedFirmware;
    protected boolean recommendedUSBHID;
    protected boolean recommendedHPET;
    protected boolean recommendedUSBTablet;
    protected boolean recommendedRTCUseUTC;
    @XmlElement(required = true)
    protected ChipsetType recommendedChipset;
    @XmlElement(required = true)
    protected IommuType recommendedIommuType;
    @XmlElement(required = true)
    protected AudioControllerType recommendedAudioController;
    @XmlElement(required = true)
    protected AudioCodecType recommendedAudioCodec;
    protected boolean recommendedFloppy;
    protected boolean recommendedUSB;
    protected boolean recommendedUSB3;
    protected boolean recommendedTFReset;
    protected boolean recommendedX2APIC;
    @XmlSchemaType(name = "unsignedInt")
    protected long recommendedCPUCount;
    @XmlElement(required = true)
    protected TpmType recommendedTpmType;
    protected boolean recommendedSecureBoot;
    protected boolean recommendedWDDMGraphics;

    /**
     * Gets the value of the familyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyId() {
        return familyId;
    }

    /**
     * Sets the value of the familyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyId(String value) {
        this.familyId = value;
    }

    /**
     * Gets the value of the familyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyDescription() {
        return familyDescription;
    }

    /**
     * Sets the value of the familyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyDescription(String value) {
        this.familyDescription = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the is64Bit property.
     * 
     */
    public boolean isIs64Bit() {
        return is64Bit;
    }

    /**
     * Sets the value of the is64Bit property.
     * 
     */
    public void setIs64Bit(boolean value) {
        this.is64Bit = value;
    }

    /**
     * Gets the value of the recommendedIOAPIC property.
     * 
     */
    public boolean isRecommendedIOAPIC() {
        return recommendedIOAPIC;
    }

    /**
     * Sets the value of the recommendedIOAPIC property.
     * 
     */
    public void setRecommendedIOAPIC(boolean value) {
        this.recommendedIOAPIC = value;
    }

    /**
     * Gets the value of the recommendedVirtEx property.
     * 
     */
    public boolean isRecommendedVirtEx() {
        return recommendedVirtEx;
    }

    /**
     * Sets the value of the recommendedVirtEx property.
     * 
     */
    public void setRecommendedVirtEx(boolean value) {
        this.recommendedVirtEx = value;
    }

    /**
     * Gets the value of the recommendedRAM property.
     * 
     */
    public long getRecommendedRAM() {
        return recommendedRAM;
    }

    /**
     * Sets the value of the recommendedRAM property.
     * 
     */
    public void setRecommendedRAM(long value) {
        this.recommendedRAM = value;
    }

    /**
     * Gets the value of the recommendedGraphicsController property.
     * 
     * @return
     *     possible object is
     *     {@link GraphicsControllerType }
     *     
     */
    public GraphicsControllerType getRecommendedGraphicsController() {
        return recommendedGraphicsController;
    }

    /**
     * Sets the value of the recommendedGraphicsController property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphicsControllerType }
     *     
     */
    public void setRecommendedGraphicsController(GraphicsControllerType value) {
        this.recommendedGraphicsController = value;
    }

    /**
     * Gets the value of the recommendedVRAM property.
     * 
     */
    public long getRecommendedVRAM() {
        return recommendedVRAM;
    }

    /**
     * Sets the value of the recommendedVRAM property.
     * 
     */
    public void setRecommendedVRAM(long value) {
        this.recommendedVRAM = value;
    }

    /**
     * Gets the value of the recommended2DVideoAcceleration property.
     * 
     */
    public boolean isRecommended2DVideoAcceleration() {
        return recommended2DVideoAcceleration;
    }

    /**
     * Sets the value of the recommended2DVideoAcceleration property.
     * 
     */
    public void setRecommended2DVideoAcceleration(boolean value) {
        this.recommended2DVideoAcceleration = value;
    }

    /**
     * Gets the value of the recommended3DAcceleration property.
     * 
     */
    public boolean isRecommended3DAcceleration() {
        return recommended3DAcceleration;
    }

    /**
     * Sets the value of the recommended3DAcceleration property.
     * 
     */
    public void setRecommended3DAcceleration(boolean value) {
        this.recommended3DAcceleration = value;
    }

    /**
     * Gets the value of the recommendedHDD property.
     * 
     */
    public long getRecommendedHDD() {
        return recommendedHDD;
    }

    /**
     * Sets the value of the recommendedHDD property.
     * 
     */
    public void setRecommendedHDD(long value) {
        this.recommendedHDD = value;
    }

    /**
     * Gets the value of the adapterType property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkAdapterType }
     *     
     */
    public NetworkAdapterType getAdapterType() {
        return adapterType;
    }

    /**
     * Sets the value of the adapterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkAdapterType }
     *     
     */
    public void setAdapterType(NetworkAdapterType value) {
        this.adapterType = value;
    }

    /**
     * Gets the value of the recommendedPAE property.
     * 
     */
    public boolean isRecommendedPAE() {
        return recommendedPAE;
    }

    /**
     * Sets the value of the recommendedPAE property.
     * 
     */
    public void setRecommendedPAE(boolean value) {
        this.recommendedPAE = value;
    }

    /**
     * Gets the value of the recommendedDVDStorageController property.
     * 
     * @return
     *     possible object is
     *     {@link StorageControllerType }
     *     
     */
    public StorageControllerType getRecommendedDVDStorageController() {
        return recommendedDVDStorageController;
    }

    /**
     * Sets the value of the recommendedDVDStorageController property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageControllerType }
     *     
     */
    public void setRecommendedDVDStorageController(StorageControllerType value) {
        this.recommendedDVDStorageController = value;
    }

    /**
     * Gets the value of the recommendedDVDStorageBus property.
     * 
     * @return
     *     possible object is
     *     {@link StorageBus }
     *     
     */
    public StorageBus getRecommendedDVDStorageBus() {
        return recommendedDVDStorageBus;
    }

    /**
     * Sets the value of the recommendedDVDStorageBus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageBus }
     *     
     */
    public void setRecommendedDVDStorageBus(StorageBus value) {
        this.recommendedDVDStorageBus = value;
    }

    /**
     * Gets the value of the recommendedHDStorageController property.
     * 
     * @return
     *     possible object is
     *     {@link StorageControllerType }
     *     
     */
    public StorageControllerType getRecommendedHDStorageController() {
        return recommendedHDStorageController;
    }

    /**
     * Sets the value of the recommendedHDStorageController property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageControllerType }
     *     
     */
    public void setRecommendedHDStorageController(StorageControllerType value) {
        this.recommendedHDStorageController = value;
    }

    /**
     * Gets the value of the recommendedHDStorageBus property.
     * 
     * @return
     *     possible object is
     *     {@link StorageBus }
     *     
     */
    public StorageBus getRecommendedHDStorageBus() {
        return recommendedHDStorageBus;
    }

    /**
     * Sets the value of the recommendedHDStorageBus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageBus }
     *     
     */
    public void setRecommendedHDStorageBus(StorageBus value) {
        this.recommendedHDStorageBus = value;
    }

    /**
     * Gets the value of the recommendedFirmware property.
     * 
     * @return
     *     possible object is
     *     {@link FirmwareType }
     *     
     */
    public FirmwareType getRecommendedFirmware() {
        return recommendedFirmware;
    }

    /**
     * Sets the value of the recommendedFirmware property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirmwareType }
     *     
     */
    public void setRecommendedFirmware(FirmwareType value) {
        this.recommendedFirmware = value;
    }

    /**
     * Gets the value of the recommendedUSBHID property.
     * 
     */
    public boolean isRecommendedUSBHID() {
        return recommendedUSBHID;
    }

    /**
     * Sets the value of the recommendedUSBHID property.
     * 
     */
    public void setRecommendedUSBHID(boolean value) {
        this.recommendedUSBHID = value;
    }

    /**
     * Gets the value of the recommendedHPET property.
     * 
     */
    public boolean isRecommendedHPET() {
        return recommendedHPET;
    }

    /**
     * Sets the value of the recommendedHPET property.
     * 
     */
    public void setRecommendedHPET(boolean value) {
        this.recommendedHPET = value;
    }

    /**
     * Gets the value of the recommendedUSBTablet property.
     * 
     */
    public boolean isRecommendedUSBTablet() {
        return recommendedUSBTablet;
    }

    /**
     * Sets the value of the recommendedUSBTablet property.
     * 
     */
    public void setRecommendedUSBTablet(boolean value) {
        this.recommendedUSBTablet = value;
    }

    /**
     * Gets the value of the recommendedRTCUseUTC property.
     * 
     */
    public boolean isRecommendedRTCUseUTC() {
        return recommendedRTCUseUTC;
    }

    /**
     * Sets the value of the recommendedRTCUseUTC property.
     * 
     */
    public void setRecommendedRTCUseUTC(boolean value) {
        this.recommendedRTCUseUTC = value;
    }

    /**
     * Gets the value of the recommendedChipset property.
     * 
     * @return
     *     possible object is
     *     {@link ChipsetType }
     *     
     */
    public ChipsetType getRecommendedChipset() {
        return recommendedChipset;
    }

    /**
     * Sets the value of the recommendedChipset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChipsetType }
     *     
     */
    public void setRecommendedChipset(ChipsetType value) {
        this.recommendedChipset = value;
    }

    /**
     * Gets the value of the recommendedIommuType property.
     * 
     * @return
     *     possible object is
     *     {@link IommuType }
     *     
     */
    public IommuType getRecommendedIommuType() {
        return recommendedIommuType;
    }

    /**
     * Sets the value of the recommendedIommuType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IommuType }
     *     
     */
    public void setRecommendedIommuType(IommuType value) {
        this.recommendedIommuType = value;
    }

    /**
     * Gets the value of the recommendedAudioController property.
     * 
     * @return
     *     possible object is
     *     {@link AudioControllerType }
     *     
     */
    public AudioControllerType getRecommendedAudioController() {
        return recommendedAudioController;
    }

    /**
     * Sets the value of the recommendedAudioController property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioControllerType }
     *     
     */
    public void setRecommendedAudioController(AudioControllerType value) {
        this.recommendedAudioController = value;
    }

    /**
     * Gets the value of the recommendedAudioCodec property.
     * 
     * @return
     *     possible object is
     *     {@link AudioCodecType }
     *     
     */
    public AudioCodecType getRecommendedAudioCodec() {
        return recommendedAudioCodec;
    }

    /**
     * Sets the value of the recommendedAudioCodec property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioCodecType }
     *     
     */
    public void setRecommendedAudioCodec(AudioCodecType value) {
        this.recommendedAudioCodec = value;
    }

    /**
     * Gets the value of the recommendedFloppy property.
     * 
     */
    public boolean isRecommendedFloppy() {
        return recommendedFloppy;
    }

    /**
     * Sets the value of the recommendedFloppy property.
     * 
     */
    public void setRecommendedFloppy(boolean value) {
        this.recommendedFloppy = value;
    }

    /**
     * Gets the value of the recommendedUSB property.
     * 
     */
    public boolean isRecommendedUSB() {
        return recommendedUSB;
    }

    /**
     * Sets the value of the recommendedUSB property.
     * 
     */
    public void setRecommendedUSB(boolean value) {
        this.recommendedUSB = value;
    }

    /**
     * Gets the value of the recommendedUSB3 property.
     * 
     */
    public boolean isRecommendedUSB3() {
        return recommendedUSB3;
    }

    /**
     * Sets the value of the recommendedUSB3 property.
     * 
     */
    public void setRecommendedUSB3(boolean value) {
        this.recommendedUSB3 = value;
    }

    /**
     * Gets the value of the recommendedTFReset property.
     * 
     */
    public boolean isRecommendedTFReset() {
        return recommendedTFReset;
    }

    /**
     * Sets the value of the recommendedTFReset property.
     * 
     */
    public void setRecommendedTFReset(boolean value) {
        this.recommendedTFReset = value;
    }

    /**
     * Gets the value of the recommendedX2APIC property.
     * 
     */
    public boolean isRecommendedX2APIC() {
        return recommendedX2APIC;
    }

    /**
     * Sets the value of the recommendedX2APIC property.
     * 
     */
    public void setRecommendedX2APIC(boolean value) {
        this.recommendedX2APIC = value;
    }

    /**
     * Gets the value of the recommendedCPUCount property.
     * 
     */
    public long getRecommendedCPUCount() {
        return recommendedCPUCount;
    }

    /**
     * Sets the value of the recommendedCPUCount property.
     * 
     */
    public void setRecommendedCPUCount(long value) {
        this.recommendedCPUCount = value;
    }

    /**
     * Gets the value of the recommendedTpmType property.
     * 
     * @return
     *     possible object is
     *     {@link TpmType }
     *     
     */
    public TpmType getRecommendedTpmType() {
        return recommendedTpmType;
    }

    /**
     * Sets the value of the recommendedTpmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpmType }
     *     
     */
    public void setRecommendedTpmType(TpmType value) {
        this.recommendedTpmType = value;
    }

    /**
     * Gets the value of the recommendedSecureBoot property.
     * 
     */
    public boolean isRecommendedSecureBoot() {
        return recommendedSecureBoot;
    }

    /**
     * Sets the value of the recommendedSecureBoot property.
     * 
     */
    public void setRecommendedSecureBoot(boolean value) {
        this.recommendedSecureBoot = value;
    }

    /**
     * Gets the value of the recommendedWDDMGraphics property.
     * 
     */
    public boolean isRecommendedWDDMGraphics() {
        return recommendedWDDMGraphics;
    }

    /**
     * Sets the value of the recommendedWDDMGraphics property.
     * 
     */
    public void setRecommendedWDDMGraphics(boolean value) {
        this.recommendedWDDMGraphics = value;
    }

}
