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
@XmlType(name = "ChangePaymentMethodInput", namespace = "http://tpcapp.wsvdbench.dei.uc.pt/")
public class ChangePaymentMethodInput {

    private Long threadId;
    private Long customerId;
    private String paymentMethod;
    private String creditInfo;
    private String poId;

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getCreditInfo() {
        return creditInfo;
    }

    public void setCreditInfo(String creditInfo) {
        this.creditInfo = creditInfo;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = Long.class)
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getPoId() {
        return poId;
    }

    public void setPoId(String poId) {
        this.poId = poId;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = Long.class)
    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }
}
