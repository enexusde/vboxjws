
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
 * IDisplay.java
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
The IDisplay interface represents the virtual machine's display.

The object implementing this interface is contained in each{@link org.virtualbox_7_0.IConsole#getDisplay()}attribute and represents the visual
output of the virtual machine.

The virtual display supports pluggable output targets represented by the
IFramebuffer interface. Examples of the output target are a window on
the host computer or an RDP session's display on a remote computer.

Interface ID: <code>{4680B2DE-8690-11E9-B83D-5719E53CF1DE}</code>
*/
public class IDisplay extends IUnknown
{

    public IDisplay(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Layout of the guest screens.
@return List&lt;org.virtualbox_7_0.IGuestScreenInfo&gt;
*/
    public List<org.virtualbox_7_0.IGuestScreenInfo> getGuestScreenLayout()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iDisplayGetGuestScreenLayout(obj);
            return Helper.wrap(org.virtualbox_7_0.IGuestScreenInfo.class, getObjMgr(), port, retVal);
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
    public static IDisplay queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IDisplay(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Queries certain attributes such as display width, height, color depth
and the X and Y origin for a given guest screen.

The parameters  xOrigin and  yOrigin return the X and Y
coordinates of the framebuffer's origin.

All return parameters are optional.
*/
    public void getScreenResolution(Long screenId, Holder<Long> width, Holder<Long> height, Holder<Long> bitsPerPixel, Holder<Integer> xOrigin, Holder<Integer> yOrigin, Holder<org.virtualbox_7_0.GuestMonitorStatus> guestMonitorStatus)
    {
        try
        {
        jakarta.xml.ws.Holder<Long> tmp_width = new jakarta.xml.ws.Holder<Long>();
        jakarta.xml.ws.Holder<Long> tmp_height = new jakarta.xml.ws.Holder<Long>();
        jakarta.xml.ws.Holder<Long> tmp_bitsPerPixel = new jakarta.xml.ws.Holder<Long>();
        jakarta.xml.ws.Holder<Integer> tmp_xOrigin = new jakarta.xml.ws.Holder<Integer>();
        jakarta.xml.ws.Holder<Integer> tmp_yOrigin = new jakarta.xml.ws.Holder<Integer>();
        jakarta.xml.ws.Holder<org.virtualbox_7_0.jaxws.GuestMonitorStatus> tmp_guestMonitorStatus = new jakarta.xml.ws.Holder<org.virtualbox_7_0.jaxws.GuestMonitorStatus>();
        port.iDisplayGetScreenResolution(obj, screenId, tmp_width, tmp_height, tmp_bitsPerPixel, tmp_xOrigin, tmp_yOrigin, tmp_guestMonitorStatus);
        width.value = tmp_width.value;
        height.value = tmp_height.value;
        bitsPerPixel.value = tmp_bitsPerPixel.value;
        xOrigin.value = tmp_xOrigin.value;
        yOrigin.value = tmp_yOrigin.value;
        guestMonitorStatus.value = org.virtualbox_7_0.GuestMonitorStatus.fromValue(tmp_guestMonitorStatus.value.value());
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
Sets the graphics update target for a screen.
*/
    public String attachFramebuffer(Long screenId, org.virtualbox_7_0.IFramebuffer framebuffer)
    {
        try
        {
            String retVal;
        retVal = port.iDisplayAttachFramebuffer(obj, screenId, ((framebuffer == null) ? null :framebuffer.getWrapped()));
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
Removes the graphics updates target for a screen.
*/
    public void detachFramebuffer(Long screenId, String id)
    {
        try
        {
        port.iDisplayDetachFramebuffer(obj, screenId, id);
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
Queries the graphics updates targets for a screen.
*/
    public org.virtualbox_7_0.IFramebuffer queryFramebuffer(Long screenId)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iDisplayQueryFramebuffer(obj, screenId);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IFramebuffer(retVal, getObjMgr(), port) : null;
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

/**
Changes the monitor information reported by a given output of the guest
graphics device.  This information can be read by the guest if suitable
drivers and driver tools are available, including but not limited to
those in the Guest Additions.  The guest will receive monitor hotplug
notification when the monitor information is changed, and the
information itself will be available to the guest until the next change.
The information should not be resent if the guest does not resize in
response.  The guest might have chosen to ignore the change, or the
resize might happen later when a suitable driver is started.

Specifying  0 for either  width,  height or  bitsPerPixel
parameters means that the corresponding values should be taken from the
current video mode (i.e. left unchanged).

TODO Rename this to  setMonitorInfo for 7.0.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - The  display value is higher then the number of outputs.</dd>
</dl>

@param display The number of the guest output to change.

@param enabled True if a monitor is connected,
False otherwise.

@param changeOrigin True, if the position of the guest screen is specified,
False otherwise.

@param originX The X origin of the guest screen.

@param originY The Y origin of the guest screen.

@param width The width of the guest screen.

@param height The height of the guest screen.

@param bitsPerPixel The number of bits per pixel of the guest screen.

@param notify Whether the guest should be notified of the change.  Normally this
is wished, but it might not be when re-setting monitor information
from the last session (no hotplug happened, as it is still the same
virtual monitor).  Might also be useful if several monitors are to be
changed at once, but this would not reflect physical hardware well,
and we also have  setScreenLayout for that.

*/
    public void setVideoModeHint(Long display, Boolean enabled, Boolean changeOrigin, Integer originX, Integer originY, Long width, Long height, Long bitsPerPixel, Boolean notify)
    {
        try
        {
        port.iDisplaySetVideoModeHint(obj, display, enabled, changeOrigin, originX, originY, width, height, bitsPerPixel, notify);
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
Queries the monitor information for a given guest output.  See
setVideoModeHint.  If no monitor information has been set yet by a
front-end the preferred mode values returned will be zero.

TODO Rename this to  getMonitorInfo for 7.0.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - The  display value is higher than the number of outputs.</dd>
</dl>

@param display The number of the guest output to query.

@param enabled True if a monitor is connected,
False otherwise.

@param changeOrigin True, if the position of the guest screen was specified,
False otherwise.

@param originX The X origin of the guest screen.

@param originY The Y origin of the guest screen.

@param width The width of the monitor preferred mode.

@param height The height of the monitor preferred mode.

@param bitsPerPixel The number of bits per pixel of the monitor preferred mode.

*/
    public void getVideoModeHint(Long display, Holder<Boolean> enabled, Holder<Boolean> changeOrigin, Holder<Integer> originX, Holder<Integer> originY, Holder<Long> width, Holder<Long> height, Holder<Long> bitsPerPixel)
    {
        try
        {
        jakarta.xml.ws.Holder<Boolean> tmp_enabled = new jakarta.xml.ws.Holder<Boolean>();
        jakarta.xml.ws.Holder<Boolean> tmp_changeOrigin = new jakarta.xml.ws.Holder<Boolean>();
        jakarta.xml.ws.Holder<Integer> tmp_originX = new jakarta.xml.ws.Holder<Integer>();
        jakarta.xml.ws.Holder<Integer> tmp_originY = new jakarta.xml.ws.Holder<Integer>();
        jakarta.xml.ws.Holder<Long> tmp_width = new jakarta.xml.ws.Holder<Long>();
        jakarta.xml.ws.Holder<Long> tmp_height = new jakarta.xml.ws.Holder<Long>();
        jakarta.xml.ws.Holder<Long> tmp_bitsPerPixel = new jakarta.xml.ws.Holder<Long>();
        port.iDisplayGetVideoModeHint(obj, display, tmp_enabled, tmp_changeOrigin, tmp_originX, tmp_originY, tmp_width, tmp_height, tmp_bitsPerPixel);
        enabled.value = tmp_enabled.value;
        changeOrigin.value = tmp_changeOrigin.value;
        originX.value = tmp_originX.value;
        originY.value = tmp_originY.value;
        width.value = tmp_width.value;
        height.value = tmp_height.value;
        bitsPerPixel.value = tmp_bitsPerPixel.value;
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
Enables or disables seamless guest display rendering (seamless desktop
integration) mode.
NOTE: Calling this method has no effect if{@link org.virtualbox_7_0.IGuest#getFacilityStatus(org.virtualbox_7_0.AdditionsFacilityType,Holder)}with facility  Seamless
does not return  Active.

*/
    public void setSeamlessMode(Boolean enabled)
    {
        try
        {
        port.iDisplaySetSeamlessMode(obj, enabled);
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
    // Skipping method takeScreenShot for it has parameters with suppressed types

/**
Takes a guest screen shot of the requested size and format
and returns it as an array of bytes.
@param screenId The guest monitor to take screenshot from.

@param width Desired image width.

@param height Desired image height.

@param bitmapFormat The requested format.

@return Array with resulting screen data.

*/
    public byte[] takeScreenShotToArray(Long screenId, Long width, Long height, org.virtualbox_7_0.BitmapFormat bitmapFormat)
    {
        try
        {
            /*base64*/String retVal;
        retVal = port.iDisplayTakeScreenShotToArray(obj, screenId, width, height, org.virtualbox_7_0.jaxws.BitmapFormat.fromValue(bitmapFormat.name()));
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
    // Skipping method drawToScreen for it has parameters with suppressed types

/**
Does a full invalidation of the VM display and instructs the VM
to update it.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_IPRT_ERROR</code> - Could not invalidate and update screen.</dd>
</dl>

*/
    public void invalidateAndUpdate()
    {
        try
        {
        port.iDisplayInvalidateAndUpdate(obj);
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
Redraw the specified VM screen.
@param screenId The guest screen to redraw.

*/
    public void invalidateAndUpdateScreen(Long screenId)
    {
        try
        {
        port.iDisplayInvalidateAndUpdateScreen(obj, screenId);
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
    // Skipping method completeVHWACommand for it has parameters with suppressed types

/**
Signals that framebuffer window viewport has changed.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - The specified viewport data is invalid.</dd>
</dl>

@param screenId Monitor to take the screenshot from.

@param x Framebuffer x offset.

@param y Framebuffer y offset.

@param width Viewport width.

@param height Viewport height.

*/
    public void viewportChanged(Long screenId, Long x, Long y, Long width, Long height)
    {
        try
        {
        port.iDisplayViewportChanged(obj, screenId, x, y, width, height);
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
    // Skipping method querySourceBitmap for it has parameters with suppressed types

/**
Notify OpenGL HGCM host service about graphics content scaling factor change.
*/
    public void notifyScaleFactorChange(Long screenId, Long u32ScaleFactorWMultiplied, Long u32ScaleFactorHMultiplied)
    {
        try
        {
        port.iDisplayNotifyScaleFactorChange(obj, screenId, u32ScaleFactorWMultiplied, u32ScaleFactorHMultiplied);
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
Notify OpenGL HGCM host service about HiDPI monitor scaling policy change.
*/
    public void notifyHiDPIOutputPolicyChange(Boolean fUnscaledHiDPI)
    {
        try
        {
        port.iDisplayNotifyHiDPIOutputPolicyChange(obj, fUnscaledHiDPI);
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
Set video modes for the guest screens.
*/
    public void setScreenLayout(org.virtualbox_7_0.ScreenLayoutMode screenLayoutMode, List<org.virtualbox_7_0.IGuestScreenInfo> guestScreenInfo)
    {
        try
        {
        port.iDisplaySetScreenLayout(obj, org.virtualbox_7_0.jaxws.ScreenLayoutMode.fromValue(screenLayoutMode.name()), Helper.unwrap(guestScreenInfo));
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
Unplugs monitors from the virtual graphics card.
*/
    public void detachScreens(List<Integer> screenIds)
    {
        try
        {
        port.iDisplayDetachScreens(obj, screenIds);
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
Make a IGuestScreenInfo object with the provided parameters.
@param display The number of the guest display.

@param status True, if this guest screen is enabled,
False otherwise.

@param primary Whether this guest monitor must be primary.

@param changeOrigin True, if the origin of the guest screen should be changed,
False otherwise.

@param originX The X origin of the guest screen.

@param originY The Y origin of the guest screen.

@param width The width of the guest screen.

@param height The height of the guest screen.

@param bitsPerPixel The number of bits per pixel of the guest screen.

@return The created object.

*/
    public org.virtualbox_7_0.IGuestScreenInfo createGuestScreenInfo(Long display, org.virtualbox_7_0.GuestMonitorStatus status, Boolean primary, Boolean changeOrigin, Integer originX, Integer originY, Long width, Long height, Long bitsPerPixel)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iDisplayCreateGuestScreenInfo(obj, display, org.virtualbox_7_0.jaxws.GuestMonitorStatus.fromValue(status.name()), primary, changeOrigin, originX, originY, width, height, bitsPerPixel);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IGuestScreenInfo(retVal, getObjMgr(), port) : null;
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
}
