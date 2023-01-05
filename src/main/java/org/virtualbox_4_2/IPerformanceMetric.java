
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
 * IPerformanceMetric.java
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
 * The IPerformanceMetric interface represents parameters of the given
 * performance metric.
 * 
 * Interface ID: <tt>{2A1A60AE-9345-4019-AD53-D34BA41CBFE9}</tt>
 */
public class IPerformanceMetric extends IUnknown {

	public IPerformanceMetric(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Name of the metric.
	 * 
	 * @return String
	 * 
	 */
	public String getMetricName() {
		try {
			String retVal = port.iPerformanceMetricGetMetricName(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Object this metric belongs to.
	 * 
	 * @return IUnknown
	 * 
	 */
	public IUnknown getObject() {
		try {
			String retVal = port.iPerformanceMetricGetObject(obj);
			return (retVal.length() > 0) ? new IUnknown(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Textual description of the metric.
	 * 
	 * @return String
	 * 
	 */
	public String getDescription() {
		try {
			String retVal = port.iPerformanceMetricGetDescription(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Time interval between samples, measured in seconds.
	 * 
	 * @return Long
	 * 
	 */
	public Long getPeriod() {
		try {
			Long retVal = port.iPerformanceMetricGetPeriod(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Number of recent samples retained by the performance collector for this
	 * metric.
	 * 
	 * When the collected sample count exceeds this number, older samples are
	 * discarded.
	 * 
	 * @return Long
	 * 
	 */
	public Long getCount() {
		try {
			Long retVal = port.iPerformanceMetricGetCount(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Unit of measurement.
	 * 
	 * @return String
	 * 
	 */
	public String getUnit() {
		try {
			String retVal = port.iPerformanceMetricGetUnit(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Minimum possible value of this metric.
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getMinimumValue() {
		try {
			Integer retVal = port.iPerformanceMetricGetMinimumValue(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Maximum possible value of this metric.
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getMaximumValue() {
		try {
			Integer retVal = port.iPerformanceMetricGetMaximumValue(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IPerformanceMetric queryInterface(IUnknown obj) {
		return obj == null ? null : new IPerformanceMetric(obj.getWrapped(), obj.getRemoteWSPort());
	}
}
