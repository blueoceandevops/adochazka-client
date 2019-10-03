//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.03 at 03:20:59 PM CEST 
//


package com.karumien.client.adochazka.schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypCinnosti.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypCinnosti"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Nedefinovano"/&gt;
 *     &lt;enumeration value="Prace"/&gt;
 *     &lt;enumeration value="Odchod"/&gt;
 *     &lt;enumeration value="Prestavka"/&gt;
 *     &lt;enumeration value="Obed"/&gt;
 *     &lt;enumeration value="Dovolena"/&gt;
 *     &lt;enumeration value="Nemoc"/&gt;
 *     &lt;enumeration value="Lekar"/&gt;
 *     &lt;enumeration value="Absence"/&gt;
 *     &lt;enumeration value="SluzebniCesta"/&gt;
 *     &lt;enumeration value="NahradniVolno"/&gt;
 *     &lt;enumeration value="PrekazkaVPraci"/&gt;
 *     &lt;enumeration value="OsetrovaniClenaRodiny"/&gt;
 *     &lt;enumeration value="DarovaniKrve"/&gt;
 *     &lt;enumeration value="Pohreb"/&gt;
 *     &lt;enumeration value="Koureni"/&gt;
 *     &lt;enumeration value="FiremniVolno"/&gt;
 *     &lt;enumeration value="HomeOffice"/&gt;
 *     &lt;enumeration value="NeplaceneVolno"/&gt;
 *     &lt;enumeration value="Jednani"/&gt;
 *     &lt;enumeration value="AbsenceOmluvena"/&gt;
 *     &lt;enumeration value="PrekazkaVPraci60"/&gt;
 *     &lt;enumeration value="Svatba"/&gt;
 *     &lt;enumeration value="UzivatelskaCinnost"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypCinnosti", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendanceCore.Models")
@XmlEnum
public enum TypCinnosti {

    @XmlEnumValue("Nedefinovano")
    NEDEFINOVANO("Nedefinovano"),
    @XmlEnumValue("Prace")
    PRACE("Prace"),
    @XmlEnumValue("Odchod")
    ODCHOD("Odchod"),
    @XmlEnumValue("Prestavka")
    PRESTAVKA("Prestavka"),
    @XmlEnumValue("Obed")
    OBED("Obed"),
    @XmlEnumValue("Dovolena")
    DOVOLENA("Dovolena"),
    @XmlEnumValue("Nemoc")
    NEMOC("Nemoc"),
    @XmlEnumValue("Lekar")
    LEKAR("Lekar"),
    @XmlEnumValue("Absence")
    ABSENCE("Absence"),
    @XmlEnumValue("SluzebniCesta")
    SLUZEBNI_CESTA("SluzebniCesta"),
    @XmlEnumValue("NahradniVolno")
    NAHRADNI_VOLNO("NahradniVolno"),
    @XmlEnumValue("PrekazkaVPraci")
    PREKAZKA_V_PRACI("PrekazkaVPraci"),
    @XmlEnumValue("OsetrovaniClenaRodiny")
    OSETROVANI_CLENA_RODINY("OsetrovaniClenaRodiny"),
    @XmlEnumValue("DarovaniKrve")
    DAROVANI_KRVE("DarovaniKrve"),
    @XmlEnumValue("Pohreb")
    POHREB("Pohreb"),
    @XmlEnumValue("Koureni")
    KOURENI("Koureni"),
    @XmlEnumValue("FiremniVolno")
    FIREMNI_VOLNO("FiremniVolno"),
    @XmlEnumValue("HomeOffice")
    HOME_OFFICE("HomeOffice"),
    @XmlEnumValue("NeplaceneVolno")
    NEPLACENE_VOLNO("NeplaceneVolno"),
    @XmlEnumValue("Jednani")
    JEDNANI("Jednani"),
    @XmlEnumValue("AbsenceOmluvena")
    ABSENCE_OMLUVENA("AbsenceOmluvena"),
    @XmlEnumValue("PrekazkaVPraci60")
    PREKAZKA_V_PRACI_60("PrekazkaVPraci60"),
    @XmlEnumValue("Svatba")
    SVATBA("Svatba"),
    @XmlEnumValue("UzivatelskaCinnost")
    UZIVATELSKA_CINNOST("UzivatelskaCinnost");
    private final String value;

    TypCinnosti(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypCinnosti fromValue(String v) {
        for (TypCinnosti c: TypCinnosti.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
