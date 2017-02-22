package pt.uc.dei.wsvdbench.tpcc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pt.uc.dei.wsvdbench.tpcc.object.DeliveryResult;
import pt.uc.dei.wsvdbench.tpcc.versions.Delivery_Vx0;
import pt.uc.dei.wsvdbench.tpcc.versions.Delivery_Vx051;
import pt.uc.dei.wsvdbench.tpcc.versions.Delivery_Vx075;
import pt.uc.dei.wsvdbench.tpcc.versions.Delivery_Vx099;
import pt.uc.dei.wsvdbench.tpcc.versions.Delivery_Vx123;
import pt.uc.dei.wsvdbench.tpcc.versions.Delivery_Vx138;
import pt.uc.dei.wsvdbench.tpcc.versions.Delivery_Vx154;
import pt.uc.dei.wsvdbench.tpcc.versions.Delivery_Vx176;
import pt.uc.dei.wsvdbench.tpcc.versions.Delivery_VxA;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - C Benchmark Services
 * 
 *
 *
 * @author nmsa@dei.uc.pt
 */
@WebService()
public class Delivery {

    @WebMethod(operationName = "deliveryTransaction_Vx0")
    public DeliveryResult deliveryTransaction_Vx0(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "o_carrier_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String o_carrier_id) {
        return new Delivery_Vx0().deliveryTransaction(w_id, o_carrier_id);
    }

    @WebMethod(operationName = "deliveryTransaction_VxA")
    public DeliveryResult deliveryTransaction_VxA(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "o_carrier_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String o_carrier_id) {
        return new Delivery_VxA().deliveryTransaction(w_id, o_carrier_id);
    }

    @WebMethod(operationName = "deliveryTransaction_Vx051")
    public DeliveryResult deliveryTransaction_Vx051(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "o_carrier_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String o_carrier_id) {
        return new Delivery_Vx051().deliveryTransaction(w_id, o_carrier_id);
    }

    @WebMethod(operationName = "deliveryTransaction_Vx075")
    public DeliveryResult deliveryTransaction_Vx075(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "o_carrier_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String o_carrier_id) {
        return new Delivery_Vx075().deliveryTransaction(w_id, o_carrier_id);
    }

    @WebMethod(operationName = "deliveryTransaction_Vx099")
    public DeliveryResult deliveryTransaction_Vx099(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "o_carrier_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String o_carrier_id) {
        return new Delivery_Vx099().deliveryTransaction(w_id, o_carrier_id);
    }

    @WebMethod(operationName = "deliveryTransaction_Vx123")
    public DeliveryResult deliveryTransaction_Vx123(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "o_carrier_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String o_carrier_id) {
        return new Delivery_Vx123().deliveryTransaction(w_id, o_carrier_id);
    }

    @WebMethod(operationName = "deliveryTransaction_Vx138")
    public DeliveryResult deliveryTransaction_Vx138(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "o_carrier_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String o_carrier_id) {
        return new Delivery_Vx138().deliveryTransaction(w_id, o_carrier_id);
    }

    @WebMethod(operationName = "deliveryTransaction_Vx154")
    public DeliveryResult deliveryTransaction_Vx154(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "o_carrier_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String o_carrier_id) {
        return new Delivery_Vx154().deliveryTransaction(w_id, o_carrier_id);
    }

    @WebMethod(operationName = "deliveryTransaction_Vx176")
    public DeliveryResult deliveryTransaction_Vx176(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "o_carrier_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String o_carrier_id) {
        return new Delivery_Vx176().deliveryTransaction(w_id, o_carrier_id);
    }
}
