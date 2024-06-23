
/*
 * Copyright (C) 2010-2022 Oracle and/or its affiliates.
 *
 * This file is part of a free software library; you can redistribute
 * it and/or modify it under the terms of the GNU Lesser General
 * Public License version 2.1 as published by the Free Software
 * Foundation and shipped in the \"COPYING.LIB\" file with this library.
 * The library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY of any kind.
 *
 * Oracle LGPL Disclaimer: For the avoidance of doubt, except that if
 * any license choice other than GPL or LGPL is available it will
 * apply instead, Oracle elects to use only the Lesser General Public
 * License version 2.1 (LGPLv2) at this time for any software where
 * a choice of LGPL license versions is made available with the
 * language indicating that LGPLv2 or any later version may be used,
 * or where a choice of which version of the LGPL is applied is
 * otherwise unspecified.

 * http://www.virtualbox.org.  This library is free software; you can
 * redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, in version 2.1
 * as it comes in the "COPYING.LIB" file of the VirtualBox SDK distribution.
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
 * License for more details.
 *
 * SPDX-License-Identifier: LGPL-2.1-only
 */

/*
 * IMachineDebugger.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;
import java.util.List;

public class IMachineDebugger extends IUnknown
{

    public IMachineDebugger(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Switch for enabling single-stepping.
@return Boolean
*/
    public Boolean getSingleStep()
    {
        try
        {
            Boolean retVal = port.iMachineDebuggerGetSingleStep(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Switch for enabling single-stepping.
@param value Boolean

*/
    public void setSingleStep(Boolean value)
    {
        try
        {
        port.iMachineDebuggerSetSingleStep(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Whether to execute all the code in the instruction interpreter. This
is mainly for testing the interpreter and not an execution mode
intended for general consumption.
@return Boolean
*/
    public Boolean getExecuteAllInIEM()
    {
        try
        {
            Boolean retVal = port.iMachineDebuggerGetExecuteAllInIEM(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Whether to execute all the code in the instruction interpreter. This
is mainly for testing the interpreter and not an execution mode
intended for general consumption.
@param value Boolean

*/
    public void setExecuteAllInIEM(Boolean value)
    {
        try
        {
        port.iMachineDebuggerSetExecuteAllInIEM(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Switch for enabling and disabling the debug logger.
@return Boolean
*/
    public Boolean getLogEnabled()
    {
        try
        {
            Boolean retVal = port.iMachineDebuggerGetLogEnabled(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Switch for enabling and disabling the debug logger.
@param value Boolean

*/
    public void setLogEnabled(Boolean value)
    {
        try
        {
        port.iMachineDebuggerSetLogEnabled(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
The debug logger flags.
@return String
*/
    public String getLogDbgFlags()
    {
        try
        {
            String retVal = port.iMachineDebuggerGetLogDbgFlags(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
The debug logger's group settings.
@return String
*/
    public String getLogDbgGroups()
    {
        try
        {
            String retVal = port.iMachineDebuggerGetLogDbgGroups(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
The debug logger's destination settings.
@return String
*/
    public String getLogDbgDestinations()
    {
        try
        {
            String retVal = port.iMachineDebuggerGetLogDbgDestinations(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
The release logger flags.
@return String
*/
    public String getLogRelFlags()
    {
        try
        {
            String retVal = port.iMachineDebuggerGetLogRelFlags(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
The release logger's group settings.
@return String
*/
    public String getLogRelGroups()
    {
        try
        {
            String retVal = port.iMachineDebuggerGetLogRelGroups(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
The relase logger's destination settings.
@return String
*/
    public String getLogRelDestinations()
    {
        try
        {
            String retVal = port.iMachineDebuggerGetLogRelDestinations(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Gets the main execution engine of the VM.
@return org.virtualbox_7_0.VMExecutionEngine
*/
    public org.virtualbox_7_0.VMExecutionEngine getExecutionEngine()
    {
        try
        {
            org.virtualbox_7_0.jaxws.VMExecutionEngine retVal = port.iMachineDebuggerGetExecutionEngine(obj);
            return org.virtualbox_7_0.VMExecutionEngine.fromValue(retVal.value());
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Flag indicating whether the VM is currently making use of the nested paging
CPU hardware virtualization extension.
@return Boolean
*/
    public Boolean getHWVirtExNestedPagingEnabled()
    {
        try
        {
            Boolean retVal = port.iMachineDebuggerGetHWVirtExNestedPagingEnabled(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Flag indicating whether the VM is currently making use of the VPID
VT-x extension.
@return Boolean
*/
    public Boolean getHWVirtExVPIDEnabled()
    {
        try
        {
            Boolean retVal = port.iMachineDebuggerGetHWVirtExVPIDEnabled(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Flag indicating whether the VM is currently making use of the
unrestricted execution feature of VT-x.
@return Boolean
*/
    public Boolean getHWVirtExUXEnabled()
    {
        try
        {
            Boolean retVal = port.iMachineDebuggerGetHWVirtExUXEnabled(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Query the guest OS kernel name as detected by the DBGF.

This feature is not implemented in the 4.0.0 release but may show up
in a dot release.
@return String
*/
    public String getOSName()
    {
        try
        {
            String retVal = port.iMachineDebuggerGetOSName(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Query the guest OS kernel version string as detected by the DBGF.

This feature is not implemented in the 4.0.0 release but may show up
in a dot release.
@return String
*/
    public String getOSVersion()
    {
        try
        {
            String retVal = port.iMachineDebuggerGetOSVersion(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Flag indicating whether the VM is currently making use of the Physical
Address Extension CPU feature.
@return Boolean
*/
    public Boolean getPAEEnabled()
    {
        try
        {
            Boolean retVal = port.iMachineDebuggerGetPAEEnabled(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
The rate at which the virtual time runs expressed as a percentage.
The accepted range is 2% to 20000%.
@return Long
*/
    public Long getVirtualTimeRate()
    {
        try
        {
            Long retVal = port.iMachineDebuggerGetVirtualTimeRate(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
The rate at which the virtual time runs expressed as a percentage.
The accepted range is 2% to 20000%.
@param value Long

*/
    public void setVirtualTimeRate(Long value)
    {
        try
        {
        port.iMachineDebuggerSetVirtualTimeRate(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
VM uptime in milliseconds, i.e. time in which it could have been
executing guest code. Excludes the time when the VM was paused.
@return Long
*/
    public Long getUptime()
    {
        try
        {
            Long retVal = port.iMachineDebuggerGetUptime(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
    public static IMachineDebugger queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IMachineDebugger(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Takes a core dump of the guest.

See include/VBox/dbgfcorefmt.h for details on the file format.
@param filename The name of the output file. The file must not exist.

@param compression Reserved for future compression method indicator.

*/
    public void dumpGuestCore(String filename, String compression)
    {
        try
        {
        port.iMachineDebuggerDumpGuestCore(obj, filename, compression);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Takes a core dump of the VM process on the host.

This feature is not implemented in the 4.0.0 release but it may show up
in a dot release.
@param filename The name of the output file. The file must not exist.

@param compression Reserved for future compression method indicator.

*/
    public void dumpHostProcessCore(String filename, String compression)
    {
        try
        {
        port.iMachineDebuggerDumpHostProcessCore(obj, filename, compression);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Interfaces with the info dumpers (DBGFInfo).

This feature is not implemented in the 4.0.0 release but it may show up
in a dot release.
@param name The name of the info item.

@param args Arguments to the info dumper.

@return The into string.

*/
    public String info(String name, String args)
    {
        try
        {
            String retVal;
        retVal = port.iMachineDebuggerInfo(obj, name, args);
           return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Inject an NMI into a running VT-x/AMD-V VM.
*/
    public void injectNMI()
    {
        try
        {
        port.iMachineDebuggerInjectNMI(obj);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Modifies the group settings of the debug or release logger.
@param settings The group settings string. See iprt/log.h for details. To target the
release logger, prefix the string with "release:".

*/
    public void modifyLogGroups(String settings)
    {
        try
        {
        port.iMachineDebuggerModifyLogGroups(obj, settings);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Modifies the debug or release logger flags.
@param settings The flags settings string. See iprt/log.h for details. To target the
release logger, prefix the string with "release:".

*/
    public void modifyLogFlags(String settings)
    {
        try
        {
        port.iMachineDebuggerModifyLogFlags(obj, settings);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Modifies the debug or release logger destinations.
@param settings The destination settings string. See iprt/log.h for details. To target the
release logger, prefix the string with "release:".

*/
    public void modifyLogDestinations(String settings)
    {
        try
        {
        port.iMachineDebuggerModifyLogDestinations(obj, settings);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Reads guest physical memory, no side effects (MMIO++).

This feature is not implemented in the 4.0.0 release but may show up
in a dot release.
@param address The guest physical address.

@param size The number of bytes to read.

@return The bytes read.

*/
    public byte[] readPhysicalMemory(Long address, Long size)
    {
        try
        {
            /*base64*/String retVal;
        retVal = port.iMachineDebuggerReadPhysicalMemory(obj, address, size);
           return Helper.decodeBase64(retVal);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Writes guest physical memory, access handles (MMIO++) are ignored.

This feature is not implemented in the 4.0.0 release but may show up
in a dot release.
@param address The guest physical address.

@param size The number of bytes to read.

@param bytes The bytes to write.

*/
    public void writePhysicalMemory(Long address, Long size, byte[] bytes)
    {
        try
        {
        port.iMachineDebuggerWritePhysicalMemory(obj, address, size, Helper.encodeBase64(bytes));
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Reads guest virtual memory, no side effects (MMIO++).

This feature is not implemented in the 4.0.0 release but may show up
in a dot release.
@param cpuId The identifier of the Virtual CPU.

@param address The guest virtual address.

@param size The number of bytes to read.

@return The bytes read.

*/
    public byte[] readVirtualMemory(Long cpuId, Long address, Long size)
    {
        try
        {
            /*base64*/String retVal;
        retVal = port.iMachineDebuggerReadVirtualMemory(obj, cpuId, address, size);
           return Helper.decodeBase64(retVal);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Writes guest virtual memory, access handles (MMIO++) are ignored.

This feature is not implemented in the 4.0.0 release but may show up
in a dot release.
@param cpuId The identifier of the Virtual CPU.

@param address The guest virtual address.

@param size The number of bytes to read.

@param bytes The bytes to write.

*/
    public void writeVirtualMemory(Long cpuId, Long address, Long size, byte[] bytes)
    {
        try
        {
        port.iMachineDebuggerWriteVirtualMemory(obj, cpuId, address, size, Helper.encodeBase64(bytes));
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Loads a DBGF plug-in.
@param name The plug-in name or DLL. Special name 'all' loads all installed plug-ins.

@return The name of the loaded plug-in.

*/
    public String loadPlugIn(String name)
    {
        try
        {
            String retVal;
        retVal = port.iMachineDebuggerLoadPlugIn(obj, name);
           return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Unloads a DBGF plug-in.
@param name The plug-in name or DLL. Special name 'all' unloads all plug-ins.

*/
    public void unloadPlugIn(String name)
    {
        try
        {
        port.iMachineDebuggerUnloadPlugIn(obj, name);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Tries to (re-)detect the guest OS kernel.

This feature is not implemented in the 4.0.0 release but may show up
in a dot release.
@return The detected OS kernel on success.

*/
    public String detectOS()
    {
        try
        {
            String retVal;
        retVal = port.iMachineDebuggerDetectOS(obj);
           return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Tries to get the kernel log (dmesg) of the guest OS.
@param maxMessages Max number of messages to return, counting from the end of the
log.  If 0, there is no limit.

@return The kernel log.

*/
    public String queryOSKernelLog(Long maxMessages)
    {
        try
        {
            String retVal;
        retVal = port.iMachineDebuggerQueryOSKernelLog(obj, maxMessages);
           return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Gets one register.
@param cpuId The identifier of the Virtual CPU.

@param name The register name, case is ignored.

@return The register value. This is usually a hex value (always 0x prefixed)
but other format may be used for floating point registers (TBD).

*/
    public String getRegister(Long cpuId, String name)
    {
        try
        {
            String retVal;
        retVal = port.iMachineDebuggerGetRegister(obj, cpuId, name);
           return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Gets all the registers for the given CPU.
@param cpuId The identifier of the Virtual CPU.

@param names Array containing the lowercase register names.

@param values Array parallel to the names holding the register values as if the
register was returned by{@link org.virtualbox_7_0.IMachineDebugger#getRegister(Long,String)}.

*/
    public void getRegisters(Long cpuId, Holder<List<String>> names, Holder<List<String>> values)
    {
        try
        {
        jakarta.xml.ws.Holder<List<String>> tmp_names = new jakarta.xml.ws.Holder<List<String>>();
        jakarta.xml.ws.Holder<List<String>> tmp_values = new jakarta.xml.ws.Holder<List<String>>();
        port.iMachineDebuggerGetRegisters(obj, cpuId, tmp_names, tmp_values);
        names.value = tmp_names.value;
        values.value = tmp_values.value;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Gets one register.

This feature is not implemented in the 4.0.0 release but may show up
in a dot release.
@param cpuId The identifier of the Virtual CPU.

@param name The register name, case is ignored.

@param value The new register value. Hexadecimal, decimal and octal formattings
are supported in addition to any special formattings returned by
the getters.

*/
    public void setRegister(Long cpuId, String name, String value)
    {
        try
        {
        port.iMachineDebuggerSetRegister(obj, cpuId, name, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Sets zero or more registers atomically.

This feature is not implemented in the 4.0.0 release but may show up
in a dot release.
@param cpuId The identifier of the Virtual CPU.

@param names Array containing the register names, case ignored.

@param values Array paralell to the names holding the register values. See{@link org.virtualbox_7_0.IMachineDebugger#setRegister(Long,String,String)}for formatting
guidelines.

*/
    public void setRegisters(Long cpuId, List<String> names, List<String> values)
    {
        try
        {
        port.iMachineDebuggerSetRegisters(obj, cpuId, names, values);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Produce a simple stack dump using the current guest state.

This feature is not implemented in the 4.0.0 release but may show up
in a dot release.
@param cpuId The identifier of the Virtual CPU.

@return String containing the formatted stack dump.

*/
    public String dumpGuestStack(Long cpuId)
    {
        try
        {
            String retVal;
        retVal = port.iMachineDebuggerDumpGuestStack(obj, cpuId);
           return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Reset VM statistics.
@param pattern The selection pattern. A bit similar to filename globbing.
Wildchars are '*' and '?', where the asterisk matches zero or
more characters and question mark matches exactly one character.
Multiple pattern can be joined by putting '|' between them.

*/
    public void resetStats(String pattern)
    {
        try
        {
        port.iMachineDebuggerResetStats(obj, pattern);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Dumps VM statistics.
@param pattern The selection pattern. A bit similar to filename globbing.
Wildchars are '*' and '?', where the asterisk matches zero or
more characters and question mark matches exactly one character.
Multiple pattern can be joined by putting '|' between them.

*/
    public void dumpStats(String pattern)
    {
        try
        {
        port.iMachineDebuggerDumpStats(obj, pattern);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Get the VM statistics in a XMLish format.
@param pattern The selection pattern. A bit similar to filename globbing.
Wildchars are '*' and '?', where the asterisk matches zero or
more characters and question mark matches exactly one character.
Multiple pattern can be joined by putting '|' between them.

@param withDescriptions Whether to include the descriptions.

@return The XML document containing the statistics.

*/
    public String getStats(String pattern, Boolean withDescriptions)
    {
        try
        {
            String retVal;
        retVal = port.iMachineDebuggerGetStats(obj, pattern, withDescriptions);
           return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Get the load percentages (as observed by the VMM) for all virtual CPUs
or a specific one.
@param cpuId The ID of the virtual CPU to retrieve stats for, pass 0x7fffffff
or higher for the average accross all CPUs.

@param pctExecuting Percentage of the interval that the CPU(s) spend executing guest code.

@param pctHalted Percentage of the interval that the CPU(s) spend halted.

@param pctOther Percentage of the interval that the CPU(s) preempted by the host
scheduler, on virtualization overhead and on other tasks.

@return The interval the percentage was calculated over in milliseconds

*/
    public Long getCPULoad(Long cpuId, Holder<Long> pctExecuting, Holder<Long> pctHalted, Holder<Long> pctOther)
    {
        try
        {
        jakarta.xml.ws.Holder<Long> tmp_pctExecuting = new jakarta.xml.ws.Holder<Long>();
        jakarta.xml.ws.Holder<Long> tmp_pctHalted = new jakarta.xml.ws.Holder<Long>();
        jakarta.xml.ws.Holder<Long> tmp_pctOther = new jakarta.xml.ws.Holder<Long>();
        jakarta.xml.ws.Holder<Long> retVal = new jakarta.xml.ws.Holder<Long>();
        port.iMachineDebuggerGetCPULoad(obj, cpuId, tmp_pctExecuting, tmp_pctHalted, tmp_pctOther, retVal);
        pctExecuting.value = tmp_pctExecuting.value;
        pctHalted.value = tmp_pctHalted.value;
        pctOther.value = tmp_pctOther.value;
           return retVal.value;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Creates a sample report of the guest and emulated device activity.
@param filename The file to dump the report to.

@param usInterval The sample interval.

@param usSampleTime The number of microseconds to sample.

@return The progress object on return.

*/
    public org.virtualbox_7_0.IProgress takeGuestSample(String filename, Long usInterval, Long usSampleTime)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineDebuggerTakeGuestSample(obj, filename, usInterval, usSampleTime);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        finally
        {
            getObjMgr().allowObjRelease();
        }
    }
    // Skipping method getUVMAndVMMFunctionTable for it is suppressed
}
