
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
 * IUefiVariableStore.java
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
The IUefiVariableStore interface allows inspecting and manipulating the content
of an existing UEFI variable store in a NVRAM file. This is used only in the{@link org.virtualbox_7_0.INvramStore#getUefiVariableStore()}attribute.

Interface ID: <code>{D134C6B6-4479-430D-BB73-68A452BA3E67}</code>
*/
public class IUefiVariableStore extends IUnknown
{

    public IUefiVariableStore(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Flag whether secure boot is currently enabled for the VM.
@return Boolean
*/
    public Boolean getSecureBootEnabled()
    {
        try
        {
            Boolean retVal = port.iUefiVariableStoreGetSecureBootEnabled(obj);
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
Flag whether secure boot is currently enabled for the VM.
@param value Boolean

*/
    public void setSecureBootEnabled(Boolean value)
    {
        try
        {
        port.iUefiVariableStoreSetSecureBootEnabled(obj, value);
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
    public static IUefiVariableStore queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IUefiVariableStore(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Adds a new variable to the non volatile storage area.
@param name Name of the variable.

@param owner UUID of the variable owner.

@param attributes Attributes of the variable.

@param data The variable data.

*/
    public void addVariable(String name, String owner, List<org.virtualbox_7_0.UefiVariableAttributes> attributes, byte[] data)
    {
        try
        {
        port.iUefiVariableStoreAddVariable(obj, name, owner, Helper.convertEnums(org.virtualbox_7_0.UefiVariableAttributes.class, org.virtualbox_7_0.jaxws.UefiVariableAttributes.class, attributes), Helper.encodeBase64(data));
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
Deletes the given variable from the non volatile storage area.
@param name Name of the variable.

@param owner UUID of the variable owner.

*/
    public void deleteVariable(String name, String owner)
    {
        try
        {
        port.iUefiVariableStoreDeleteVariable(obj, name, owner);
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
Changes the data of the given variable.
@param name Name of the variable.

@param data The new variable data.

*/
    public void changeVariable(String name, byte[] data)
    {
        try
        {
        port.iUefiVariableStoreChangeVariable(obj, name, Helper.encodeBase64(data));
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
Queries the variable content variable by the given name.
@param name Name of the variable to look for.

@param owner UUID of the variable owner returned on success.

@param attributes Attributes of the variable.

@param data The variable data returned on success.

*/
    public void queryVariableByName(String name, Holder<String> owner, Holder<List<org.virtualbox_7_0.UefiVariableAttributes>> attributes, Holder<byte[]> data)
    {
        try
        {
        jakarta.xml.ws.Holder<String> tmp_owner = new jakarta.xml.ws.Holder<String>();
        jakarta.xml.ws.Holder<List<org.virtualbox_7_0.jaxws.UefiVariableAttributes>> tmp_attributes = new jakarta.xml.ws.Holder<List<org.virtualbox_7_0.jaxws.UefiVariableAttributes>>();
        jakarta.xml.ws.Holder</*base64*/String> tmp_data = new jakarta.xml.ws.Holder</*base64*/String>();
        port.iUefiVariableStoreQueryVariableByName(obj, name, tmp_owner, tmp_attributes, tmp_data);
        owner.value = tmp_owner.value;
        attributes.value = Helper.convertEnums(org.virtualbox_7_0.jaxws.UefiVariableAttributes.class, org.virtualbox_7_0.UefiVariableAttributes.class, tmp_attributes.value);
        data.value = Helper.decodeBase64(tmp_data.value);
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
Queries all variables in the non volatile storage and returns their names.
@param names The variable names returned on success.

@param owners UUID of the variable owners returned on success.

*/
    public void queryVariables(Holder<List<String>> names, Holder<List<String>> owners)
    {
        try
        {
        jakarta.xml.ws.Holder<List<String>> tmp_names = new jakarta.xml.ws.Holder<List<String>>();
        jakarta.xml.ws.Holder<List<String>> tmp_owners = new jakarta.xml.ws.Holder<List<String>>();
        port.iUefiVariableStoreQueryVariables(obj, tmp_names, tmp_owners);
        names.value = tmp_names.value;
        owners.value = tmp_owners.value;
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
Enroll the default platform key from Oracle for enabling Secure Boot.
*/
    public void enrollOraclePlatformKey()
    {
        try
        {
        port.iUefiVariableStoreEnrollOraclePlatformKey(obj);
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
Convenience method to enroll a new platform key (PK) for enabling Secure Boot.
@param platformKey The platform key (PK) to enroll.

@param owner UUID of the PK owner.

*/
    public void enrollPlatformKey(byte[] platformKey, String owner)
    {
        try
        {
        port.iUefiVariableStoreEnrollPlatformKey(obj, Helper.encodeBase64(platformKey), owner);
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
Convenience method to add a new Key Encryption Key (KEK) for Secure Boot.
@param keyEncryptionKey The Key Encryption Key (KEK) to add.

@param owner UUID of the KEK owner.

@param signatureType Type of the signature.

*/
    public void addKek(byte[] keyEncryptionKey, String owner, org.virtualbox_7_0.SignatureType signatureType)
    {
        try
        {
        port.iUefiVariableStoreAddKek(obj, Helper.encodeBase64(keyEncryptionKey), owner, org.virtualbox_7_0.jaxws.SignatureType.fromValue(signatureType.name()));
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
Convenience method to add a new entry to the signature database.
@param signature The signature to add.

@param owner UUID of the signature owner.

@param signatureType Type of the signature.

*/
    public void addSignatureToDb(byte[] signature, String owner, org.virtualbox_7_0.SignatureType signatureType)
    {
        try
        {
        port.iUefiVariableStoreAddSignatureToDb(obj, Helper.encodeBase64(signature), owner, org.virtualbox_7_0.jaxws.SignatureType.fromValue(signatureType.name()));
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
Convenience method to add a new entry to the forbidden signature database.
@param signature The signature to add.

@param owner UUID of the signature owner.

@param signatureType Type of the signature.

*/
    public void addSignatureToDbx(byte[] signature, String owner, org.virtualbox_7_0.SignatureType signatureType)
    {
        try
        {
        port.iUefiVariableStoreAddSignatureToDbx(obj, Helper.encodeBase64(signature), owner, org.virtualbox_7_0.jaxws.SignatureType.fromValue(signatureType.name()));
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
Convenience method to enroll the standard Microsoft KEK and signatures
in the signature databases.
*/
    public void enrollDefaultMsSignatures()
    {
        try
        {
        port.iUefiVariableStoreEnrollDefaultMsSignatures(obj);
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
