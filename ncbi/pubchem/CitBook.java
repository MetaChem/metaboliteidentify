//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="Cit-book_title">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Title"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cit-book_coll" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Title"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cit-book_authors">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Auth-list"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cit-book_imp">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Imprint"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "citBook_Title",
        "citBook_Coll",
        "citBook_Authors",
        "citBook_Imp"
})
@XmlRootElement(name = "Cit-book")
public class CitBook {

    @XmlElement(name = "Cit-book_title", required = true)
    protected CitBook.CitBook_Title citBook_Title;
    @XmlElement(name = "Cit-book_coll")
    protected CitBook.CitBook_Coll citBook_Coll;
    @XmlElement(name = "Cit-book_authors", required = true)
    protected CitBook.CitBook_Authors citBook_Authors;
    @XmlElement(name = "Cit-book_imp", required = true)
    protected CitBook.CitBook_Imp citBook_Imp;

    /**
     * ��ȡcitBook_Title���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitBook.CitBook_Title }
     */
    public CitBook.CitBook_Title getCitBook_Title() {
        return citBook_Title;
    }

    /**
     * ����citBook_Title���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitBook.CitBook_Title }
     */
    public void setCitBook_Title(CitBook.CitBook_Title value) {
        this.citBook_Title = value;
    }

    /**
     * ��ȡcitBook_Coll���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitBook.CitBook_Coll }
     */
    public CitBook.CitBook_Coll getCitBook_Coll() {
        return citBook_Coll;
    }

    /**
     * ����citBook_Coll���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitBook.CitBook_Coll }
     */
    public void setCitBook_Coll(CitBook.CitBook_Coll value) {
        this.citBook_Coll = value;
    }

    /**
     * ��ȡcitBook_Authors���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitBook.CitBook_Authors }
     */
    public CitBook.CitBook_Authors getCitBook_Authors() {
        return citBook_Authors;
    }

    /**
     * ����citBook_Authors���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitBook.CitBook_Authors }
     */
    public void setCitBook_Authors(CitBook.CitBook_Authors value) {
        this.citBook_Authors = value;
    }

    /**
     * ��ȡcitBook_Imp���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitBook.CitBook_Imp }
     */
    public CitBook.CitBook_Imp getCitBook_Imp() {
        return citBook_Imp;
    }

    /**
     * ����citBook_Imp���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitBook.CitBook_Imp }
     */
    public void setCitBook_Imp(CitBook.CitBook_Imp value) {
        this.citBook_Imp = value;
    }


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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Auth-list"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "authList"
    })
    public static class CitBook_Authors {

        @XmlElement(name = "Auth-list", required = true)
        protected AuthList authList;

        /**
         * ��ȡauthList���Ե�ֵ��
         *
         * @return possible object is
         * {@link AuthList }
         */
        public AuthList getAuthList() {
            return authList;
        }

        /**
         * ����authList���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link AuthList }
         */
        public void setAuthList(AuthList value) {
            this.authList = value;
        }

    }


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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Title"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "title"
    })
    public static class CitBook_Coll {

        @XmlElement(name = "Title", required = true)
        protected Title title;

        /**
         * ��ȡtitle���Ե�ֵ��
         *
         * @return possible object is
         * {@link Title }
         */
        public Title getTitle() {
            return title;
        }

        /**
         * ����title���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Title }
         */
        public void setTitle(Title value) {
            this.title = value;
        }

    }


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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Imprint"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "imprint"
    })
    public static class CitBook_Imp {

        @XmlElement(name = "Imprint", required = true)
        protected Imprint imprint;

        /**
         * ��ȡimprint���Ե�ֵ��
         *
         * @return possible object is
         * {@link Imprint }
         */
        public Imprint getImprint() {
            return imprint;
        }

        /**
         * ����imprint���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Imprint }
         */
        public void setImprint(Imprint value) {
            this.imprint = value;
        }

    }


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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Title"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "title"
    })
    public static class CitBook_Title {

        @XmlElement(name = "Title", required = true)
        protected Title title;

        /**
         * ��ȡtitle���Ե�ֵ��
         *
         * @return possible object is
         * {@link Title }
         */
        public Title getTitle() {
            return title;
        }

        /**
         * ����title���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Title }
         */
        public void setTitle(Title value) {
            this.title = value;
        }

    }

}
