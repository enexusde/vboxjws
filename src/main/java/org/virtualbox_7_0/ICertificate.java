
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
 * ICertificate.java
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
X.509 certificate details.

Interface ID: <code>{392F1DE4-80E1-4A8A-93A1-67C5F92A838A}</code>
*/
public class ICertificate extends IUnknown
{

    public ICertificate(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Certificate version number.
@return org.virtualbox_7_0.CertificateVersion
*/
    public org.virtualbox_7_0.CertificateVersion getVersionNumber()
    {
        try
        {
            org.virtualbox_7_0.jaxws.CertificateVersion retVal = port.iCertificateGetVersionNumber(obj);
            return org.virtualbox_7_0.CertificateVersion.fromValue(retVal.value());
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
Certificate serial number.
@return String
*/
    public String getSerialNumber()
    {
        try
        {
            String retVal = port.iCertificateGetSerialNumber(obj);
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
The dotted OID of the signature algorithm.
@return String
*/
    public String getSignatureAlgorithmOID()
    {
        try
        {
            String retVal = port.iCertificateGetSignatureAlgorithmOID(obj);
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
The signature algorithm name if known (if known).
@return String
*/
    public String getSignatureAlgorithmName()
    {
        try
        {
            String retVal = port.iCertificateGetSignatureAlgorithmName(obj);
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
Issuer name.  Each member of the array is on the format
COMPONENT=NAME, e.g. "C=DE", "ST=Example", "L=For Instance", "O=Beispiel GmbH",
"CN=beispiel.example.org".
@return List&lt;String&gt;
*/
    public List<String> getIssuerName()
    {
        try
        {
            List<String> retVal = port.iCertificateGetIssuerName(obj);
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
Subject name.  Same format as issuerName.
@return List&lt;String&gt;
*/
    public List<String> getSubjectName()
    {
        try
        {
            List<String> retVal = port.iCertificateGetSubjectName(obj);
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
Friendly subject name or similar.
@return String
*/
    public String getFriendlyName()
    {
        try
        {
            String retVal = port.iCertificateGetFriendlyName(obj);
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
Certificate not valid before ISO timestamp.
@return String
*/
    public String getValidityPeriodNotBefore()
    {
        try
        {
            String retVal = port.iCertificateGetValidityPeriodNotBefore(obj);
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
Certificate not valid after ISO timestamp.
@return String
*/
    public String getValidityPeriodNotAfter()
    {
        try
        {
            String retVal = port.iCertificateGetValidityPeriodNotAfter(obj);
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
The dotted OID of the public key algorithm.
@return String
*/
    public String getPublicKeyAlgorithmOID()
    {
        try
        {
            String retVal = port.iCertificateGetPublicKeyAlgorithmOID(obj);
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
The public key algorithm name (if known).
@return String
*/
    public String getPublicKeyAlgorithm()
    {
        try
        {
            String retVal = port.iCertificateGetPublicKeyAlgorithm(obj);
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
The raw public key bytes.
@return byte[]
*/
    public byte[] getSubjectPublicKey()
    {
        try
        {
            /*base64*/String retVal = port.iCertificateGetSubjectPublicKey(obj);
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
Unique identifier of the issuer (empty string if not present).
@return String
*/
    public String getIssuerUniqueIdentifier()
    {
        try
        {
            String retVal = port.iCertificateGetIssuerUniqueIdentifier(obj);
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
Unique identifier of this certificate (empty string if not present).
@return String
*/
    public String getSubjectUniqueIdentifier()
    {
        try
        {
            String retVal = port.iCertificateGetSubjectUniqueIdentifier(obj);
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
Whether this certificate is a certificate authority.  Will return E_FAIL
if this attribute is not present.
@return Boolean
*/
    public Boolean getCertificateAuthority()
    {
        try
        {
            Boolean retVal = port.iCertificateGetCertificateAuthority(obj);
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
Key usage mask.  Will return 0 if not present.
@return Long
*/
    public Long getKeyUsage()
    {
        try
        {
            Long retVal = port.iCertificateGetKeyUsage(obj);
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
Array of dotted extended key usage OIDs.  Empty array if not present.
@return List&lt;String&gt;
*/
    public List<String> getExtendedKeyUsage()
    {
        try
        {
            List<String> retVal = port.iCertificateGetExtendedKeyUsage(obj);
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
The raw certificate bytes.
@return byte[]
*/
    public byte[] getRawCertData()
    {
        try
        {
            /*base64*/String retVal = port.iCertificateGetRawCertData(obj);
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
Set if self signed certificate.
@return Boolean
*/
    public Boolean getSelfSigned()
    {
        try
        {
            Boolean retVal = port.iCertificateGetSelfSigned(obj);
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
Set if the certificate is trusted (by the parent object).
@return Boolean
*/
    public Boolean getTrusted()
    {
        try
        {
            Boolean retVal = port.iCertificateGetTrusted(obj);
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
Set if the certificate has expired (relevant to the parent object)/
@return Boolean
*/
    public Boolean getExpired()
    {
        try
        {
            Boolean retVal = port.iCertificateGetExpired(obj);
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
    public static ICertificate queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new ICertificate(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Tests if the certificate has expired at the present time according to
the X.509 validity of the certificate.
*/
    public Boolean isCurrentlyExpired()
    {
        try
        {
            Boolean retVal;
        retVal = port.iCertificateIsCurrentlyExpired(obj);
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
Way to extend the interface.
*/
    public String queryInfo(Integer what)
    {
        try
        {
            String retVal;
        retVal = port.iCertificateQueryInfo(obj, what);
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
