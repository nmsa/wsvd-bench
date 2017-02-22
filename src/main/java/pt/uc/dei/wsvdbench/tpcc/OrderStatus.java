package pt.uc.dei.wsvdbench.tpcc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pt.uc.dei.wsvdbench.tpcc.object.Order;
import pt.uc.dei.wsvdbench.tpcc.versions.OrderStatus_Vx0;
import pt.uc.dei.wsvdbench.tpcc.versions.OrderStatus_Vx046;
import pt.uc.dei.wsvdbench.tpcc.versions.OrderStatus_Vx066;
import pt.uc.dei.wsvdbench.tpcc.versions.OrderStatus_Vx096;
import pt.uc.dei.wsvdbench.tpcc.versions.OrderStatus_Vx122;
import pt.uc.dei.wsvdbench.tpcc.versions.OrderStatus_Vx143;
import pt.uc.dei.wsvdbench.tpcc.versions.OrderStatus_VxA;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - C Benchmark Services
 * 
 *
 *
 * @author nmsa@dei.uc.pt
 */
@WebService()
public class OrderStatus {

    @WebMethod(operationName = "orderStatusTransaction_Vx0")
    public Order orderStatusTransaction_Vx0(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new OrderStatus_Vx0().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

    @WebMethod(operationName = "orderStatusTransaction_VxA")
    public Order orderStatusTransaction_VxA(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new OrderStatus_VxA().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

    @WebMethod(operationName = "orderStatusTransaction_Vx046")
    public Order orderStatusTransaction_Vx046(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new OrderStatus_Vx046().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

    @WebMethod(operationName = "orderStatusTransaction_Vx066")
    public Order orderStatusTransaction_Vx066(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new OrderStatus_Vx066().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

    @WebMethod(operationName = "orderStatusTransaction_Vx096")
    public Order orderStatusTransaction_Vx096(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new OrderStatus_Vx096().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

    @WebMethod(operationName = "orderStatusTransaction_Vx122")
    public Order orderStatusTransaction_Vx122(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new OrderStatus_Vx122().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

    @WebMethod(operationName = "orderStatusTransaction_Vx143")
    public Order orderStatusTransaction_Vx143(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "c_last", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_last,
            @WebParam(name = "c_by_name", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") boolean c_by_name) {
        return new OrderStatus_Vx143().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }
}
