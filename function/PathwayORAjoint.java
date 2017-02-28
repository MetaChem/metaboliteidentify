
package function;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * <p>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geneAccType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geneAccFg" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="geneAccBg" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="metaboliteAccType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaboliteAccFg" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="metaboliteAccBg" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "geneAccType",
        "geneAccFg",
        "geneAccBg",
        "metaboliteAccType",
        "metaboliteAccFg",
        "metaboliteAccBg"
})
@XmlRootElement(name = "pathwayORAjoint")
public class PathwayORAjoint {

    protected String geneAccType;
    protected List<String> geneAccFg;
    protected List<String> geneAccBg;
    protected String metaboliteAccType;
    protected List<String> metaboliteAccFg;
    protected List<String> metaboliteAccBg;

    /**
     * ��ȡgeneAccType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getGeneAccType() {
        return geneAccType;
    }

    /**
     * ����geneAccType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGeneAccType(String value) {
        this.geneAccType = value;
    }

    /**
     * Gets the value of the geneAccFg property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geneAccFg property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneAccFg().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getGeneAccFg() {
        if (geneAccFg == null) {
            geneAccFg = new ArrayList<String>();
        }
        return this.geneAccFg;
    }

    /**
     * Gets the value of the geneAccBg property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geneAccBg property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneAccBg().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getGeneAccBg() {
        if (geneAccBg == null) {
            geneAccBg = new ArrayList<String>();
        }
        return this.geneAccBg;
    }

    /**
     * ��ȡmetaboliteAccType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMetaboliteAccType() {
        return metaboliteAccType;
    }

    /**
     * ����metaboliteAccType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMetaboliteAccType(String value) {
        this.metaboliteAccType = value;
    }

    /**
     * Gets the value of the metaboliteAccFg property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaboliteAccFg property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaboliteAccFg().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getMetaboliteAccFg() {
        if (metaboliteAccFg == null) {
            metaboliteAccFg = new ArrayList<String>();
        }
        return this.metaboliteAccFg;
    }

    /**
     * Gets the value of the metaboliteAccBg property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaboliteAccBg property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaboliteAccBg().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getMetaboliteAccBg() {
        if (metaboliteAccBg == null) {
            metaboliteAccBg = new ArrayList<String>();
        }
        return this.metaboliteAccBg;
    }

}
