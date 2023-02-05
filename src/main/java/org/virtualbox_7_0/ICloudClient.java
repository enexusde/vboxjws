
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
 * ICloudClient.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;
import java.util.List;

public class ICloudClient extends IUnknown
{

    public ICloudClient(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
See{@link #readCloudMachineList()}.
@return List&lt;org.virtualbox_7_0.ICloudMachine&gt;
*/
    public List<org.virtualbox_7_0.ICloudMachine> getCloudMachineList()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iCloudClientGetCloudMachineList(obj);
            return Helper.wrap(org.virtualbox_7_0.ICloudMachine.class, getObjMgr(), port, retVal);
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
See{@link #readCloudMachineStubList()}.
@return List&lt;org.virtualbox_7_0.ICloudMachine&gt;
*/
    public List<org.virtualbox_7_0.ICloudMachine> getCloudMachineStubList()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iCloudClientGetCloudMachineStubList(obj);
            return Helper.wrap(org.virtualbox_7_0.ICloudMachine.class, getObjMgr(), port, retVal);
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
    public static ICloudClient queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new ICloudClient(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Returns a form for editing the virtual system description for
exporting a local VM into a cloud custom image.
@param description Virtual system description to be edited.

@param form An IForm instance for editing the virtual system description.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress getExportDescriptionForm(org.virtualbox_7_0.IVirtualSystemDescription description, Holder<org.virtualbox_7_0.IVirtualSystemDescriptionForm> form)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        javax.xml.ws.Holder<String> tmp_form = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> retVal = new javax.xml.ws.Holder<String>();
        port.iCloudClientGetExportDescriptionForm(obj, ((description == null) ? null :description.getWrapped()), tmp_form, retVal);
        form.value = (tmp_form.value.length() > 0) ? new org.virtualbox_7_0.IVirtualSystemDescriptionForm(tmp_form.value, getObjMgr(), port) : null;
           return (retVal.value.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal.value, getObjMgr(), port) : null;
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
Export local VM into the cloud, creating a custom image.
@param description Virtual system description object which describes the
machine and all required parameters.

@param progress Progress object to track the operation completion.

*/
    public void exportVM(org.virtualbox_7_0.IVirtualSystemDescription description, org.virtualbox_7_0.IProgress progress)
    {
        try
        {
        port.iCloudClientExportVM(obj, ((description == null) ? null :description.getWrapped()), ((progress == null) ? null :progress.getWrapped()));
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
    public org.virtualbox_7_0.IProgress getLaunchDescriptionForm(org.virtualbox_7_0.IVirtualSystemDescription description, Holder<org.virtualbox_7_0.IVirtualSystemDescriptionForm> form)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        javax.xml.ws.Holder<String> tmp_form = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> retVal = new javax.xml.ws.Holder<String>();
        port.iCloudClientGetLaunchDescriptionForm(obj, ((description == null) ? null :description.getWrapped()), tmp_form, retVal);
        form.value = (tmp_form.value.length() > 0) ? new org.virtualbox_7_0.IVirtualSystemDescriptionForm(tmp_form.value, getObjMgr(), port) : null;
           return (retVal.value.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal.value, getObjMgr(), port) : null;
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
    public org.virtualbox_7_0.IProgress launchVM(org.virtualbox_7_0.IVirtualSystemDescription description)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudClientLaunchVM(obj, ((description == null) ? null :description.getWrapped()));
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

/**
Returns a form for editing the virtual system description for
import from cloud.
@param description Virtual system description to be edited.

@param form An IForm instance for editing the virtual system description.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress getImportDescriptionForm(org.virtualbox_7_0.IVirtualSystemDescription description, Holder<org.virtualbox_7_0.IVirtualSystemDescriptionForm> form)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        javax.xml.ws.Holder<String> tmp_form = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> retVal = new javax.xml.ws.Holder<String>();
        port.iCloudClientGetImportDescriptionForm(obj, ((description == null) ? null :description.getWrapped()), tmp_form, retVal);
        form.value = (tmp_form.value.length() > 0) ? new org.virtualbox_7_0.IVirtualSystemDescriptionForm(tmp_form.value, getObjMgr(), port) : null;
           return (retVal.value.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal.value, getObjMgr(), port) : null;
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
Import an existing cloud instance to the local host.
All needed parameters are passed in the description (VSD).
@param description VirtualSystemDescription object which is describing a machine and all required parameters.

@param progress Progress object to track the operation completion.

*/
    public void importInstance(org.virtualbox_7_0.IVirtualSystemDescription description, org.virtualbox_7_0.IProgress progress)
    {
        try
        {
        port.iCloudClientImportInstance(obj, ((description == null) ? null :description.getWrapped()), ((progress == null) ? null :progress.getWrapped()));
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
Create an object that represents a cloud machine with the
specified UUID.  Note that the operation is synchronous.  The
returned machine is initiatally in inaccessible state and
requires a refresh to get its data from the cloud.
@param id UUID of a cloud machine.

@return Object that represents the cloud machine with the specified UUID.

*/
    public org.virtualbox_7_0.ICloudMachine getCloudMachine(String id)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudClientGetCloudMachine(obj, id);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.ICloudMachine(retVal, getObjMgr(), port) : null;
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
Make the list of cloud machines available via{@link #getCloudMachineList()}attribute.
@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress readCloudMachineList()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudClientReadCloudMachineList(obj);
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

/**
Make the list of cloud machine stubs available via{@link #getCloudMachineStubList()}attribute.
Like with{@link #getCloudMachine(String)}, the returned machines
are initiatally inaccessible and require a refresh to get
their data from the cloud.
@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress readCloudMachineStubList()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudClientReadCloudMachineStubList(obj);
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

/**
Adopt a running instance and register it as cloud machine.
This is kinda like adding a local .vbox file as a local VM.
@param instanceId ID of an instance to be added as a cloud machine.

@param machine Object that represents the newly registered cloud machine.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress addCloudMachine(String instanceId, Holder<org.virtualbox_7_0.ICloudMachine> machine)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        javax.xml.ws.Holder<String> tmp_machine = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> retVal = new javax.xml.ws.Holder<String>();
        port.iCloudClientAddCloudMachine(obj, instanceId, tmp_machine, retVal);
        machine.value = (tmp_machine.value.length() > 0) ? new org.virtualbox_7_0.ICloudMachine(tmp_machine.value, getObjMgr(), port) : null;
           return (retVal.value.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal.value, getObjMgr(), port) : null;
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
This is transitional method that combines{@link #launchVM(org.virtualbox_7_0.IVirtualSystemDescription)}and{@link #addCloudMachine(String,Holder)}.
@param description Virtual system description object which describes the
machine and all required parameters.

@param machine Object that represents the newly created cloud machine.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress createCloudMachine(org.virtualbox_7_0.IVirtualSystemDescription description, Holder<org.virtualbox_7_0.ICloudMachine> machine)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        javax.xml.ws.Holder<String> tmp_machine = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> retVal = new javax.xml.ws.Holder<String>();
        port.iCloudClientCreateCloudMachine(obj, ((description == null) ? null :description.getWrapped()), tmp_machine, retVal);
        machine.value = (tmp_machine.value.length() > 0) ? new org.virtualbox_7_0.ICloudMachine(tmp_machine.value, getObjMgr(), port) : null;
           return (retVal.value.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal.value, getObjMgr(), port) : null;
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
Returns the list of the instances in the Cloud.
@param machineState State of each VM.

@param returnNames VM names.

@param returnIds VM ids.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress listInstances(List<org.virtualbox_7_0.CloudMachineState> machineState, Holder<org.virtualbox_7_0.IStringArray> returnNames, Holder<org.virtualbox_7_0.IStringArray> returnIds)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        javax.xml.ws.Holder<String> tmp_returnNames = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> tmp_returnIds = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> retVal = new javax.xml.ws.Holder<String>();
        port.iCloudClientListInstances(obj, Helper.convertEnums(org.virtualbox_7_0.CloudMachineState.class, org.virtualbox_7_0.jaxws.CloudMachineState.class, machineState), tmp_returnNames, tmp_returnIds, retVal);
        returnNames.value = (tmp_returnNames.value.length() > 0) ? new org.virtualbox_7_0.IStringArray(tmp_returnNames.value, getObjMgr(), port) : null;
        returnIds.value = (tmp_returnIds.value.length() > 0) ? new org.virtualbox_7_0.IStringArray(tmp_returnIds.value, getObjMgr(), port) : null;
           return (retVal.value.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal.value, getObjMgr(), port) : null;
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
Returns the list of instances in the cloud that can be
added/adopted as VirtualBox cloud machines.
@param returnNames Instance names.

@param returnIds Instance idss.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress listSourceInstances(Holder<org.virtualbox_7_0.IStringArray> returnNames, Holder<org.virtualbox_7_0.IStringArray> returnIds)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        javax.xml.ws.Holder<String> tmp_returnNames = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> tmp_returnIds = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> retVal = new javax.xml.ws.Holder<String>();
        port.iCloudClientListSourceInstances(obj, tmp_returnNames, tmp_returnIds, retVal);
        returnNames.value = (tmp_returnNames.value.length() > 0) ? new org.virtualbox_7_0.IStringArray(tmp_returnNames.value, getObjMgr(), port) : null;
        returnIds.value = (tmp_returnIds.value.length() > 0) ? new org.virtualbox_7_0.IStringArray(tmp_returnIds.value, getObjMgr(), port) : null;
           return (retVal.value.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal.value, getObjMgr(), port) : null;
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
Returns the list of the images in the Cloud.
@param imageState State of each image.

@param returnNames Images names.

@param returnIds Images ids.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress listImages(List<org.virtualbox_7_0.CloudImageState> imageState, Holder<org.virtualbox_7_0.IStringArray> returnNames, Holder<org.virtualbox_7_0.IStringArray> returnIds)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        javax.xml.ws.Holder<String> tmp_returnNames = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> tmp_returnIds = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> retVal = new javax.xml.ws.Holder<String>();
        port.iCloudClientListImages(obj, Helper.convertEnums(org.virtualbox_7_0.CloudImageState.class, org.virtualbox_7_0.jaxws.CloudImageState.class, imageState), tmp_returnNames, tmp_returnIds, retVal);
        returnNames.value = (tmp_returnNames.value.length() > 0) ? new org.virtualbox_7_0.IStringArray(tmp_returnNames.value, getObjMgr(), port) : null;
        returnIds.value = (tmp_returnIds.value.length() > 0) ? new org.virtualbox_7_0.IStringArray(tmp_returnIds.value, getObjMgr(), port) : null;
           return (retVal.value.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal.value, getObjMgr(), port) : null;
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
Returns the list of boot volumes in the Cloud.
@param returnNames Boot volume names.

@param returnIds Boot volume ids.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress listBootVolumes(Holder<org.virtualbox_7_0.IStringArray> returnNames, Holder<org.virtualbox_7_0.IStringArray> returnIds)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        javax.xml.ws.Holder<String> tmp_returnNames = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> tmp_returnIds = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> retVal = new javax.xml.ws.Holder<String>();
        port.iCloudClientListBootVolumes(obj, tmp_returnNames, tmp_returnIds, retVal);
        returnNames.value = (tmp_returnNames.value.length() > 0) ? new org.virtualbox_7_0.IStringArray(tmp_returnNames.value, getObjMgr(), port) : null;
        returnIds.value = (tmp_returnIds.value.length() > 0) ? new org.virtualbox_7_0.IStringArray(tmp_returnIds.value, getObjMgr(), port) : null;
           return (retVal.value.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal.value, getObjMgr(), port) : null;
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
Returns the list of boot volumes in the cloud that can be
added/adopted as VirtualBox cloud machines.
@param returnNames Boot volume names.

@param returnIds Boot volume ids.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress listSourceBootVolumes(Holder<org.virtualbox_7_0.IStringArray> returnNames, Holder<org.virtualbox_7_0.IStringArray> returnIds)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        javax.xml.ws.Holder<String> tmp_returnNames = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> tmp_returnIds = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> retVal = new javax.xml.ws.Holder<String>();
        port.iCloudClientListSourceBootVolumes(obj, tmp_returnNames, tmp_returnIds, retVal);
        returnNames.value = (tmp_returnNames.value.length() > 0) ? new org.virtualbox_7_0.IStringArray(tmp_returnNames.value, getObjMgr(), port) : null;
        returnIds.value = (tmp_returnIds.value.length() > 0) ? new org.virtualbox_7_0.IStringArray(tmp_returnIds.value, getObjMgr(), port) : null;
           return (retVal.value.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal.value, getObjMgr(), port) : null;
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
Returns the list of the Vnic attachements in the Cloud.
@param parameters Each parameter in the array must be in the form "name=value".

@param returnVnicAttachmentIds VM ids.

@param returnVnicIds VM ids.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress listVnicAttachments(List<String> parameters, Holder<org.virtualbox_7_0.IStringArray> returnVnicAttachmentIds, Holder<org.virtualbox_7_0.IStringArray> returnVnicIds)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        javax.xml.ws.Holder<String> tmp_returnVnicAttachmentIds = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> tmp_returnVnicIds = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> retVal = new javax.xml.ws.Holder<String>();
        port.iCloudClientListVnicAttachments(obj, parameters, tmp_returnVnicAttachmentIds, tmp_returnVnicIds, retVal);
        returnVnicAttachmentIds.value = (tmp_returnVnicAttachmentIds.value.length() > 0) ? new org.virtualbox_7_0.IStringArray(tmp_returnVnicAttachmentIds.value, getObjMgr(), port) : null;
        returnVnicIds.value = (tmp_returnVnicIds.value.length() > 0) ? new org.virtualbox_7_0.IStringArray(tmp_returnVnicIds.value, getObjMgr(), port) : null;
           return (retVal.value.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal.value, getObjMgr(), port) : null;
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
Returns the information about an instance in the Cloud.
@param uid The id of instance in the Cloud.

@param description VirtualSystemDescription object which is describing a machine

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress getInstanceInfo(String uid, org.virtualbox_7_0.IVirtualSystemDescription description)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudClientGetInstanceInfo(obj, uid, ((description == null) ? null :description.getWrapped()));
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

/**
Start an existing instance with passed id.
@param uid The id of instance in the Cloud.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress startInstance(String uid)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudClientStartInstance(obj, uid);
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

/**
Pause an existing instance with passed id.
@param uid The id of instance in the Cloud.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress pauseInstance(String uid)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudClientPauseInstance(obj, uid);
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

/**
Terminate an existing instance with passed id.
@param uid the id of instance in the Cloud.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress terminateInstance(String uid)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudClientTerminateInstance(obj, uid);
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

/**
Create an image in the Cloud.
@param parameters Each parameter in the array must be in the form "name=value".

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress createImage(List<String> parameters)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudClientCreateImage(obj, parameters);
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

/**
Export an existing VBox image in the Cloud.
@param image Reference to the existing VBox image.

@param parameters Each parameter in the array must be in the form "name=value".

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress exportImage(org.virtualbox_7_0.IMedium image, List<String> parameters)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudClientExportImage(obj, ((image == null) ? null :image.getWrapped()), parameters);
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

/**
Import an existing image in the Cloud to the local host.
@param uid the id of image in the Cloud.

@param parameters Each parameter in the array must be in the form "name=value".

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress importImage(String uid, List<String> parameters)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudClientImportImage(obj, uid, parameters);
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

/**
Delete an existing image with passed id from the Cloud.
@param uid The id of image in the Cloud.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress deleteImage(String uid)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudClientDeleteImage(obj, uid);
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

/**
Returns the information about an image in the Cloud.
@param uid The id of image in the Cloud.

@param infoArray An array where the image settings or properties is returned.
Each parameter in the array must be in the form "name=value".

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress getImageInfo(String uid, Holder<org.virtualbox_7_0.IStringArray> infoArray)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        javax.xml.ws.Holder<String> tmp_infoArray = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> retVal = new javax.xml.ws.Holder<String>();
        port.iCloudClientGetImageInfo(obj, uid, tmp_infoArray, retVal);
        infoArray.value = (tmp_infoArray.value.length() > 0) ? new org.virtualbox_7_0.IStringArray(tmp_infoArray.value, getObjMgr(), port) : null;
           return (retVal.value.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal.value, getObjMgr(), port) : null;
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
    public org.virtualbox_7_0.IProgress startCloudNetworkGateway(org.virtualbox_7_0.ICloudNetwork network, String sshPublicKey, Holder<org.virtualbox_7_0.ICloudNetworkGatewayInfo> gatewayInfo)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        javax.xml.ws.Holder<String> tmp_gatewayInfo = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> retVal = new javax.xml.ws.Holder<String>();
        port.iCloudClientStartCloudNetworkGateway(obj, ((network == null) ? null :network.getWrapped()), sshPublicKey, tmp_gatewayInfo, retVal);
        gatewayInfo.value = (tmp_gatewayInfo.value.length() > 0) ? new org.virtualbox_7_0.ICloudNetworkGatewayInfo(tmp_gatewayInfo.value, getObjMgr(), port) : null;
           return (retVal.value.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal.value, getObjMgr(), port) : null;
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
    public org.virtualbox_7_0.IProgress setupCloudNetworkEnvironment(String tunnelNetworkName, String tunnelNetworkRange, String gatewayOsName, String gatewayOsVersion, String gatewayShape, Holder<org.virtualbox_7_0.ICloudNetworkEnvironmentInfo> networkEnvironmentInfo)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        javax.xml.ws.Holder<String> tmp_networkEnvironmentInfo = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> retVal = new javax.xml.ws.Holder<String>();
        port.iCloudClientSetupCloudNetworkEnvironment(obj, tunnelNetworkName, tunnelNetworkRange, gatewayOsName, gatewayOsVersion, gatewayShape, tmp_networkEnvironmentInfo, retVal);
        networkEnvironmentInfo.value = (tmp_networkEnvironmentInfo.value.length() > 0) ? new org.virtualbox_7_0.ICloudNetworkEnvironmentInfo(tmp_networkEnvironmentInfo.value, getObjMgr(), port) : null;
           return (retVal.value.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal.value, getObjMgr(), port) : null;
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
Returns the information about Vnic in the Cloud.
@param uid The id of vnic in the Cloud.

@param infoArray An array where the Vnic settings/properties is returned.
Each parameter in the array must be in the form "name=value".

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress getVnicInfo(String uid, Holder<org.virtualbox_7_0.IStringArray> infoArray)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        javax.xml.ws.Holder<String> tmp_infoArray = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> retVal = new javax.xml.ws.Holder<String>();
        port.iCloudClientGetVnicInfo(obj, uid, tmp_infoArray, retVal);
        infoArray.value = (tmp_infoArray.value.length() > 0) ? new org.virtualbox_7_0.IStringArray(tmp_infoArray.value, getObjMgr(), port) : null;
           return (retVal.value.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal.value, getObjMgr(), port) : null;
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
    public org.virtualbox_7_0.IProgress getSubnetSelectionForm(org.virtualbox_7_0.IVirtualSystemDescription description, Holder<org.virtualbox_7_0.IVirtualSystemDescriptionForm> form)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        javax.xml.ws.Holder<String> tmp_form = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> retVal = new javax.xml.ws.Holder<String>();
        port.iCloudClientGetSubnetSelectionForm(obj, ((description == null) ? null :description.getWrapped()), tmp_form, retVal);
        form.value = (tmp_form.value.length() > 0) ? new org.virtualbox_7_0.IVirtualSystemDescriptionForm(tmp_form.value, getObjMgr(), port) : null;
           return (retVal.value.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal.value, getObjMgr(), port) : null;
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
