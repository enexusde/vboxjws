
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestUserState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GuestUserState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="LoggedIn"/>
 *     &lt;enumeration value="LoggedOut"/>
 *     &lt;enumeration value="Locked"/>
 *     &lt;enumeration value="Unlocked"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="Idle"/>
 *     &lt;enumeration value="InUse"/>
 *     &lt;enumeration value="Created"/>
 *     &lt;enumeration value="Deleted"/>
 *     &lt;enumeration value="SessionChanged"/>
 *     &lt;enumeration value="CredentialsChanged"/>
 *     &lt;enumeration value="RoleChanged"/>
 *     &lt;enumeration value="GroupAdded"/>
 *     &lt;enumeration value="GroupRemoved"/>
 *     &lt;enumeration value="Elevated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GuestUserState")
@XmlEnum
public enum GuestUserState {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("LoggedIn")
    LOGGED_IN("LoggedIn"),
    @XmlEnumValue("LoggedOut")
    LOGGED_OUT("LoggedOut"),
    @XmlEnumValue("Locked")
    LOCKED("Locked"),
    @XmlEnumValue("Unlocked")
    UNLOCKED("Unlocked"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Idle")
    IDLE("Idle"),
    @XmlEnumValue("InUse")
    IN_USE("InUse"),
    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("SessionChanged")
    SESSION_CHANGED("SessionChanged"),
    @XmlEnumValue("CredentialsChanged")
    CREDENTIALS_CHANGED("CredentialsChanged"),
    @XmlEnumValue("RoleChanged")
    ROLE_CHANGED("RoleChanged"),
    @XmlEnumValue("GroupAdded")
    GROUP_ADDED("GroupAdded"),
    @XmlEnumValue("GroupRemoved")
    GROUP_REMOVED("GroupRemoved"),
    @XmlEnumValue("Elevated")
    ELEVATED("Elevated");
    private final String value;

    GuestUserState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuestUserState fromValue(String v) {
        for (GuestUserState c: GuestUserState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
