package pt.uc.dei.wsvdbench.tpcapp.output;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - APP Benchmark Services
 *
 *
 *
 *
 * @author cnl@dei.uc.pt
 * @author nmsa@dei.uc.pt
 */
@XmlType(name = "ProductDetailOutput", namespace = "http://tpcapp.wsvdbench.dei.uc.pt/")
public class ProductDetailOutput {

    private List<ProductDetailPojo> detailedProductsList;

    public ProductDetailOutput() {
        super();
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = ProductDetailPojo.class)
    public List<ProductDetailPojo> getDetailedProductsList() {
        return detailedProductsList;
    }

    public void setDetailedProductsList(List<ProductDetailPojo> detailedProductsList) {
        this.detailedProductsList = detailedProductsList;
    }
}
