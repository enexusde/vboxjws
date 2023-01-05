
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
 * IPerformanceCollector.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import java.util.List;

import org.virtualbox_4_2.jaxws.InvalidObjectFaultMsg;
import org.virtualbox_4_2.jaxws.RuntimeFaultMsg;
import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * The IPerformanceCollector interface represents a service that collects and
 * stores performance metrics data.
 * 
 * Performance metrics are associated with objects of interfaces like IHost and
 * IMachine. Each object has a distinct set of performance metrics. The set can
 * be obtained with
 * {@link org.virtualbox_4_2.IPerformanceCollector#getMetrics(List,List)}.
 * 
 * Metric data is collected at the specified intervals and is retained
 * internally. The interval and the number of retained samples can be set with
 * {@link org.virtualbox_4_2.IPerformanceCollector#setupMetrics(List,List,Long,Long)}.
 * Both metric data and collection settings are not persistent, they are
 * discarded as soon as VBoxSVC process terminates. Moreover, metric settings
 * and data associated with a particular VM only exist while VM is running. They
 * disappear as soon as VM shuts down. It is not possible to set up metrics for
 * machines that are powered off. One needs to start VM first, then set up
 * metric collection parameters.
 * 
 * Metrics are organized hierarchically, with each level separated by a slash
 * (/) character. Generally, the scheme for metric names is like this:
 * 
 * <tt>Category/Metric[/SubMetric][:aggregation]</tt>
 * 
 * "Category/Metric" together form the base metric name. A base metric is the
 * smallest unit for which a sampling interval and the number of retained
 * samples can be set. Only base metrics can be enabled and disabled. All
 * sub-metrics are collected when their base metric is collected. Collected
 * values for any set of sub-metrics can be queried with
 * {@link org.virtualbox_4_2.IPerformanceCollector#queryMetricsData(List,List,Holder,Holder,Holder,Holder,Holder,Holder,Holder)}.
 * 
 * For example "CPU/Load/User:avg" metric name stands for the "CPU" category,
 * "Load" metric, "User" submetric, "average" aggregate. An aggregate function
 * is computed over all retained data. Valid aggregate functions are:
 * 
 * <ul>
 * <li>avg -- average</li>
 * <li>min -- minimum</li>
 * <li>max -- maximum</li>
 * </ul>
 * 
 * When setting up metric parameters, querying metric data, enabling or
 * disabling metrics wildcards can be used in metric names to specify a subset
 * of metrics. For example, to select all CPU-related metrics use
 * <tt>CPU/*</tt>, all averages can be queried using <tt>*:avg</tt> and so on.
 * To query metric values without aggregates <tt>*:</tt> can be used.
 * 
 * The valid names for base metrics are:
 * 
 * <ul>
 * <li>CPU/Load</li>
 * <li>CPU/MHz</li>
 * <li>RAM/Usage</li>
 * <li>RAM/VMM</li>
 * </ul>
 * 
 * The general sequence for collecting and retrieving the metrics is:
 * <ul>
 * <li>Obtain an instance of IPerformanceCollector with
 * {@link org.virtualbox_4_2.IVirtualBox#getPerformanceCollector()}</li>
 * <li>Allocate and populate an array with references to objects the metrics
 * will be collected for. Use references to IHost and IMachine objects.</li>
 * <li>Allocate and populate an array with base metric names the data will be
 * collected for.</li>
 * <li>Call
 * {@link org.virtualbox_4_2.IPerformanceCollector#setupMetrics(List,List,Long,Long)}.
 * From now on the metric data will be collected and stored.</li>
 * <li>Wait for the data to get collected.</li>
 * <li>Allocate and populate an array with references to objects the metric
 * values will be queried for. You can re-use the object array used for setting
 * base metrics.</li>
 * <li>Allocate and populate an array with metric names the data will be
 * collected for. Note that metric names differ from base metric names.</li>
 * <li>Call
 * {@link org.virtualbox_4_2.IPerformanceCollector#queryMetricsData(List,List,Holder,Holder,Holder,Holder,Holder,Holder,Holder)}.
 * The data that have been collected so far are returned. Note that the values
 * are still retained internally and data collection continues.</li>
 * </ul>
 * 
 * For an example of usage refer to the following files in VirtualBox SDK:
 * <ul>
 * <li>Java:
 * <tt>bindings/webservice/java/jax-ws/samples/metrictest.java</tt></li>
 * <li>Python: <tt>bindings/xpcom/python/sample/shellcommon.py</tt></li>
 * </ul>
 * Interface ID: <tt>{E22E1ACB-AC4A-43BB-A31C-17321659B0C6}</tt>
 */
public class IPerformanceCollector extends IUnknown {

	public IPerformanceCollector(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Array of unique names of metrics.
	 * 
	 * This array represents all metrics supported by the performance collector.
	 * Individual objects do not necessarily support all of them.
	 * {@link org.virtualbox_4_2.IPerformanceCollector#getMetrics(List,List)} can be
	 * used to get the list of supported metrics for a particular object.
	 * 
	 * @return List<String>
	 * 
	 */
	public List<String> getMetricNames() {
		try {
			List<String> retVal = port.iPerformanceCollectorGetMetricNames(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IPerformanceCollector queryInterface(IUnknown obj) {
		return obj == null ? null : new IPerformanceCollector(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Returns parameters of specified metrics for a set of objects.
	 * 
	 * @param metricNames Metric name filter. Currently, only a comma-separated list
	 *                    of metrics is supported.
	 * 
	 * 
	 * @param objects     Set of objects to return metric parameters for.
	 * 
	 * 
	 * @return Array of returned metric parameters.
	 * 
	 * 
	 *         NOTE: Null metrics array means all metrics. Null object array means
	 *         all existing objects.
	 * 
	 * 
	 */
	public List<org.virtualbox_4_2.IPerformanceMetric> getMetrics(List<String> metricNames, List<IUnknown> objects) {
		try {
			List<String> retVal;
			retVal = port.iPerformanceCollectorGetMetrics(obj, metricNames, Helper.unwrap(objects));
			return Helper.wrap(org.virtualbox_4_2.IPerformanceMetric.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets parameters of specified base metrics for a set of objects. Returns an
	 * array of {@link org.virtualbox_4_2.IPerformanceMetric} describing the metrics
	 * have been affected.
	 * 
	 * @param metricNames Metric name filter. Comma-separated list of metrics with
	 *                    wildcard support.
	 * 
	 * 
	 * @param objects     Set of objects to setup metric parameters for.
	 * 
	 * 
	 * @param period      Time interval in seconds between two consecutive samples
	 *                    of performance data.
	 * 
	 * 
	 * @param count       Number of samples to retain in performance data history.
	 *                    Older samples get discarded.
	 * 
	 * 
	 * @return Array of metrics that have been modified by the call to this method.
	 * 
	 * 
	 *         NOTE: Null or empty metric name array means all metrics. Null or
	 *         empty object array means all existing objects. If metric name array
	 *         contains a single element and object array contains many, the single
	 *         metric name array element is applied to each object array element to
	 *         form metric/object pairs.
	 * 
	 * 
	 */
	public List<org.virtualbox_4_2.IPerformanceMetric> setupMetrics(List<String> metricNames, List<IUnknown> objects,
			Long period, Long count) {
		try {
			List<String> retVal;
			retVal = port.iPerformanceCollectorSetupMetrics(obj, metricNames, Helper.unwrap(objects), period, count);
			return Helper.wrap(org.virtualbox_4_2.IPerformanceMetric.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Turns on collecting specified base metrics. Returns an array of
	 * {@link org.virtualbox_4_2.IPerformanceMetric} describing the metrics have
	 * been affected.
	 * 
	 * @param metricNames Metric name filter. Comma-separated list of metrics with
	 *                    wildcard support.
	 * 
	 * 
	 * @param objects     Set of objects to enable metrics for.
	 * 
	 * 
	 * @return Array of metrics that have been modified by the call to this method.
	 * 
	 * 
	 *         NOTE: Null or empty metric name array means all metrics. Null or
	 *         empty object array means all existing objects. If metric name array
	 *         contains a single element and object array contains many, the single
	 *         metric name array element is applied to each object array element to
	 *         form metric/object pairs.
	 * 
	 * 
	 */
	public List<org.virtualbox_4_2.IPerformanceMetric> enableMetrics(List<String> metricNames, List<IUnknown> objects) {
		try {
			List<String> retVal;
			retVal = port.iPerformanceCollectorEnableMetrics(obj, metricNames, Helper.unwrap(objects));
			return Helper.wrap(org.virtualbox_4_2.IPerformanceMetric.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Turns off collecting specified base metrics. Returns an array of
	 * {@link org.virtualbox_4_2.IPerformanceMetric} describing the metrics have
	 * been affected.
	 * 
	 * @param metricNames Metric name filter. Comma-separated list of metrics with
	 *                    wildcard support.
	 * 
	 * 
	 * @param objects     Set of objects to disable metrics for.
	 * 
	 * 
	 * @return Array of metrics that have been modified by the call to this method.
	 * 
	 * 
	 *         NOTE: Null or empty metric name array means all metrics. Null or
	 *         empty object array means all existing objects. If metric name array
	 *         contains a single element and object array contains many, the single
	 *         metric name array element is applied to each object array element to
	 *         form metric/object pairs.
	 * 
	 * 
	 */
	public List<org.virtualbox_4_2.IPerformanceMetric> disableMetrics(List<String> metricNames,
			List<IUnknown> objects) {
		try {
			List<String> retVal;
			retVal = port.iPerformanceCollectorDisableMetrics(obj, metricNames, Helper.unwrap(objects));
			return Helper.wrap(org.virtualbox_4_2.IPerformanceMetric.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Queries collected metrics data for a set of objects.
	 * 
	 * The data itself and related metric information are returned in seven parallel
	 * and one flattened array of arrays. Elements of
	 * <tt>returnMetricNames, returnObjects, returnUnits, returnScales,
	 returnSequenceNumbers, returnDataIndices and returnDataLengths</tt> with the
	 * same index describe one set of values corresponding to a single metric.
	 * 
	 * The <tt>returnData</tt> parameter is a flattened array of arrays. Each start
	 * and length of a sub-array is indicated by <tt>returnDataIndices</tt> and
	 * <tt>returnDataLengths</tt>. The first value for metric
	 * <tt>metricNames[i]</tt> is at <tt>returnData[returnIndices[i]]</tt>.
	 * 
	 * 
	 * @param metricNames           Metric name filter. Comma-separated list of
	 *                              metrics with wildcard support.
	 * 
	 * 
	 * @param objects               Set of objects to query metrics for.
	 * 
	 * 
	 * @param returnMetricNames     Names of metrics returned in returnData.
	 * 
	 * 
	 * @param returnObjects         Objects associated with metrics returned in
	 *                              returnData.
	 * 
	 * 
	 * @param returnUnits           Units of measurement for each returned metric.
	 * 
	 * 
	 * @param returnScales          Divisor that should be applied to return values
	 *                              in order to get floating point values. For
	 *                              example:
	 *                              <tt>(double)returnData[returnDataIndices[0]+i] / returnScales[0]</tt>
	 *                              will retrieve the floating point value of i-th
	 *                              sample of the first metric.
	 * 
	 * 
	 * @param returnSequenceNumbers Sequence numbers of the first elements of value
	 *                              sequences of particular metrics returned in
	 *                              returnData. For aggregate metrics it is the
	 *                              sequence number of the sample the aggregate
	 *                              started calculation from.
	 * 
	 * 
	 * @param returnDataIndices     Indices of the first elements of value sequences
	 *                              of particular metrics returned in returnData.
	 * 
	 * 
	 * @param returnDataLengths     Lengths of value sequences of particular
	 *                              metrics.
	 * 
	 * 
	 * @return Flattened array of all metric data containing sequences of values for
	 *         each metric.
	 * 
	 * 
	 *         NOTE: Null or empty metric name array means all metrics. Null or
	 *         empty object array means all existing objects. If metric name array
	 *         contains a single element and object array contains many, the single
	 *         metric name array element is applied to each object array element to
	 *         form metric/object pairs.
	 * 
	 * 
	 *         NOTE: Data collection continues behind the scenes after call to
	 *         queryMetricsData. The return data can be seen as the snapshot of the
	 *         current state at the time of queryMetricsData call. The internally
	 *         kept metric values are not cleared by the call. This makes possible
	 *         querying different subsets of metrics or aggregates with subsequent
	 *         calls. If periodic querying is needed it is highly suggested to query
	 *         the values with interval*count period to avoid confusion. This way a
	 *         completely new set of data values will be provided by each query.
	 * 
	 * 
	 */
	public List<Integer> queryMetricsData(List<String> metricNames, List<IUnknown> objects,
			Holder<List<String>> returnMetricNames, Holder<List<IUnknown>> returnObjects,
			Holder<List<String>> returnUnits, Holder<List<Long>> returnScales, Holder<List<Long>> returnSequenceNumbers,
			Holder<List<Long>> returnDataIndices, Holder<List<Long>> returnDataLengths) {
		try {
			javax.xml.ws.Holder<List<String>> tmp_returnMetricNames = new javax.xml.ws.Holder<List<String>>();
			javax.xml.ws.Holder<List<String>> tmp_returnObjects = new javax.xml.ws.Holder<List<String>>();
			javax.xml.ws.Holder<List<String>> tmp_returnUnits = new javax.xml.ws.Holder<List<String>>();
			javax.xml.ws.Holder<List<Long>> tmp_returnScales = new javax.xml.ws.Holder<List<Long>>();
			javax.xml.ws.Holder<List<Long>> tmp_returnSequenceNumbers = new javax.xml.ws.Holder<List<Long>>();
			javax.xml.ws.Holder<List<Long>> tmp_returnDataIndices = new javax.xml.ws.Holder<List<Long>>();
			javax.xml.ws.Holder<List<Long>> tmp_returnDataLengths = new javax.xml.ws.Holder<List<Long>>();
			javax.xml.ws.Holder<List<Integer>> retVal = new javax.xml.ws.Holder<List<Integer>>();
			port.iPerformanceCollectorQueryMetricsData(obj, metricNames, Helper.unwrap(objects), tmp_returnMetricNames,
					tmp_returnObjects, tmp_returnUnits, tmp_returnScales, tmp_returnSequenceNumbers,
					tmp_returnDataIndices, tmp_returnDataLengths, retVal);
			returnMetricNames.value = tmp_returnMetricNames.value;
			returnObjects.value = Helper.wrap(IUnknown.class, port, tmp_returnObjects.value);
			returnUnits.value = tmp_returnUnits.value;
			returnScales.value = tmp_returnScales.value;
			returnSequenceNumbers.value = tmp_returnSequenceNumbers.value;
			returnDataIndices.value = tmp_returnDataIndices.value;
			returnDataLengths.value = tmp_returnDataLengths.value;
			return retVal.value;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}
