package pt.uc.dei.wsvdbench.tpcapp.output;

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
@XmlType(name = "NewProduct", namespace = "http://tpcapp.wsvdbench.dei.uc.pt/")
public class NewProduct {

    private Long itemId;
    private String itemTitle;
    private String authorFName;
    private String authorLName;

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getAuthorFName() {
        return authorFName;
    }

    public void setAuthorFName(String authorFName) {
        this.authorFName = authorFName;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getAuthorLName() {
        return authorLName;
    }

    public void setAuthorLName(String authorLName) {
        this.authorLName = authorLName;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = Long.class)
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }
}
