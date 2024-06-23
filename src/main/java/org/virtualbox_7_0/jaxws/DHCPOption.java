
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DHCPOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DHCPOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SubnetMask"/>
 *     &lt;enumeration value="TimeOffset"/>
 *     &lt;enumeration value="Routers"/>
 *     &lt;enumeration value="TimeServers"/>
 *     &lt;enumeration value="NameServers"/>
 *     &lt;enumeration value="DomainNameServers"/>
 *     &lt;enumeration value="LogServers"/>
 *     &lt;enumeration value="CookieServers"/>
 *     &lt;enumeration value="LPRServers"/>
 *     &lt;enumeration value="ImpressServers"/>
 *     &lt;enumeration value="ResourseLocationServers"/>
 *     &lt;enumeration value="HostName"/>
 *     &lt;enumeration value="BootFileSize"/>
 *     &lt;enumeration value="MeritDumpFile"/>
 *     &lt;enumeration value="DomainName"/>
 *     &lt;enumeration value="SwapServer"/>
 *     &lt;enumeration value="RootPath"/>
 *     &lt;enumeration value="ExtensionPath"/>
 *     &lt;enumeration value="IPForwarding"/>
 *     &lt;enumeration value="OptNonLocalSourceRouting"/>
 *     &lt;enumeration value="PolicyFilter"/>
 *     &lt;enumeration value="MaxDgramReassemblySize"/>
 *     &lt;enumeration value="DefaultIPTTL"/>
 *     &lt;enumeration value="PathMTUAgingTimeout"/>
 *     &lt;enumeration value="PathMTUPlateauTable"/>
 *     &lt;enumeration value="InterfaceMTU"/>
 *     &lt;enumeration value="AllSubnetsAreLocal"/>
 *     &lt;enumeration value="BroadcastAddress"/>
 *     &lt;enumeration value="PerformMaskDiscovery"/>
 *     &lt;enumeration value="MaskSupplier"/>
 *     &lt;enumeration value="PerformRouterDiscovery"/>
 *     &lt;enumeration value="RouterSolicitationAddress"/>
 *     &lt;enumeration value="StaticRoute"/>
 *     &lt;enumeration value="TrailerEncapsulation"/>
 *     &lt;enumeration value="ARPCacheTimeout"/>
 *     &lt;enumeration value="EthernetEncapsulation"/>
 *     &lt;enumeration value="TCPDefaultTTL"/>
 *     &lt;enumeration value="TCPKeepaliveInterval"/>
 *     &lt;enumeration value="TCPKeepaliveGarbage"/>
 *     &lt;enumeration value="NISDomain"/>
 *     &lt;enumeration value="NISServers"/>
 *     &lt;enumeration value="NTPServers"/>
 *     &lt;enumeration value="VendorSpecificInfo"/>
 *     &lt;enumeration value="NetBIOSNameServers"/>
 *     &lt;enumeration value="NetBIOSDatagramServers"/>
 *     &lt;enumeration value="NetBIOSNodeType"/>
 *     &lt;enumeration value="NetBIOSScope"/>
 *     &lt;enumeration value="XWindowsFontServers"/>
 *     &lt;enumeration value="XWindowsDisplayManager"/>
 *     &lt;enumeration value="NetWareIPDomainName"/>
 *     &lt;enumeration value="NetWareIPInformation"/>
 *     &lt;enumeration value="NISPlusDomain"/>
 *     &lt;enumeration value="NISPlusServers"/>
 *     &lt;enumeration value="TFTPServerName"/>
 *     &lt;enumeration value="BootfileName"/>
 *     &lt;enumeration value="MobileIPHomeAgents"/>
 *     &lt;enumeration value="SMTPServers"/>
 *     &lt;enumeration value="POP3Servers"/>
 *     &lt;enumeration value="NNTPServers"/>
 *     &lt;enumeration value="WWWServers"/>
 *     &lt;enumeration value="FingerServers"/>
 *     &lt;enumeration value="IRCServers"/>
 *     &lt;enumeration value="StreetTalkServers"/>
 *     &lt;enumeration value="STDAServers"/>
 *     &lt;enumeration value="SLPDirectoryAgent"/>
 *     &lt;enumeration value="SLPServiceScope"/>
 *     &lt;enumeration value="DomainSearch"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DHCPOption")
@XmlEnum
public enum DHCPOption {

    @XmlEnumValue("SubnetMask")
    SUBNET_MASK("SubnetMask"),
    @XmlEnumValue("TimeOffset")
    TIME_OFFSET("TimeOffset"),
    @XmlEnumValue("Routers")
    ROUTERS("Routers"),
    @XmlEnumValue("TimeServers")
    TIME_SERVERS("TimeServers"),
    @XmlEnumValue("NameServers")
    NAME_SERVERS("NameServers"),
    @XmlEnumValue("DomainNameServers")
    DOMAIN_NAME_SERVERS("DomainNameServers"),
    @XmlEnumValue("LogServers")
    LOG_SERVERS("LogServers"),
    @XmlEnumValue("CookieServers")
    COOKIE_SERVERS("CookieServers"),
    @XmlEnumValue("LPRServers")
    LPR_SERVERS("LPRServers"),
    @XmlEnumValue("ImpressServers")
    IMPRESS_SERVERS("ImpressServers"),
    @XmlEnumValue("ResourseLocationServers")
    RESOURSE_LOCATION_SERVERS("ResourseLocationServers"),
    @XmlEnumValue("HostName")
    HOST_NAME("HostName"),
    @XmlEnumValue("BootFileSize")
    BOOT_FILE_SIZE("BootFileSize"),
    @XmlEnumValue("MeritDumpFile")
    MERIT_DUMP_FILE("MeritDumpFile"),
    @XmlEnumValue("DomainName")
    DOMAIN_NAME("DomainName"),
    @XmlEnumValue("SwapServer")
    SWAP_SERVER("SwapServer"),
    @XmlEnumValue("RootPath")
    ROOT_PATH("RootPath"),
    @XmlEnumValue("ExtensionPath")
    EXTENSION_PATH("ExtensionPath"),
    @XmlEnumValue("IPForwarding")
    IP_FORWARDING("IPForwarding"),
    @XmlEnumValue("OptNonLocalSourceRouting")
    OPT_NON_LOCAL_SOURCE_ROUTING("OptNonLocalSourceRouting"),
    @XmlEnumValue("PolicyFilter")
    POLICY_FILTER("PolicyFilter"),
    @XmlEnumValue("MaxDgramReassemblySize")
    MAX_DGRAM_REASSEMBLY_SIZE("MaxDgramReassemblySize"),
    @XmlEnumValue("DefaultIPTTL")
    DEFAULT_IPTTL("DefaultIPTTL"),
    @XmlEnumValue("PathMTUAgingTimeout")
    PATH_MTU_AGING_TIMEOUT("PathMTUAgingTimeout"),
    @XmlEnumValue("PathMTUPlateauTable")
    PATH_MTU_PLATEAU_TABLE("PathMTUPlateauTable"),
    @XmlEnumValue("InterfaceMTU")
    INTERFACE_MTU("InterfaceMTU"),
    @XmlEnumValue("AllSubnetsAreLocal")
    ALL_SUBNETS_ARE_LOCAL("AllSubnetsAreLocal"),
    @XmlEnumValue("BroadcastAddress")
    BROADCAST_ADDRESS("BroadcastAddress"),
    @XmlEnumValue("PerformMaskDiscovery")
    PERFORM_MASK_DISCOVERY("PerformMaskDiscovery"),
    @XmlEnumValue("MaskSupplier")
    MASK_SUPPLIER("MaskSupplier"),
    @XmlEnumValue("PerformRouterDiscovery")
    PERFORM_ROUTER_DISCOVERY("PerformRouterDiscovery"),
    @XmlEnumValue("RouterSolicitationAddress")
    ROUTER_SOLICITATION_ADDRESS("RouterSolicitationAddress"),
    @XmlEnumValue("StaticRoute")
    STATIC_ROUTE("StaticRoute"),
    @XmlEnumValue("TrailerEncapsulation")
    TRAILER_ENCAPSULATION("TrailerEncapsulation"),
    @XmlEnumValue("ARPCacheTimeout")
    ARP_CACHE_TIMEOUT("ARPCacheTimeout"),
    @XmlEnumValue("EthernetEncapsulation")
    ETHERNET_ENCAPSULATION("EthernetEncapsulation"),
    @XmlEnumValue("TCPDefaultTTL")
    TCP_DEFAULT_TTL("TCPDefaultTTL"),
    @XmlEnumValue("TCPKeepaliveInterval")
    TCP_KEEPALIVE_INTERVAL("TCPKeepaliveInterval"),
    @XmlEnumValue("TCPKeepaliveGarbage")
    TCP_KEEPALIVE_GARBAGE("TCPKeepaliveGarbage"),
    @XmlEnumValue("NISDomain")
    NIS_DOMAIN("NISDomain"),
    @XmlEnumValue("NISServers")
    NIS_SERVERS("NISServers"),
    @XmlEnumValue("NTPServers")
    NTP_SERVERS("NTPServers"),
    @XmlEnumValue("VendorSpecificInfo")
    VENDOR_SPECIFIC_INFO("VendorSpecificInfo"),
    @XmlEnumValue("NetBIOSNameServers")
    NET_BIOS_NAME_SERVERS("NetBIOSNameServers"),
    @XmlEnumValue("NetBIOSDatagramServers")
    NET_BIOS_DATAGRAM_SERVERS("NetBIOSDatagramServers"),
    @XmlEnumValue("NetBIOSNodeType")
    NET_BIOS_NODE_TYPE("NetBIOSNodeType"),
    @XmlEnumValue("NetBIOSScope")
    NET_BIOS_SCOPE("NetBIOSScope"),
    @XmlEnumValue("XWindowsFontServers")
    X_WINDOWS_FONT_SERVERS("XWindowsFontServers"),
    @XmlEnumValue("XWindowsDisplayManager")
    X_WINDOWS_DISPLAY_MANAGER("XWindowsDisplayManager"),
    @XmlEnumValue("NetWareIPDomainName")
    NET_WARE_IP_DOMAIN_NAME("NetWareIPDomainName"),
    @XmlEnumValue("NetWareIPInformation")
    NET_WARE_IP_INFORMATION("NetWareIPInformation"),
    @XmlEnumValue("NISPlusDomain")
    NIS_PLUS_DOMAIN("NISPlusDomain"),
    @XmlEnumValue("NISPlusServers")
    NIS_PLUS_SERVERS("NISPlusServers"),
    @XmlEnumValue("TFTPServerName")
    TFTP_SERVER_NAME("TFTPServerName"),
    @XmlEnumValue("BootfileName")
    BOOTFILE_NAME("BootfileName"),
    @XmlEnumValue("MobileIPHomeAgents")
    MOBILE_IP_HOME_AGENTS("MobileIPHomeAgents"),
    @XmlEnumValue("SMTPServers")
    SMTP_SERVERS("SMTPServers"),
    @XmlEnumValue("POP3Servers")
    POP_3_SERVERS("POP3Servers"),
    @XmlEnumValue("NNTPServers")
    NNTP_SERVERS("NNTPServers"),
    @XmlEnumValue("WWWServers")
    WWW_SERVERS("WWWServers"),
    @XmlEnumValue("FingerServers")
    FINGER_SERVERS("FingerServers"),
    @XmlEnumValue("IRCServers")
    IRC_SERVERS("IRCServers"),
    @XmlEnumValue("StreetTalkServers")
    STREET_TALK_SERVERS("StreetTalkServers"),
    @XmlEnumValue("STDAServers")
    STDA_SERVERS("STDAServers"),
    @XmlEnumValue("SLPDirectoryAgent")
    SLP_DIRECTORY_AGENT("SLPDirectoryAgent"),
    @XmlEnumValue("SLPServiceScope")
    SLP_SERVICE_SCOPE("SLPServiceScope"),
    @XmlEnumValue("DomainSearch")
    DOMAIN_SEARCH("DomainSearch");
    private final String value;

    DHCPOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DHCPOption fromValue(String v) {
        for (DHCPOption c: DHCPOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
