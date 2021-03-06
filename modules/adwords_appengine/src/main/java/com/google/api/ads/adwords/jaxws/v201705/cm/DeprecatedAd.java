// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201705.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a deprecated ad.
 *             
 *             Deprecated ads can be deleted, but cannot be created.
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for DeprecatedAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeprecatedAd">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201705}Ad">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deprecatedAdType" type="{https://adwords.google.com/api/adwords/cm/v201705}DeprecatedAd.Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeprecatedAd", propOrder = {
    "name",
    "deprecatedAdType"
})
public class DeprecatedAd
    extends Ad
{

    protected String name;
    @XmlSchemaType(name = "string")
    protected DeprecatedAdType deprecatedAdType;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the deprecatedAdType property.
     * 
     * @return
     *     possible object is
     *     {@link DeprecatedAdType }
     *     
     */
    public DeprecatedAdType getDeprecatedAdType() {
        return deprecatedAdType;
    }

    /**
     * Sets the value of the deprecatedAdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeprecatedAdType }
     *     
     */
    public void setDeprecatedAdType(DeprecatedAdType value) {
        this.deprecatedAdType = value;
    }

}
