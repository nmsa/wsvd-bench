package pt.uc.dei.wsvdbench.tpcapp.input;

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
@XmlType(name = "NewProductsInput", namespace = "http://tpcapp.wsvdbench.dei.uc.pt/")
public class NewProductsInput {

    private Long cutOffDuration;
    private String subjectString;
    private Long itemLimit;

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = Long.class)
    public Long getCutOffDuration() {
        return cutOffDuration;
    }

    public void setCutOffDuration(Long cutOffDuration) {
        this.cutOffDuration = cutOffDuration;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = Long.class)
    public Long getItemLimit() {
        return itemLimit;
    }

    public void setItemLimit(Long itemLimit) {
        this.itemLimit = itemLimit;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getSubjectString() {
        return subjectString;
    }

    public void setSubjectString(String subjectString) {
        this.subjectString = subjectString;
    }
}
