
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
 * IDisplay.java
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
 * The IDisplay interface represents the virtual machine's display.
 * 
 * The object implementing this interface is contained in each
 * {@link org.virtualbox_4_2.IConsole#getDisplay()} attribute and represents the
 * visual output of the virtual machine.
 * 
 * The virtual display supports pluggable output targets represented by the
 * IFramebuffer interface. Examples of the output target are a window on the
 * host computer or an RDP session's display on a remote computer.
 * 
 * Interface ID: <tt>{B83EE395-8679-40CA-8D60-1A0CBE724930}</tt>
 */
public class IDisplay extends IUnknown {

	public IDisplay(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	public static IDisplay queryInterface(IUnknown obj) {
		return obj == null ? null : new IDisplay(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * Queries display width, height and color depth for given screen.
	 */
	public void getScreenResolution(Long screenId, Holder<Long> width, Holder<Long> height, Holder<Long> bitsPerPixel) {
		try {
			javax.xml.ws.Holder<Long> tmp_width = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_height = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_bitsPerPixel = new javax.xml.ws.Holder<Long>();
			port.iDisplayGetScreenResolution(obj, screenId, tmp_width, tmp_height, tmp_bitsPerPixel);
			width.value = tmp_width.value;
			height.value = tmp_height.value;
			bitsPerPixel.value = tmp_bitsPerPixel.value;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Asks VirtualBox to request the given video mode from the guest. This is just
	 * a hint and it cannot be guaranteed that the requested resolution will be
	 * used. Guest Additions are required for the request to be seen by guests. The
	 * caller should issue the request and wait for a resolution change and after a
	 * timeout retry.
	 * 
	 * Specifying 0 for either width, height or bitsPerPixel parameters means that
	 * the corresponding values should be taken from the current video mode (i.e.
	 * left unchanged).
	 * 
	 * If the guest OS supports multi-monitor configuration then the display
	 * parameter specifies the number of the guest display to send the hint to: 0 is
	 * the primary display, 1 is the first secondary and so on. If the multi-monitor
	 * configuration is not supported, display must be 0.
	 * 
	 * 
	 * @param display      The number of the guest display to send the hint to.
	 * 
	 * 
	 * @param enabled      True, if this guest screen is enabled, False otherwise.
	 * 
	 * 
	 * @param changeOrigin True, if the origin of the guest screen should be
	 *                     changed, False otherwise.
	 * 
	 * 
	 * @param originX      The X origin of the guest screen.
	 * 
	 * 
	 * @param originY      The Y origin of the guest screen.
	 * 
	 * 
	 *                     Expected result codes:
	 *                     <table>
	 *                     <tr>
	 *                     <td>E_INVALIDARG</td>
	 *                     <td>The display is not associated with any monitor.</td>
	 *                     <tr>
	 *                     </table>
	 * 
	 */
	public void setVideoModeHint(Long display, Boolean enabled, Boolean changeOrigin, Integer originX, Integer originY,
			Long width, Long height, Long bitsPerPixel) {
		try {
			port.iDisplaySetVideoModeHint(obj, display, enabled, changeOrigin, originX, originY, width, height,
					bitsPerPixel);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Enables or disables seamless guest display rendering (seamless desktop
	 * integration) mode.
	 * 
	 * NOTE: Calling this method has no effect if
	 * {@link org.virtualbox_4_2.IGuest#getFacilityStatus(org.virtualbox_4_2.AdditionsFacilityType,Holder)}
	 * with facility Seamless does not return Active.
	 * 
	 * 
	 */
	public void setSeamlessMode(Boolean enabled) {
		try {
			port.iDisplaySetSeamlessMode(obj, enabled);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Takes a guest screen shot of the requested size and returns it as an array of
	 * bytes in uncompressed 32-bit RGBA format. A pixel consists of 4 bytes in
	 * order: R, G, B, 0xFF.
	 * 
	 * This API is slow, but could be the only option to get guest screenshot for
	 * scriptable languages not allowed to manipulate with addresses directly.
	 * 
	 * 
	 * @param screenId Monitor to take screenshot from.
	 * 
	 * 
	 * @param width    Desired image width.
	 * 
	 * 
	 * @param height   Desired image height.
	 * 
	 * 
	 * @return Array with resulting screen data.
	 * 
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>E_NOTIMPL</td>
	 *         <td>Feature not implemented.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>Could not take a screenshot.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public byte[] takeScreenShotToArray(Long screenId, Long width, Long height) {
		try {
			/* base64 */String retVal;
			retVal = port.iDisplayTakeScreenShotToArray(obj, screenId, width, height);
			return Helper.decodeBase64(retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Takes a guest screen shot of the requested size and returns it as PNG image
	 * in array.
	 * 
	 * 
	 * @param screenId Monitor to take the screenshot from.
	 * 
	 * 
	 * @param width    Desired image width.
	 * 
	 * 
	 * @param height   Desired image height.
	 * 
	 * 
	 * @return Array with resulting screen data.
	 * 
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>E_NOTIMPL</td>
	 *         <td>Feature not implemented.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>Could not take a screenshot.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public byte[] takeScreenShotPNGToArray(Long screenId, Long width, Long height) {
		try {
			/* base64 */String retVal;
			retVal = port.iDisplayTakeScreenShotPNGToArray(obj, screenId, width, height);
			return Helper.decodeBase64(retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Does a full invalidation of the VM display and instructs the VM to update it.
	 * 
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 * <td>Could not invalidate and update screen.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public void invalidateAndUpdate() {
		try {
			port.iDisplayInvalidateAndUpdate(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Signals that a framebuffer has completed the resize operation.
	 * 
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_NOT_SUPPORTED VBOX_E_NOT_SUPPORTED</td>
	 * <td>Operation only valid for external frame buffers.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public void resizeCompleted(Long screenId) {
		try {
			port.iDisplayResizeCompleted(obj, screenId);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Signals that framebuffer window viewport has changed.
	 * 
	 * 
	 * @param screenId Monitor to take the screenshot from.
	 * 
	 * 
	 * @param x        Framebuffer x offset.
	 * 
	 * 
	 * @param y        Framebuffer y offset.
	 * 
	 * 
	 * @param width    Viewport width.
	 * 
	 * 
	 * @param height   Viewport height.
	 * 
	 * 
	 *                 Expected result codes:
	 *                 <table>
	 *                 <tr>
	 *                 <td>E_INVALIDARG</td>
	 *                 <td>The specified viewport data is invalid.</td>
	 *                 <tr>
	 *                 </table>
	 * 
	 */
	public void viewportChanged(Long screenId, Long x, Long y, Long width, Long height) {
		try {
			port.iDisplayViewportChanged(obj, screenId, x, y, width, height);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}
