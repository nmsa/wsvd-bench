package pt.uc.dei.wsvdbench.tpcc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pt.uc.dei.wsvdbench.tpcc.object.PaymentResult;
import pt.uc.dei.wsvdbench.tpcc.versions.Payment_Vx0;
import pt.uc.dei.wsvdbench.tpcc.versions.Payment_Vx043;
import pt.uc.dei.wsvdbench.tpcc.versions.Payment_Vx057;
import pt.uc.dei.wsvdbench.tpcc.versions.Payment_Vx078;
import pt.uc.dei.wsvdbench.tpcc.versions.Payment_Vx091;
import pt.uc.dei.wsvdbench.tpcc.versions.Payment_Vx115;
import pt.uc.dei.wsvdbench.tpcc.versions.Payment_Vx136;
import pt.uc.dei.wsvdbench.tpcc.versions.Payment_Vx177;
import pt.uc.dei.wsvdbench.tpcc.versions.Payment_Vx212;
import pt.uc.dei.wsvdbench.tpcc.versions.Payment_Vx241;
import pt.uc.dei.wsvdbench.tpcc.versions.Payment_Vx257;
import pt.uc.dei.wsvdbench.tpcc.versions.Payment_Vx290;
import pt.uc.dei.wsvdbench.tpcc.versions.Payment_VxA;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - C Benchmark Services
 * 
 *
 *
 * @author nmsa@dei.uc.pt
 */
@WebService()
public class Payment {

    @WebMethod(operationName = "paymentTransaction_Vx0")
    public PaymentResult paymentTransaction_Vx0(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "c_w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_w_id,
            @WebParam(name = "h_amount", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") double h_amount,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new Payment_Vx0().paymentTransaction(w_id, c_w_id, h_amount, d_id, c_d_id, c_id, c_last, c_by_name);
    }

    @WebMethod(operationName = "paymentTransaction_VxA")
    public PaymentResult paymentTransaction_VxA(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "c_w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_w_id,
            @WebParam(name = "h_amount", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") double h_amount,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new Payment_VxA().paymentTransaction(w_id, c_w_id, h_amount, d_id, c_d_id, c_id, c_last, c_by_name);
    }

    @WebMethod(operationName = "paymentTransaction_Vx043")
    public PaymentResult paymentTransaction_Vx043(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "c_w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_w_id,
            @WebParam(name = "h_amount", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") double h_amount,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new Payment_Vx043().paymentTransaction(w_id, c_w_id, h_amount, d_id, c_d_id, c_id, c_last, c_by_name);
    }

    @WebMethod(operationName = "paymentTransaction_Vx057")
    public PaymentResult paymentTransaction_Vx057(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "c_w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_w_id,
            @WebParam(name = "h_amount", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") double h_amount,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new Payment_Vx057().paymentTransaction(w_id, c_w_id, h_amount, d_id, c_d_id, c_id, c_last, c_by_name);
    }

    @WebMethod(operationName = "paymentTransaction_Vx078")
    public PaymentResult paymentTransaction_Vx078(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "c_w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_w_id,
            @WebParam(name = "h_amount", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") double h_amount,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new Payment_Vx078().paymentTransaction(w_id, c_w_id, h_amount, d_id, c_d_id, c_id, c_last, c_by_name);
    }

    @WebMethod(operationName = "paymentTransaction_Vx091")
    public PaymentResult paymentTransaction_Vx091(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "c_w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_w_id,
            @WebParam(name = "h_amount", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") double h_amount,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new Payment_Vx091().paymentTransaction(w_id, c_w_id, h_amount, d_id, c_d_id, c_id, c_last, c_by_name);
    }

    @WebMethod(operationName = "paymentTransaction_Vx115")
    public PaymentResult paymentTransaction_Vx115(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "c_w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_w_id,
            @WebParam(name = "h_amount", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") double h_amount,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new Payment_Vx115().paymentTransaction(w_id, c_w_id, h_amount, d_id, c_d_id, c_id, c_last, c_by_name);
    }

    @WebMethod(operationName = "paymentTransaction_Vx136")
    public PaymentResult paymentTransaction_Vx136(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "c_w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_w_id,
            @WebParam(name = "h_amount", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") double h_amount,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new Payment_Vx136().paymentTransaction(w_id, c_w_id, h_amount, d_id, c_d_id, c_id, c_last, c_by_name);
    }

    @WebMethod(operationName = "paymentTransaction_Vx177")
    public PaymentResult paymentTransaction_Vx177(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "c_w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_w_id,
            @WebParam(name = "h_amount", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") double h_amount,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new Payment_Vx177().paymentTransaction(w_id, c_w_id, h_amount, d_id, c_d_id, c_id, c_last, c_by_name);
    }

    @WebMethod(operationName = "paymentTransaction_Vx212")
    public PaymentResult paymentTransaction_Vx212(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "c_w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_w_id,
            @WebParam(name = "h_amount", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") double h_amount,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new Payment_Vx212().paymentTransaction(w_id, c_w_id, h_amount, d_id, c_d_id, c_id, c_last, c_by_name);
    }

    @WebMethod(operationName = "paymentTransaction_Vx241")
    public PaymentResult paymentTransaction_Vx241(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "c_w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_w_id,
            @WebParam(name = "h_amount", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") double h_amount,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new Payment_Vx241().paymentTransaction(w_id, c_w_id, h_amount, d_id, c_d_id, c_id, c_last, c_by_name);
    }

    @WebMethod(operationName = "paymentTransaction_Vx257")
    public PaymentResult paymentTransaction_Vx257(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "c_w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_w_id,
            @WebParam(name = "h_amount", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") double h_amount,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new Payment_Vx257().paymentTransaction(w_id, c_w_id, h_amount, d_id, c_d_id, c_id, c_last, c_by_name);
    }

    @WebMethod(operationName = "paymentTransaction_Vx290")
    public PaymentResult paymentTransaction_Vx290(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "c_w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_w_id,
            @WebParam(name = "h_amount", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") double h_amount,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new Payment_Vx290().paymentTransaction(w_id, c_w_id, h_amount, d_id, c_d_id, c_id, c_last, c_by_name);
    }
}
