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
@XmlType(name = "NewCustomerInput", namespace = "http://tpcapp.wsvdbench.dei.uc.pt/")
public class NewCustomerInput {

    private Long threadId;
    private String billingAddr1;
    private String billingAddr2;
    private String billingCity;
    private String billingCountry;
    private String billingState;
    private String billingZip;
    private String businessInfo;
    private String businessName;
    private String contactEmail;
    private String contactFName;
    private String contactLName;
    private String contactPhone;
    private String creditInfo;
    private String password;
    private String paymentMethod;
    private Long poId;

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getBillingAddr1() {
        return billingAddr1;
    }

    public void setBillingAddr1(String billingAddr1) {
        this.billingAddr1 = billingAddr1;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getBillingAddr2() {
        return billingAddr2;
    }

    public void setBillingAddr2(String billingAddr2) {
        this.billingAddr2 = billingAddr2;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getBillingZip() {
        return billingZip;
    }

    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getBusinessInfo() {
        return businessInfo;
    }

    public void setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getContactFName() {
        return contactFName;
    }

    public void setContactFName(String contactFName) {
        this.contactFName = contactFName;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getContactLName() {
        return contactLName;
    }

    public void setContactLName(String contactLName) {
        this.contactLName = contactLName;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getCreditInfo() {
        return creditInfo;
    }

    public void setCreditInfo(String creditInfo) {
        this.creditInfo = creditInfo;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = String.class)
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @XmlElement(namespace = "http://tpcapp.wsvdbench.dei.uc.pt/", type = Long.class)
    public Long getPoId() {
        return poId;
    }

    public void setPoId(Long poId) {
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
