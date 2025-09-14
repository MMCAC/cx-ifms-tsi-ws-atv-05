
package com.mycompany.imcws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.imcws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalcularIMC_QNAME = new QName("http://imcws.mycompany.com/", "calcularIMC");
    private final static QName _CalcularIMCResponse_QNAME = new QName("http://imcws.mycompany.com/", "calcularIMCResponse");
    private final static QName _CategoriaIMC_QNAME = new QName("http://imcws.mycompany.com/", "categoriaIMC");
    private final static QName _CategoriaIMCResponse_QNAME = new QName("http://imcws.mycompany.com/", "categoriaIMCResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.imcws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularIMC }
     * 
     */
    public CalcularIMC createCalcularIMC() {
        return new CalcularIMC();
    }

    /**
     * Create an instance of {@link CalcularIMCResponse }
     * 
     */
    public CalcularIMCResponse createCalcularIMCResponse() {
        return new CalcularIMCResponse();
    }

    /**
     * Create an instance of {@link CategoriaIMC }
     * 
     */
    public CategoriaIMC createCategoriaIMC() {
        return new CategoriaIMC();
    }

    /**
     * Create an instance of {@link CategoriaIMCResponse }
     * 
     */
    public CategoriaIMCResponse createCategoriaIMCResponse() {
        return new CategoriaIMCResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularIMC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularIMC }{@code >}
     */
    @XmlElementDecl(namespace = "http://imcws.mycompany.com/", name = "calcularIMC")
    public JAXBElement<CalcularIMC> createCalcularIMC(CalcularIMC value) {
        return new JAXBElement<CalcularIMC>(_CalcularIMC_QNAME, CalcularIMC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularIMCResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularIMCResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://imcws.mycompany.com/", name = "calcularIMCResponse")
    public JAXBElement<CalcularIMCResponse> createCalcularIMCResponse(CalcularIMCResponse value) {
        return new JAXBElement<CalcularIMCResponse>(_CalcularIMCResponse_QNAME, CalcularIMCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriaIMC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CategoriaIMC }{@code >}
     */
    @XmlElementDecl(namespace = "http://imcws.mycompany.com/", name = "categoriaIMC")
    public JAXBElement<CategoriaIMC> createCategoriaIMC(CategoriaIMC value) {
        return new JAXBElement<CategoriaIMC>(_CategoriaIMC_QNAME, CategoriaIMC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriaIMCResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CategoriaIMCResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://imcws.mycompany.com/", name = "categoriaIMCResponse")
    public JAXBElement<CategoriaIMCResponse> createCategoriaIMCResponse(CategoriaIMCResponse value) {
        return new JAXBElement<CategoriaIMCResponse>(_CategoriaIMCResponse_QNAME, CategoriaIMCResponse.class, null, value);
    }

}
