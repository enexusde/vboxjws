
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VBoxEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VBoxEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="Any"/>
 *     &lt;enumeration value="Vetoable"/>
 *     &lt;enumeration value="MachineEvent"/>
 *     &lt;enumeration value="SnapshotEvent"/>
 *     &lt;enumeration value="InputEvent"/>
 *     &lt;enumeration value="LastWildcard"/>
 *     &lt;enumeration value="OnMachineStateChanged"/>
 *     &lt;enumeration value="OnMachineDataChanged"/>
 *     &lt;enumeration value="OnExtraDataChanged"/>
 *     &lt;enumeration value="OnExtraDataCanChange"/>
 *     &lt;enumeration value="OnMediumRegistered"/>
 *     &lt;enumeration value="OnMachineRegistered"/>
 *     &lt;enumeration value="OnSessionStateChanged"/>
 *     &lt;enumeration value="OnSnapshotTaken"/>
 *     &lt;enumeration value="OnSnapshotDeleted"/>
 *     &lt;enumeration value="OnSnapshotChanged"/>
 *     &lt;enumeration value="OnGuestPropertyChanged"/>
 *     &lt;enumeration value="OnMousePointerShapeChanged"/>
 *     &lt;enumeration value="OnMouseCapabilityChanged"/>
 *     &lt;enumeration value="OnKeyboardLedsChanged"/>
 *     &lt;enumeration value="OnStateChanged"/>
 *     &lt;enumeration value="OnAdditionsStateChanged"/>
 *     &lt;enumeration value="OnNetworkAdapterChanged"/>
 *     &lt;enumeration value="OnSerialPortChanged"/>
 *     &lt;enumeration value="OnParallelPortChanged"/>
 *     &lt;enumeration value="OnStorageControllerChanged"/>
 *     &lt;enumeration value="OnMediumChanged"/>
 *     &lt;enumeration value="OnVRDEServerChanged"/>
 *     &lt;enumeration value="OnUSBControllerChanged"/>
 *     &lt;enumeration value="OnUSBDeviceStateChanged"/>
 *     &lt;enumeration value="OnSharedFolderChanged"/>
 *     &lt;enumeration value="OnRuntimeError"/>
 *     &lt;enumeration value="OnCanShowWindow"/>
 *     &lt;enumeration value="OnShowWindow"/>
 *     &lt;enumeration value="OnCPUChanged"/>
 *     &lt;enumeration value="OnVRDEServerInfoChanged"/>
 *     &lt;enumeration value="OnEventSourceChanged"/>
 *     &lt;enumeration value="OnCPUExecutionCapChanged"/>
 *     &lt;enumeration value="OnGuestKeyboard"/>
 *     &lt;enumeration value="OnGuestMouse"/>
 *     &lt;enumeration value="OnNATRedirect"/>
 *     &lt;enumeration value="OnHostPCIDevicePlug"/>
 *     &lt;enumeration value="OnVBoxSVCAvailabilityChanged"/>
 *     &lt;enumeration value="OnBandwidthGroupChanged"/>
 *     &lt;enumeration value="OnGuestMonitorChanged"/>
 *     &lt;enumeration value="OnStorageDeviceChanged"/>
 *     &lt;enumeration value="OnClipboardModeChanged"/>
 *     &lt;enumeration value="OnDnDModeChanged"/>
 *     &lt;enumeration value="OnNATNetworkChanged"/>
 *     &lt;enumeration value="OnNATNetworkStartStop"/>
 *     &lt;enumeration value="OnNATNetworkAlter"/>
 *     &lt;enumeration value="OnNATNetworkCreationDeletion"/>
 *     &lt;enumeration value="OnNATNetworkSetting"/>
 *     &lt;enumeration value="OnNATNetworkPortForward"/>
 *     &lt;enumeration value="OnGuestSessionStateChanged"/>
 *     &lt;enumeration value="OnGuestSessionRegistered"/>
 *     &lt;enumeration value="OnGuestProcessRegistered"/>
 *     &lt;enumeration value="OnGuestProcessStateChanged"/>
 *     &lt;enumeration value="OnGuestProcessInputNotify"/>
 *     &lt;enumeration value="OnGuestProcessOutput"/>
 *     &lt;enumeration value="OnGuestFileRegistered"/>
 *     &lt;enumeration value="OnGuestFileStateChanged"/>
 *     &lt;enumeration value="OnGuestFileOffsetChanged"/>
 *     &lt;enumeration value="OnGuestFileRead"/>
 *     &lt;enumeration value="OnGuestFileWrite"/>
 *     &lt;enumeration value="OnRecordingChanged"/>
 *     &lt;enumeration value="OnGuestUserStateChanged"/>
 *     &lt;enumeration value="OnGuestMultiTouch"/>
 *     &lt;enumeration value="OnHostNameResolutionConfigurationChange"/>
 *     &lt;enumeration value="OnSnapshotRestored"/>
 *     &lt;enumeration value="OnMediumConfigChanged"/>
 *     &lt;enumeration value="OnAudioAdapterChanged"/>
 *     &lt;enumeration value="OnProgressPercentageChanged"/>
 *     &lt;enumeration value="OnProgressTaskCompleted"/>
 *     &lt;enumeration value="OnCursorPositionChanged"/>
 *     &lt;enumeration value="OnGuestAdditionsStatusChanged"/>
 *     &lt;enumeration value="OnGuestMonitorInfoChanged"/>
 *     &lt;enumeration value="OnGuestFileSizeChanged"/>
 *     &lt;enumeration value="OnClipboardFileTransferModeChanged"/>
 *     &lt;enumeration value="OnCloudProviderListChanged"/>
 *     &lt;enumeration value="OnCloudProviderRegistered"/>
 *     &lt;enumeration value="OnCloudProviderUninstall"/>
 *     &lt;enumeration value="OnCloudProfileRegistered"/>
 *     &lt;enumeration value="OnCloudProfileChanged"/>
 *     &lt;enumeration value="OnProgressCreated"/>
 *     &lt;enumeration value="OnLanguageChanged"/>
 *     &lt;enumeration value="OnUpdateAgentAvailable"/>
 *     &lt;enumeration value="OnUpdateAgentError"/>
 *     &lt;enumeration value="OnUpdateAgentSettingsChanged"/>
 *     &lt;enumeration value="OnUpdateAgentStateChanged"/>
 *     &lt;enumeration value="OnHostAudioDeviceChanged"/>
 *     &lt;enumeration value="OnGuestDebugControlChanged"/>
 *     &lt;enumeration value="OnMachineGroupsChanged"/>
 *     &lt;enumeration value="End"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VBoxEventType")
@XmlEnum
public enum VBoxEventType {

    @XmlEnumValue("Invalid")
    INVALID("Invalid"),
    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Vetoable")
    VETOABLE("Vetoable"),
    @XmlEnumValue("MachineEvent")
    MACHINE_EVENT("MachineEvent"),
    @XmlEnumValue("SnapshotEvent")
    SNAPSHOT_EVENT("SnapshotEvent"),
    @XmlEnumValue("InputEvent")
    INPUT_EVENT("InputEvent"),
    @XmlEnumValue("LastWildcard")
    LAST_WILDCARD("LastWildcard"),
    @XmlEnumValue("OnMachineStateChanged")
    ON_MACHINE_STATE_CHANGED("OnMachineStateChanged"),
    @XmlEnumValue("OnMachineDataChanged")
    ON_MACHINE_DATA_CHANGED("OnMachineDataChanged"),
    @XmlEnumValue("OnExtraDataChanged")
    ON_EXTRA_DATA_CHANGED("OnExtraDataChanged"),
    @XmlEnumValue("OnExtraDataCanChange")
    ON_EXTRA_DATA_CAN_CHANGE("OnExtraDataCanChange"),
    @XmlEnumValue("OnMediumRegistered")
    ON_MEDIUM_REGISTERED("OnMediumRegistered"),
    @XmlEnumValue("OnMachineRegistered")
    ON_MACHINE_REGISTERED("OnMachineRegistered"),
    @XmlEnumValue("OnSessionStateChanged")
    ON_SESSION_STATE_CHANGED("OnSessionStateChanged"),
    @XmlEnumValue("OnSnapshotTaken")
    ON_SNAPSHOT_TAKEN("OnSnapshotTaken"),
    @XmlEnumValue("OnSnapshotDeleted")
    ON_SNAPSHOT_DELETED("OnSnapshotDeleted"),
    @XmlEnumValue("OnSnapshotChanged")
    ON_SNAPSHOT_CHANGED("OnSnapshotChanged"),
    @XmlEnumValue("OnGuestPropertyChanged")
    ON_GUEST_PROPERTY_CHANGED("OnGuestPropertyChanged"),
    @XmlEnumValue("OnMousePointerShapeChanged")
    ON_MOUSE_POINTER_SHAPE_CHANGED("OnMousePointerShapeChanged"),
    @XmlEnumValue("OnMouseCapabilityChanged")
    ON_MOUSE_CAPABILITY_CHANGED("OnMouseCapabilityChanged"),
    @XmlEnumValue("OnKeyboardLedsChanged")
    ON_KEYBOARD_LEDS_CHANGED("OnKeyboardLedsChanged"),
    @XmlEnumValue("OnStateChanged")
    ON_STATE_CHANGED("OnStateChanged"),
    @XmlEnumValue("OnAdditionsStateChanged")
    ON_ADDITIONS_STATE_CHANGED("OnAdditionsStateChanged"),
    @XmlEnumValue("OnNetworkAdapterChanged")
    ON_NETWORK_ADAPTER_CHANGED("OnNetworkAdapterChanged"),
    @XmlEnumValue("OnSerialPortChanged")
    ON_SERIAL_PORT_CHANGED("OnSerialPortChanged"),
    @XmlEnumValue("OnParallelPortChanged")
    ON_PARALLEL_PORT_CHANGED("OnParallelPortChanged"),
    @XmlEnumValue("OnStorageControllerChanged")
    ON_STORAGE_CONTROLLER_CHANGED("OnStorageControllerChanged"),
    @XmlEnumValue("OnMediumChanged")
    ON_MEDIUM_CHANGED("OnMediumChanged"),
    @XmlEnumValue("OnVRDEServerChanged")
    ON_VRDE_SERVER_CHANGED("OnVRDEServerChanged"),
    @XmlEnumValue("OnUSBControllerChanged")
    ON_USB_CONTROLLER_CHANGED("OnUSBControllerChanged"),
    @XmlEnumValue("OnUSBDeviceStateChanged")
    ON_USB_DEVICE_STATE_CHANGED("OnUSBDeviceStateChanged"),
    @XmlEnumValue("OnSharedFolderChanged")
    ON_SHARED_FOLDER_CHANGED("OnSharedFolderChanged"),
    @XmlEnumValue("OnRuntimeError")
    ON_RUNTIME_ERROR("OnRuntimeError"),
    @XmlEnumValue("OnCanShowWindow")
    ON_CAN_SHOW_WINDOW("OnCanShowWindow"),
    @XmlEnumValue("OnShowWindow")
    ON_SHOW_WINDOW("OnShowWindow"),
    @XmlEnumValue("OnCPUChanged")
    ON_CPU_CHANGED("OnCPUChanged"),
    @XmlEnumValue("OnVRDEServerInfoChanged")
    ON_VRDE_SERVER_INFO_CHANGED("OnVRDEServerInfoChanged"),
    @XmlEnumValue("OnEventSourceChanged")
    ON_EVENT_SOURCE_CHANGED("OnEventSourceChanged"),
    @XmlEnumValue("OnCPUExecutionCapChanged")
    ON_CPU_EXECUTION_CAP_CHANGED("OnCPUExecutionCapChanged"),
    @XmlEnumValue("OnGuestKeyboard")
    ON_GUEST_KEYBOARD("OnGuestKeyboard"),
    @XmlEnumValue("OnGuestMouse")
    ON_GUEST_MOUSE("OnGuestMouse"),
    @XmlEnumValue("OnNATRedirect")
    ON_NAT_REDIRECT("OnNATRedirect"),
    @XmlEnumValue("OnHostPCIDevicePlug")
    ON_HOST_PCI_DEVICE_PLUG("OnHostPCIDevicePlug"),
    @XmlEnumValue("OnVBoxSVCAvailabilityChanged")
    ON_V_BOX_SVC_AVAILABILITY_CHANGED("OnVBoxSVCAvailabilityChanged"),
    @XmlEnumValue("OnBandwidthGroupChanged")
    ON_BANDWIDTH_GROUP_CHANGED("OnBandwidthGroupChanged"),
    @XmlEnumValue("OnGuestMonitorChanged")
    ON_GUEST_MONITOR_CHANGED("OnGuestMonitorChanged"),
    @XmlEnumValue("OnStorageDeviceChanged")
    ON_STORAGE_DEVICE_CHANGED("OnStorageDeviceChanged"),
    @XmlEnumValue("OnClipboardModeChanged")
    ON_CLIPBOARD_MODE_CHANGED("OnClipboardModeChanged"),
    @XmlEnumValue("OnDnDModeChanged")
    ON_DN_D_MODE_CHANGED("OnDnDModeChanged"),
    @XmlEnumValue("OnNATNetworkChanged")
    ON_NAT_NETWORK_CHANGED("OnNATNetworkChanged"),
    @XmlEnumValue("OnNATNetworkStartStop")
    ON_NAT_NETWORK_START_STOP("OnNATNetworkStartStop"),
    @XmlEnumValue("OnNATNetworkAlter")
    ON_NAT_NETWORK_ALTER("OnNATNetworkAlter"),
    @XmlEnumValue("OnNATNetworkCreationDeletion")
    ON_NAT_NETWORK_CREATION_DELETION("OnNATNetworkCreationDeletion"),
    @XmlEnumValue("OnNATNetworkSetting")
    ON_NAT_NETWORK_SETTING("OnNATNetworkSetting"),
    @XmlEnumValue("OnNATNetworkPortForward")
    ON_NAT_NETWORK_PORT_FORWARD("OnNATNetworkPortForward"),
    @XmlEnumValue("OnGuestSessionStateChanged")
    ON_GUEST_SESSION_STATE_CHANGED("OnGuestSessionStateChanged"),
    @XmlEnumValue("OnGuestSessionRegistered")
    ON_GUEST_SESSION_REGISTERED("OnGuestSessionRegistered"),
    @XmlEnumValue("OnGuestProcessRegistered")
    ON_GUEST_PROCESS_REGISTERED("OnGuestProcessRegistered"),
    @XmlEnumValue("OnGuestProcessStateChanged")
    ON_GUEST_PROCESS_STATE_CHANGED("OnGuestProcessStateChanged"),
    @XmlEnumValue("OnGuestProcessInputNotify")
    ON_GUEST_PROCESS_INPUT_NOTIFY("OnGuestProcessInputNotify"),
    @XmlEnumValue("OnGuestProcessOutput")
    ON_GUEST_PROCESS_OUTPUT("OnGuestProcessOutput"),
    @XmlEnumValue("OnGuestFileRegistered")
    ON_GUEST_FILE_REGISTERED("OnGuestFileRegistered"),
    @XmlEnumValue("OnGuestFileStateChanged")
    ON_GUEST_FILE_STATE_CHANGED("OnGuestFileStateChanged"),
    @XmlEnumValue("OnGuestFileOffsetChanged")
    ON_GUEST_FILE_OFFSET_CHANGED("OnGuestFileOffsetChanged"),
    @XmlEnumValue("OnGuestFileRead")
    ON_GUEST_FILE_READ("OnGuestFileRead"),
    @XmlEnumValue("OnGuestFileWrite")
    ON_GUEST_FILE_WRITE("OnGuestFileWrite"),
    @XmlEnumValue("OnRecordingChanged")
    ON_RECORDING_CHANGED("OnRecordingChanged"),
    @XmlEnumValue("OnGuestUserStateChanged")
    ON_GUEST_USER_STATE_CHANGED("OnGuestUserStateChanged"),
    @XmlEnumValue("OnGuestMultiTouch")
    ON_GUEST_MULTI_TOUCH("OnGuestMultiTouch"),
    @XmlEnumValue("OnHostNameResolutionConfigurationChange")
    ON_HOST_NAME_RESOLUTION_CONFIGURATION_CHANGE("OnHostNameResolutionConfigurationChange"),
    @XmlEnumValue("OnSnapshotRestored")
    ON_SNAPSHOT_RESTORED("OnSnapshotRestored"),
    @XmlEnumValue("OnMediumConfigChanged")
    ON_MEDIUM_CONFIG_CHANGED("OnMediumConfigChanged"),
    @XmlEnumValue("OnAudioAdapterChanged")
    ON_AUDIO_ADAPTER_CHANGED("OnAudioAdapterChanged"),
    @XmlEnumValue("OnProgressPercentageChanged")
    ON_PROGRESS_PERCENTAGE_CHANGED("OnProgressPercentageChanged"),
    @XmlEnumValue("OnProgressTaskCompleted")
    ON_PROGRESS_TASK_COMPLETED("OnProgressTaskCompleted"),
    @XmlEnumValue("OnCursorPositionChanged")
    ON_CURSOR_POSITION_CHANGED("OnCursorPositionChanged"),
    @XmlEnumValue("OnGuestAdditionsStatusChanged")
    ON_GUEST_ADDITIONS_STATUS_CHANGED("OnGuestAdditionsStatusChanged"),
    @XmlEnumValue("OnGuestMonitorInfoChanged")
    ON_GUEST_MONITOR_INFO_CHANGED("OnGuestMonitorInfoChanged"),
    @XmlEnumValue("OnGuestFileSizeChanged")
    ON_GUEST_FILE_SIZE_CHANGED("OnGuestFileSizeChanged"),
    @XmlEnumValue("OnClipboardFileTransferModeChanged")
    ON_CLIPBOARD_FILE_TRANSFER_MODE_CHANGED("OnClipboardFileTransferModeChanged"),
    @XmlEnumValue("OnCloudProviderListChanged")
    ON_CLOUD_PROVIDER_LIST_CHANGED("OnCloudProviderListChanged"),
    @XmlEnumValue("OnCloudProviderRegistered")
    ON_CLOUD_PROVIDER_REGISTERED("OnCloudProviderRegistered"),
    @XmlEnumValue("OnCloudProviderUninstall")
    ON_CLOUD_PROVIDER_UNINSTALL("OnCloudProviderUninstall"),
    @XmlEnumValue("OnCloudProfileRegistered")
    ON_CLOUD_PROFILE_REGISTERED("OnCloudProfileRegistered"),
    @XmlEnumValue("OnCloudProfileChanged")
    ON_CLOUD_PROFILE_CHANGED("OnCloudProfileChanged"),
    @XmlEnumValue("OnProgressCreated")
    ON_PROGRESS_CREATED("OnProgressCreated"),
    @XmlEnumValue("OnLanguageChanged")
    ON_LANGUAGE_CHANGED("OnLanguageChanged"),
    @XmlEnumValue("OnUpdateAgentAvailable")
    ON_UPDATE_AGENT_AVAILABLE("OnUpdateAgentAvailable"),
    @XmlEnumValue("OnUpdateAgentError")
    ON_UPDATE_AGENT_ERROR("OnUpdateAgentError"),
    @XmlEnumValue("OnUpdateAgentSettingsChanged")
    ON_UPDATE_AGENT_SETTINGS_CHANGED("OnUpdateAgentSettingsChanged"),
    @XmlEnumValue("OnUpdateAgentStateChanged")
    ON_UPDATE_AGENT_STATE_CHANGED("OnUpdateAgentStateChanged"),
    @XmlEnumValue("OnHostAudioDeviceChanged")
    ON_HOST_AUDIO_DEVICE_CHANGED("OnHostAudioDeviceChanged"),
    @XmlEnumValue("OnGuestDebugControlChanged")
    ON_GUEST_DEBUG_CONTROL_CHANGED("OnGuestDebugControlChanged"),
    @XmlEnumValue("OnMachineGroupsChanged")
    ON_MACHINE_GROUPS_CHANGED("OnMachineGroupsChanged"),
    @XmlEnumValue("End")
    END("End");
    private final String value;

    VBoxEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VBoxEventType fromValue(String v) {
        for (VBoxEventType c: VBoxEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
