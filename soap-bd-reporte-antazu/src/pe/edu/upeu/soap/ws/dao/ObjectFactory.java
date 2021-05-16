
package pe.edu.upeu.soap.ws.dao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.edu.upeu.soap.ws.dao package. 
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

    private final static QName _GenerarReporteResponse_QNAME = new QName("http://dao.ws.soap.upeu.edu.pe/", "generarReporteResponse");
    private final static QName _GenerarReporte_QNAME = new QName("http://dao.ws.soap.upeu.edu.pe/", "generarReporte");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.edu.upeu.soap.ws.dao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenerarReporteResponse }
     * 
     */
    public GenerarReporteResponse createGenerarReporteResponse() {
        return new GenerarReporteResponse();
    }

    /**
     * Create an instance of {@link GenerarReporte }
     * 
     */
    public GenerarReporte createGenerarReporte() {
        return new GenerarReporte();
    }

    /**
     * Create an instance of {@link Reporte }
     * 
     */
    public Reporte createReporte() {
        return new Reporte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarReporteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.ws.soap.upeu.edu.pe/", name = "generarReporteResponse")
    public JAXBElement<GenerarReporteResponse> createGenerarReporteResponse(GenerarReporteResponse value) {
        return new JAXBElement<GenerarReporteResponse>(_GenerarReporteResponse_QNAME, GenerarReporteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarReporte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.ws.soap.upeu.edu.pe/", name = "generarReporte")
    public JAXBElement<GenerarReporte> createGenerarReporte(GenerarReporte value) {
        return new JAXBElement<GenerarReporte>(_GenerarReporte_QNAME, GenerarReporte.class, null, value);
    }

}
