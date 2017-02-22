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
@XmlType(name = "ChangePaymentMethodOutput", namespace = "http://tpcapp.wsvdbench.dei.uc.pt/")
public class ChangePaymentMethodOutput {

    private String currPaymentMethod;

    public ChangePaymentMethodOutput() {
        super();
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getCurrPaymentMethod() {
        return currPaymentMethod;
    }

    public void setCurrPaymentMethod(String currPaymentMethod) {
        this.currPaymentMethod = currPaymentMethod;
    }
}
