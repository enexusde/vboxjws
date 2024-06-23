
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
 * IDataStream.java
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
The IDataStream interface is used to retrieve a data stream. It is
returned by{@link org.virtualbox_7_0.IMediumIO#convertToStream(String,List,Long,Holder)}.

Interface ID: <code>{A338ED20-58D9-43AE-8B03-C1FD7088EF15}</code>
*/
public class IDataStream extends IUnknown
{

    public IDataStream(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Recommended size of a read. Requesting a larger read may be
possible in certain situations, but it is not guaranteed.
@return Long
*/
    public Long getReadSize()
    {
        try
        {
            Long retVal = port.iDataStreamGetReadSize(obj);
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
    public static IDataStream queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IDataStream(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Read data from the stream.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_TIMEOUT</code> - Waiting time has expired.</dd>
</dl>

@param size How many bytes to try read.

@param timeoutMS Timeout (in ms) for limiting the wait time for data to be available.
Pass 0 for an infinite timeout.

@return Array of data read. This may be shorter than the specified size.
Returning a zero-sized array indicates the end of the stream, if the
status is successful.

*/
    public byte[] read(Long size, Long timeoutMS)
    {
        try
        {
            /*base64*/String retVal;
        retVal = port.iDataStreamRead(obj, size, timeoutMS);
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
}
