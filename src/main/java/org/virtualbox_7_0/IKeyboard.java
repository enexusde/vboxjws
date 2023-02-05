
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
 * IKeyboard.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;
import java.util.List;


/**
The IKeyboard interface represents the virtual machine's keyboard. Used
in{@link org.virtualbox_7_0.IConsole#getKeyboard()}.

Use this interface to send keystrokes or the Ctrl-Alt-Del sequence
to the virtual machine.

Interface ID: <code>{755E6BDF-1640-41F9-BD74-3EF5FD653250}</code>
*/
public class IKeyboard extends IUnknown
{

    public IKeyboard(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Current status of the guest keyboard LEDs.
@return List&lt;org.virtualbox_7_0.KeyboardLED&gt;
*/
    public List<org.virtualbox_7_0.KeyboardLED> getKeyboardLEDs()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.KeyboardLED> retVal = port.iKeyboardGetKeyboardLEDs(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.KeyboardLED.class, org.virtualbox_7_0.KeyboardLED.class, retVal);
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
Event source for keyboard events.
@return org.virtualbox_7_0.IEventSource
*/
    public org.virtualbox_7_0.IEventSource getEventSource()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iKeyboardGetEventSource(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IEventSource(retVal, getObjMgr(), port) : null;
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
    public static IKeyboard queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IKeyboard(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Sends a scancode to the keyboard.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_IPRT_ERROR</code> - Could not send scan code to virtual keyboard.</dd>
</dl>

*/
    public void putScancode(Integer scancode)
    {
        try
        {
        port.iKeyboardPutScancode(obj, scancode);
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
Sends an array of scancodes to the keyboard.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_IPRT_ERROR</code> - Could not send all scan codes to virtual keyboard.</dd>
</dl>

*/
    public Long putScancodes(List<Integer> scancodes)
    {
        try
        {
            Long retVal;
        retVal = port.iKeyboardPutScancodes(obj, scancodes);
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
Sends the Ctrl-Alt-Del sequence to the keyboard. This
function is nothing special, it is just a convenience function
calling{@link org.virtualbox_7_0.IKeyboard#putScancodes(List)}with the proper scancodes.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_IPRT_ERROR</code> - Could not send all scan codes to virtual keyboard.</dd>
</dl>

*/
    public void putCAD()
    {
        try
        {
        port.iKeyboardPutCAD(obj);
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
Causes the virtual keyboard to release any keys which are
currently pressed. Useful when host and guest keyboard may be out
of sync.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_IPRT_ERROR</code> - Could not release some or all keys.</dd>
</dl>

*/
    public void releaseKeys()
    {
        try
        {
        port.iKeyboardReleaseKeys(obj);
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
Sends a USB HID usage code and page to the keyboard. The
keyRelease flag is set when the key is being released.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_IPRT_ERROR</code> - Could not send usage code to virtual keyboard.</dd>
</dl>

*/
    public void putUsageCode(Integer usageCode, Integer usagePage, Boolean keyRelease)
    {
        try
        {
        port.iKeyboardPutUsageCode(obj, usageCode, usagePage, keyRelease);
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
