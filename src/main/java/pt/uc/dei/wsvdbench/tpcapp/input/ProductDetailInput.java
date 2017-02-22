package pt.uc.dei.wsvdbench.tpcapp.input;

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
@XmlType(name = "ProductDetailInput", namespace = "http://tpcapp.wsvdbench.dei.uc.pt/")
public class ProductDetailInput {

    private List<Long> itemIds;

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = Long.class)
    public List<Long> getItemIds() {
        return itemIds;
    }

    public void setItemIds(List<Long> itemIds) {
        this.itemIds = itemIds;
    }
}
