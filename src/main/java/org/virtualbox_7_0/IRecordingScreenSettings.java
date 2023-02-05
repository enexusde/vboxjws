
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
 * IRecordingScreenSettings.java
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
The IRecordingScreenSettings interface represents recording settings of a
single virtual screen. This is used only in the{@link org.virtualbox_7_0.IRecordingSettings}interface.

Interface ID: <code>{C1844087-EC6B-488D-AFBB-C90F6452A04B}</code>
*/
public class IRecordingScreenSettings extends IUnknown
{

    public IRecordingScreenSettings(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
This attribute contains the screen ID bound to these settings.
@return Long
*/
    public Long getId()
    {
        try
        {
            Long retVal = port.iRecordingScreenSettingsGetId(obj);
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
This setting determines whether this screen is enabled while recording.
@return Boolean
*/
    public Boolean getEnabled()
    {
        try
        {
            Boolean retVal = port.iRecordingScreenSettingsGetEnabled(obj);
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
This setting determines whether this screen is enabled while recording.
@param value Boolean

*/
    public void setEnabled(Boolean value)
    {
        try
        {
        port.iRecordingScreenSettingsSetEnabled(obj, value);
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
This setting determines all enabled recording features for this
screen.
@return List&lt;org.virtualbox_7_0.RecordingFeature&gt;
*/
    public List<org.virtualbox_7_0.RecordingFeature> getFeatures()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.RecordingFeature> retVal = port.iRecordingScreenSettingsGetFeatures(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.RecordingFeature.class, org.virtualbox_7_0.RecordingFeature.class, retVal);
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
This setting determines all enabled recording features for this
screen.
@param value List&lt;org.virtualbox_7_0.RecordingFeature&gt;

*/
    public void setFeatures(List<org.virtualbox_7_0.RecordingFeature> value)
    {
        try
        {
        port.iRecordingScreenSettingsSetFeatures(obj, Helper.convertEnums(org.virtualbox_7_0.RecordingFeature.class, org.virtualbox_7_0.jaxws.RecordingFeature.class, value));
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
This setting determines the recording destination for this
screen.
@return org.virtualbox_7_0.RecordingDestination
*/
    public org.virtualbox_7_0.RecordingDestination getDestination()
    {
        try
        {
            org.virtualbox_7_0.jaxws.RecordingDestination retVal = port.iRecordingScreenSettingsGetDestination(obj);
            return org.virtualbox_7_0.RecordingDestination.fromValue(retVal.value());
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
This setting determines the recording destination for this
screen.
@param value org.virtualbox_7_0.RecordingDestination

*/
    public void setDestination(org.virtualbox_7_0.RecordingDestination value)
    {
        try
        {
        port.iRecordingScreenSettingsSetDestination(obj, org.virtualbox_7_0.jaxws.RecordingDestination.fromValue(value.name()));
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
This setting determines the filename VirtualBox uses to save
the recorded content. This setting cannot be changed while video
recording is enabled.
NOTE: When setting this attribute, the specified path has to be
absolute (full path). When reading this attribute, a full path is
always returned.

@return String
*/
    public String getFilename()
    {
        try
        {
            String retVal = port.iRecordingScreenSettingsGetFilename(obj);
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
This setting determines the filename VirtualBox uses to save
the recorded content. This setting cannot be changed while video
recording is enabled.
NOTE: When setting this attribute, the specified path has to be
absolute (full path). When reading this attribute, a full path is
always returned.

@param value String

*/
    public void setFilename(String value)
    {
        try
        {
        port.iRecordingScreenSettingsSetFilename(obj, value);
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
This setting defines the maximum amount of time in seconds
to record. Recording will stop as soon as the defined time
interval has elapsed. If this value is zero, recording will not be
limited by time. This setting cannot be changed while recording is
enabled.
@return Long
*/
    public Long getMaxTime()
    {
        try
        {
            Long retVal = port.iRecordingScreenSettingsGetMaxTime(obj);
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
This setting defines the maximum amount of time in seconds
to record. Recording will stop as soon as the defined time
interval has elapsed. If this value is zero, recording will not be
limited by time. This setting cannot be changed while recording is
enabled.
@param value Long

*/
    public void setMaxTime(Long value)
    {
        try
        {
        port.iRecordingScreenSettingsSetMaxTime(obj, value);
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
This setting determines the maximal number of recording file
size in MB. Recording will stop as soon as the file size has
reached the defined value. If this value is zero, recording
will not be limited by the file size. This setting cannot be changed
while recording is enabled.
@return Long
*/
    public Long getMaxFileSize()
    {
        try
        {
            Long retVal = port.iRecordingScreenSettingsGetMaxFileSize(obj);
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
This setting determines the maximal number of recording file
size in MB. Recording will stop as soon as the file size has
reached the defined value. If this value is zero, recording
will not be limited by the file size. This setting cannot be changed
while recording is enabled.
@param value Long

*/
    public void setMaxFileSize(Long value)
    {
        try
        {
        port.iRecordingScreenSettingsSetMaxFileSize(obj, value);
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
This setting contains any additional recording options required in
comma-separated key=value format, which are currently not represented
via own attribtues. Consider these options as experimental and mostly
for codec-specific settings, and are subject to change. This setting
cannot be changed while recording is enabled.
@return String
*/
    public String getOptions()
    {
        try
        {
            String retVal = port.iRecordingScreenSettingsGetOptions(obj);
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
This setting contains any additional recording options required in
comma-separated key=value format, which are currently not represented
via own attribtues. Consider these options as experimental and mostly
for codec-specific settings, and are subject to change. This setting
cannot be changed while recording is enabled.
@param value String

*/
    public void setOptions(String value)
    {
        try
        {
        port.iRecordingScreenSettingsSetOptions(obj, value);
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
Determines the audio codec to use for encoding the
recorded audio data. This setting cannot be changed while recording is
enabled.
NOTE: Only the Opus codec is supported currently.

@return org.virtualbox_7_0.RecordingAudioCodec
*/
    public org.virtualbox_7_0.RecordingAudioCodec getAudioCodec()
    {
        try
        {
            org.virtualbox_7_0.jaxws.RecordingAudioCodec retVal = port.iRecordingScreenSettingsGetAudioCodec(obj);
            return org.virtualbox_7_0.RecordingAudioCodec.fromValue(retVal.value());
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
Determines the audio codec to use for encoding the
recorded audio data. This setting cannot be changed while recording is
enabled.
NOTE: Only the Opus codec is supported currently.

@param value org.virtualbox_7_0.RecordingAudioCodec

*/
    public void setAudioCodec(org.virtualbox_7_0.RecordingAudioCodec value)
    {
        try
        {
        port.iRecordingScreenSettingsSetAudioCodec(obj, org.virtualbox_7_0.jaxws.RecordingAudioCodec.fromValue(value.name()));
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
Determines the audio rate control mode. This setting cannot be changed
while recording is enabled.
@return org.virtualbox_7_0.RecordingRateControlMode
*/
    public org.virtualbox_7_0.RecordingRateControlMode getAudioRateControlMode()
    {
        try
        {
            org.virtualbox_7_0.jaxws.RecordingRateControlMode retVal = port.iRecordingScreenSettingsGetAudioRateControlMode(obj);
            return org.virtualbox_7_0.RecordingRateControlMode.fromValue(retVal.value());
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
Determines the audio rate control mode. This setting cannot be changed
while recording is enabled.
@param value org.virtualbox_7_0.RecordingRateControlMode

*/
    public void setAudioRateControlMode(org.virtualbox_7_0.RecordingRateControlMode value)
    {
        try
        {
        port.iRecordingScreenSettingsSetAudioRateControlMode(obj, org.virtualbox_7_0.jaxws.RecordingRateControlMode.fromValue(value.name()));
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
Determines the audio deadline to use.
This setting cannot be changed while recording is enabled.
@return org.virtualbox_7_0.RecordingCodecDeadline
*/
    public org.virtualbox_7_0.RecordingCodecDeadline getAudioDeadline()
    {
        try
        {
            org.virtualbox_7_0.jaxws.RecordingCodecDeadline retVal = port.iRecordingScreenSettingsGetAudioDeadline(obj);
            return org.virtualbox_7_0.RecordingCodecDeadline.fromValue(retVal.value());
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
Determines the audio deadline to use.
This setting cannot be changed while recording is enabled.
@param value org.virtualbox_7_0.RecordingCodecDeadline

*/
    public void setAudioDeadline(org.virtualbox_7_0.RecordingCodecDeadline value)
    {
        try
        {
        port.iRecordingScreenSettingsSetAudioDeadline(obj, org.virtualbox_7_0.jaxws.RecordingCodecDeadline.fromValue(value.name()));
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
Determines the Hertz (Hz) rate of the recorded audio data. This setting
cannot be changed while recording is enabled.
@return Long
*/
    public Long getAudioHz()
    {
        try
        {
            Long retVal = port.iRecordingScreenSettingsGetAudioHz(obj);
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
Determines the Hertz (Hz) rate of the recorded audio data. This setting
cannot be changed while recording is enabled.
@param value Long

*/
    public void setAudioHz(Long value)
    {
        try
        {
        port.iRecordingScreenSettingsSetAudioHz(obj, value);
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
Determines the bits per sample of the recorded audio data. This setting
cannot be changed while recording is enabled.
@return Long
*/
    public Long getAudioBits()
    {
        try
        {
            Long retVal = port.iRecordingScreenSettingsGetAudioBits(obj);
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
Determines the bits per sample of the recorded audio data. This setting
cannot be changed while recording is enabled.
@param value Long

*/
    public void setAudioBits(Long value)
    {
        try
        {
        port.iRecordingScreenSettingsSetAudioBits(obj, value);
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
Determines the audio channels of the recorded audio data.
Specifiy 2 for stereo or 1 for mono. More than stereo (2) channels
are not supported at the moment. This setting cannot be changed while
recording is enabled.
@return Long
*/
    public Long getAudioChannels()
    {
        try
        {
            Long retVal = port.iRecordingScreenSettingsGetAudioChannels(obj);
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
Determines the audio channels of the recorded audio data.
Specifiy 2 for stereo or 1 for mono. More than stereo (2) channels
are not supported at the moment. This setting cannot be changed while
recording is enabled.
@param value Long

*/
    public void setAudioChannels(Long value)
    {
        try
        {
        port.iRecordingScreenSettingsSetAudioChannels(obj, value);
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
Determines the video codec to use for encoding the recorded video data.
This setting cannot be changed while recording is enabled.
NOTE: Only the VP8 codec is supported currently.

@return org.virtualbox_7_0.RecordingVideoCodec
*/
    public org.virtualbox_7_0.RecordingVideoCodec getVideoCodec()
    {
        try
        {
            org.virtualbox_7_0.jaxws.RecordingVideoCodec retVal = port.iRecordingScreenSettingsGetVideoCodec(obj);
            return org.virtualbox_7_0.RecordingVideoCodec.fromValue(retVal.value());
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
Determines the video codec to use for encoding the recorded video data.
This setting cannot be changed while recording is enabled.
NOTE: Only the VP8 codec is supported currently.

@param value org.virtualbox_7_0.RecordingVideoCodec

*/
    public void setVideoCodec(org.virtualbox_7_0.RecordingVideoCodec value)
    {
        try
        {
        port.iRecordingScreenSettingsSetVideoCodec(obj, org.virtualbox_7_0.jaxws.RecordingVideoCodec.fromValue(value.name()));
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
Determines the video deadline to use.
This setting cannot be changed while recording is enabled.
@return org.virtualbox_7_0.RecordingCodecDeadline
*/
    public org.virtualbox_7_0.RecordingCodecDeadline getVideoDeadline()
    {
        try
        {
            org.virtualbox_7_0.jaxws.RecordingCodecDeadline retVal = port.iRecordingScreenSettingsGetVideoDeadline(obj);
            return org.virtualbox_7_0.RecordingCodecDeadline.fromValue(retVal.value());
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
Determines the video deadline to use.
This setting cannot be changed while recording is enabled.
@param value org.virtualbox_7_0.RecordingCodecDeadline

*/
    public void setVideoDeadline(org.virtualbox_7_0.RecordingCodecDeadline value)
    {
        try
        {
        port.iRecordingScreenSettingsSetVideoDeadline(obj, org.virtualbox_7_0.jaxws.RecordingCodecDeadline.fromValue(value.name()));
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
Determines the horizontal resolution of the recorded video data. This
setting cannot be changed while recording is enabled.
@return Long
*/
    public Long getVideoWidth()
    {
        try
        {
            Long retVal = port.iRecordingScreenSettingsGetVideoWidth(obj);
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
Determines the horizontal resolution of the recorded video data. This
setting cannot be changed while recording is enabled.
@param value Long

*/
    public void setVideoWidth(Long value)
    {
        try
        {
        port.iRecordingScreenSettingsSetVideoWidth(obj, value);
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
Determines the vertical resolution of the recorded video data. This
setting cannot be changed while recording is enabled.
@return Long
*/
    public Long getVideoHeight()
    {
        try
        {
            Long retVal = port.iRecordingScreenSettingsGetVideoHeight(obj);
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
Determines the vertical resolution of the recorded video data. This
setting cannot be changed while recording is enabled.
@param value Long

*/
    public void setVideoHeight(Long value)
    {
        try
        {
        port.iRecordingScreenSettingsSetVideoHeight(obj, value);
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
Determines the bitrate in kilobits per second. Increasing this value
makes the video look better for the cost of an increased file size or
transfer rate. This setting cannot be changed while recording is enabled.
@return Long
*/
    public Long getVideoRate()
    {
        try
        {
            Long retVal = port.iRecordingScreenSettingsGetVideoRate(obj);
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
Determines the bitrate in kilobits per second. Increasing this value
makes the video look better for the cost of an increased file size or
transfer rate. This setting cannot be changed while recording is enabled.
@param value Long

*/
    public void setVideoRate(Long value)
    {
        try
        {
        port.iRecordingScreenSettingsSetVideoRate(obj, value);
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
Determines the video rate control mode. This setting cannot be changed
while recording is enabled.
@return org.virtualbox_7_0.RecordingRateControlMode
*/
    public org.virtualbox_7_0.RecordingRateControlMode getVideoRateControlMode()
    {
        try
        {
            org.virtualbox_7_0.jaxws.RecordingRateControlMode retVal = port.iRecordingScreenSettingsGetVideoRateControlMode(obj);
            return org.virtualbox_7_0.RecordingRateControlMode.fromValue(retVal.value());
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
Determines the video rate control mode. This setting cannot be changed
while recording is enabled.
@param value org.virtualbox_7_0.RecordingRateControlMode

*/
    public void setVideoRateControlMode(org.virtualbox_7_0.RecordingRateControlMode value)
    {
        try
        {
        port.iRecordingScreenSettingsSetVideoRateControlMode(obj, org.virtualbox_7_0.jaxws.RecordingRateControlMode.fromValue(value.name()));
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
Determines the maximum number of frames per second (FPS). Frames with
a higher frequency will be skipped. Reducing this value increases the
number of skipped frames and reduces the file size or transfer rate.
This setting cannot be changed while recording is enabled.
@return Long
*/
    public Long getVideoFPS()
    {
        try
        {
            Long retVal = port.iRecordingScreenSettingsGetVideoFPS(obj);
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
Determines the maximum number of frames per second (FPS). Frames with
a higher frequency will be skipped. Reducing this value increases the
number of skipped frames and reduces the file size or transfer rate.
This setting cannot be changed while recording is enabled.
@param value Long

*/
    public void setVideoFPS(Long value)
    {
        try
        {
        port.iRecordingScreenSettingsSetVideoFPS(obj, value);
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
Determines the video scaling mode to use.
This setting cannot be changed while recording is enabled.
@return org.virtualbox_7_0.RecordingVideoScalingMode
*/
    public org.virtualbox_7_0.RecordingVideoScalingMode getVideoScalingMode()
    {
        try
        {
            org.virtualbox_7_0.jaxws.RecordingVideoScalingMode retVal = port.iRecordingScreenSettingsGetVideoScalingMode(obj);
            return org.virtualbox_7_0.RecordingVideoScalingMode.fromValue(retVal.value());
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
Determines the video scaling mode to use.
This setting cannot be changed while recording is enabled.
@param value org.virtualbox_7_0.RecordingVideoScalingMode

*/
    public void setVideoScalingMode(org.virtualbox_7_0.RecordingVideoScalingMode value)
    {
        try
        {
        port.iRecordingScreenSettingsSetVideoScalingMode(obj, org.virtualbox_7_0.jaxws.RecordingVideoScalingMode.fromValue(value.name()));
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
    public static IRecordingScreenSettings queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IRecordingScreenSettings(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Returns whether a particular recording feature is enabled for this
screen or not.
@param feature Feature to check for.

@return true if the feature is enabled,  false if not.

*/
    public Boolean isFeatureEnabled(org.virtualbox_7_0.RecordingFeature feature)
    {
        try
        {
            Boolean retVal;
        retVal = port.iRecordingScreenSettingsIsFeatureEnabled(obj, org.virtualbox_7_0.jaxws.RecordingFeature.fromValue(feature.name()));
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
}
