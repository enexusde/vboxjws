
/*
 *  Copyright (C) 2010-2011 Oracle Corporation
 *
 *  This file is part of the VirtualBox SDK, as available from
 *  http://www.virtualbox.org.  This library is free software; you can
 *  redistribute it and/or modify it under the terms of the GNU Lesser General
 *  Public License as published by the Free Software Foundation, in version 2.1
 *  as it comes in the "COPYING.LIB" file of the VirtualBox SDK distribution.
 *  This library is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *  FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
 *  License for more details.
 *
 * ISerialPort.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import org.virtualbox_4_2.jaxws.InvalidObjectFaultMsg;
import org.virtualbox_4_2.jaxws.RuntimeFaultMsg;
import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * The ISerialPort interface represents the virtual serial port device.
 * 
 * The virtual serial port device acts like an ordinary serial port inside the
 * virtual machine. This device communicates to the real serial port hardware in
 * one of two modes: host pipe or host device.
 * 
 * In host pipe mode, the #path attribute specifies the path to the pipe on the
 * host computer that represents a serial port. The #server attribute determines
 * if this pipe is created by the virtual machine process at machine startup or
 * it must already exist before starting machine execution.
 * 
 * In host device mode, the #path attribute specifies the name of the serial
 * port device on the host computer.
 * 
 * There is also a third communication mode: the disconnected mode. In this
 * mode, the guest OS running inside the virtual machine will be able to detect
 * the serial port, but all port write operations will be discarded and all port
 * read operations will return no data.
 * 
 * 
 * @see org.virtualbox_4_2.IMachine#getSerialPort(Long)
 * 
 *      Interface ID: <tt>{937F6970-5103-4745-B78E-D28DCF1479A8}</tt>
 */
public class ISerialPort extends IUnknown {

	public ISerialPort(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Slot number this serial port is plugged into. Corresponds to the value you
	 * pass to {@link org.virtualbox_4_2.IMachine#getSerialPort(Long)} to obtain
	 * this instance.
	 * 
	 * @return Long
	 * 
	 */
	public Long getSlot() {
		try {
			Long retVal = port.iSerialPortGetSlot(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Flag whether the serial port is enabled. If disabled, the serial port will
	 * not be reported to the guest OS.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getEnabled() {
		try {
			Boolean retVal = port.iSerialPortGetEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Flag whether the serial port is enabled. If disabled, the serial port will
	 * not be reported to the guest OS.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setEnabled(Boolean value) {
		try {
			port.iSerialPortSetEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Base I/O address of the serial port.
	 * 
	 * @return Long
	 * 
	 */
	public Long getIOBase() {
		try {
			Long retVal = port.iSerialPortGetIOBase(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Base I/O address of the serial port.
	 * 
	 * @param value Long
	 * 
	 */
	public void setIOBase(Long value) {
		try {
			port.iSerialPortSetIOBase(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * IRQ number of the serial port.
	 * 
	 * @return Long
	 * 
	 */
	public Long getIRQ() {
		try {
			Long retVal = port.iSerialPortGetIRQ(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * IRQ number of the serial port.
	 * 
	 * @param value Long
	 * 
	 */
	public void setIRQ(Long value) {
		try {
			port.iSerialPortSetIRQ(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * How is this port connected to the host.
	 * 
	 * NOTE: Changing this attribute may fail if the conditions for
	 * {@link #getPath()} are not met.
	 * 
	 * 
	 * @return org.virtualbox_4_2.PortMode
	 * 
	 */
	public org.virtualbox_4_2.PortMode getHostMode() {
		try {
			org.virtualbox_4_2.jaxws.PortMode retVal = port.iSerialPortGetHostMode(obj);
			return org.virtualbox_4_2.PortMode.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * How is this port connected to the host.
	 * 
	 * NOTE: Changing this attribute may fail if the conditions for
	 * {@link #getPath()} are not met.
	 * 
	 * 
	 * @param value org.virtualbox_4_2.PortMode
	 * 
	 */
	public void setHostMode(org.virtualbox_4_2.PortMode value) {
		try {
			port.iSerialPortSetHostMode(obj, org.virtualbox_4_2.jaxws.PortMode.fromValue(value.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Flag whether this serial port acts as a server (creates a new pipe on the
	 * host) or as a client (uses the existing pipe). This attribute is used only
	 * when {@link #getHostMode()} is PortMode_HostPipe.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getServer() {
		try {
			Boolean retVal = port.iSerialPortGetServer(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Flag whether this serial port acts as a server (creates a new pipe on the
	 * host) or as a client (uses the existing pipe). This attribute is used only
	 * when {@link #getHostMode()} is PortMode_HostPipe.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setServer(Boolean value) {
		try {
			port.iSerialPortSetServer(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Path to the serial port's pipe on the host when
	 * {@link org.virtualbox_4_2.ISerialPort#getHostMode()} is PortMode_HostPipe, or
	 * the host serial device name when
	 * {@link org.virtualbox_4_2.ISerialPort#getHostMode()} is PortMode_HostDevice.
	 * For both cases, setting a null or empty string as the attribute's value is an
	 * error. Otherwise, the value of this property is ignored.
	 * 
	 * @return String
	 * 
	 */
	public String getPath() {
		try {
			String retVal = port.iSerialPortGetPath(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Path to the serial port's pipe on the host when
	 * {@link org.virtualbox_4_2.ISerialPort#getHostMode()} is PortMode_HostPipe, or
	 * the host serial device name when
	 * {@link org.virtualbox_4_2.ISerialPort#getHostMode()} is PortMode_HostDevice.
	 * For both cases, setting a null or empty string as the attribute's value is an
	 * error. Otherwise, the value of this property is ignored.
	 * 
	 * @param value String
	 * 
	 */
	public void setPath(String value) {
		try {
			port.iSerialPortSetPath(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static ISerialPort queryInterface(IUnknown obj) {
		return obj == null ? null : new ISerialPort(obj.getWrapped(), obj.getRemoteWSPort());
	}
}
