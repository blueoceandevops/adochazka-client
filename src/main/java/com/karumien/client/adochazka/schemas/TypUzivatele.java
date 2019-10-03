//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.03 at 02:46:42 PM CEST 
//


package com.karumien.client.adochazka.schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypUzivatele.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypUzivatele"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Neznamo"/&gt;
 *     &lt;enumeration value="Uzivatel"/&gt;
 *     &lt;enumeration value="Vedouci"/&gt;
 *     &lt;enumeration value="VedouciNahled"/&gt;
 *     &lt;enumeration value="Admin"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypUzivatele", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendanceCore.Models")
@XmlEnum
public enum TypUzivatele {

    @XmlEnumValue("Neznamo")
    NEZNAMO("Neznamo"),
    @XmlEnumValue("Uzivatel")
    UZIVATEL("Uzivatel"),
    @XmlEnumValue("Vedouci")
    VEDOUCI("Vedouci"),
    @XmlEnumValue("VedouciNahled")
    VEDOUCI_NAHLED("VedouciNahled"),
    @XmlEnumValue("Admin")
    ADMIN("Admin");
    private final String value;

    TypUzivatele(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypUzivatele fromValue(String v) {
        for (TypUzivatele c: TypUzivatele.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
