
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
 * IVRDEServerInfo.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;
import java.util.List;


/**
Contains information about the remote desktop (VRDE) server capabilities and status.
This is used in the{@link org.virtualbox_7_0.IConsole#getVRDEServerInfo()}attribute.

Interface ID: <code>{C39EF4D6-7532-45E8-96DA-EB5986AE76E4}</code>
*/
public class IVRDEServerInfo
{

    private org.virtualbox_7_0.jaxws.IVRDEServerInfo real;
    private VboxPortType port;
    private ObjectRefManager objMgr;

    public IVRDEServerInfo(org.virtualbox_7_0.jaxws.IVRDEServerInfo real, ObjectRefManager objMgr, VboxPortType port)
    {
        this.real = real;
        this.port = port;
        this.objMgr = objMgr;
    }

    private ObjectRefManager getObjMgr()
    {
        return this.objMgr;
    }

/**
Whether the remote desktop connection is active.
@return Boolean
*/
    public Boolean getActive()
    {
        Boolean retVal = real.isActive();
        return retVal;
    }

/**
VRDE server port number. If this property is equal to<code>0</code>, then
the VRDE server failed to start, usually because there are no free IP
ports to bind to. If this property is equal to<code>-1</code>, then the VRDE
server has not yet been started.
@return Integer
*/
    public Integer getPort()
    {
        Integer retVal = real.getPort();
        return retVal;
    }

/**
How many times a client connected.
@return Long
*/
    public Long getNumberOfClients()
    {
        Long retVal = real.getNumberOfClients();
        return retVal;
    }

/**
When the last connection was established, in milliseconds since 1970-01-01 UTC.
@return Long
*/
    public Long getBeginTime()
    {
        Long retVal = real.getBeginTime();
        return retVal;
    }

/**
When the last connection was terminated or the current time, if
connection is still active, in milliseconds since 1970-01-01 UTC.
@return Long
*/
    public Long getEndTime()
    {
        Long retVal = real.getEndTime();
        return retVal;
    }

/**
How many bytes were sent in last or current, if still active, connection.
@return Long
*/
    public Long getBytesSent()
    {
        Long retVal = real.getBytesSent();
        return retVal;
    }

/**
How many bytes were sent in all connections.
@return Long
*/
    public Long getBytesSentTotal()
    {
        Long retVal = real.getBytesSentTotal();
        return retVal;
    }

/**
How many bytes were received in last or current, if still active, connection.
@return Long
*/
    public Long getBytesReceived()
    {
        Long retVal = real.getBytesReceived();
        return retVal;
    }

/**
How many bytes were received in all connections.
@return Long
*/
    public Long getBytesReceivedTotal()
    {
        Long retVal = real.getBytesReceivedTotal();
        return retVal;
    }

/**
Login user name supplied by the client.
@return String
*/
    public String getUser()
    {
        String retVal = real.getUser();
        return retVal;
    }

/**
Login domain name supplied by the client.
@return String
*/
    public String getDomain()
    {
        String retVal = real.getDomain();
        return retVal;
    }

/**
The client name supplied by the client.
@return String
*/
    public String getClientName()
    {
        String retVal = real.getClientName();
        return retVal;
    }

/**
The IP address of the client.
@return String
*/
    public String getClientIP()
    {
        String retVal = real.getClientIP();
        return retVal;
    }

/**
The client software version number.
@return Long
*/
    public Long getClientVersion()
    {
        Long retVal = real.getClientVersion();
        return retVal;
    }

/**
Public key exchange method used when connection was established.
Values: 0 - RDP4 public key exchange scheme.
1 - X509 certificates were sent to client.
@return Long
*/
    public Long getEncryptionStyle()
    {
        Long retVal = real.getEncryptionStyle();
        return retVal;
    }
}
