package pt.uc.dei.wsvdbench.tpcc;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pt.uc.dei.wsvdbench.tpcc.object.NewOrderLongList;
import pt.uc.dei.wsvdbench.tpcc.object.ShortOrder;
import pt.uc.dei.wsvdbench.tpcc.versions.NewOrder_Vx0;
import pt.uc.dei.wsvdbench.tpcc.versions.NewOrder_Vx056;
import pt.uc.dei.wsvdbench.tpcc.versions.NewOrder_Vx081;
import pt.uc.dei.wsvdbench.tpcc.versions.NewOrder_Vx103;
import pt.uc.dei.wsvdbench.tpcc.versions.NewOrder_Vx119;
import pt.uc.dei.wsvdbench.tpcc.versions.NewOrder_Vx144;
import pt.uc.dei.wsvdbench.tpcc.versions.NewOrder_VxA;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - C Benchmark Services
 * 
 *
 *
 * @author nmsa@dei.uc.pt
 */
@WebService()
public class NewOrder {

    @WebMethod(operationName = "newOrderTransaction_Vx0")
    public ShortOrder newOrderTransaction_Vx0(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "o_ol_cnt", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") int o_ol_cnt,
            @WebParam(name = "o_all_local", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") int o_all_local,
            @WebParam(name = "itemIDs", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList itemIDs,
            @WebParam(name = "supplierWarehouseIDs", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList supplierWarehouseIDs,
            @WebParam(name = "orderQuantities", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList orderQuantities) {
        return new NewOrder_Vx0().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @WebMethod(operationName = "newOrderTransaction_VxA")
    public ShortOrder newOrderTransaction_VxA(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "o_ol_cnt", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") int o_ol_cnt,
            @WebParam(name = "o_all_local", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") int o_all_local,
            @WebParam(name = "itemIDs", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList itemIDs,
            @WebParam(name = "supplierWarehouseIDs", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList supplierWarehouseIDs,
            @WebParam(name = "orderQuantities", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList orderQuantities) {
        return new NewOrder_VxA().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @WebMethod(operationName = "newOrderTransaction_Vx056")
    public ShortOrder newOrderTransaction_Vx056(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "o_ol_cnt", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") int o_ol_cnt,
            @WebParam(name = "o_all_local", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") int o_all_local,
            @WebParam(name = "itemIDs", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList itemIDs,
            @WebParam(name = "supplierWarehouseIDs", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList supplierWarehouseIDs,
            @WebParam(name = "orderQuantities", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList orderQuantities) {
        return new NewOrder_Vx056().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @WebMethod(operationName = "newOrderTransaction_Vx081")
    public ShortOrder newOrderTransaction_Vx081(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "o_ol_cnt", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") int o_ol_cnt,
            @WebParam(name = "o_all_local", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") int o_all_local,
            @WebParam(name = "itemIDs", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList itemIDs,
            @WebParam(name = "supplierWarehouseIDs", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList supplierWarehouseIDs,
            @WebParam(name = "orderQuantities", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList orderQuantities) {
        return new NewOrder_Vx081().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @WebMethod(operationName = "newOrderTransaction_Vx103")
    public ShortOrder newOrderTransaction_Vx103(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "o_ol_cnt", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") int o_ol_cnt,
            @WebParam(name = "o_all_local", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") int o_all_local,
            @WebParam(name = "itemIDs", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList itemIDs,
            @WebParam(name = "supplierWarehouseIDs", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList supplierWarehouseIDs,
            @WebParam(name = "orderQuantities", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList orderQuantities) {
        return new NewOrder_Vx103().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @WebMethod(operationName = "newOrderTransaction_Vx119")
    public ShortOrder newOrderTransaction_Vx119(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "o_ol_cnt", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") int o_ol_cnt,
            @WebParam(name = "o_all_local", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") int o_all_local,
            @WebParam(name = "itemIDs", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList itemIDs,
            @WebParam(name = "supplierWarehouseIDs", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList supplierWarehouseIDs,
            @WebParam(name = "orderQuantities", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList orderQuantities) {
        return new NewOrder_Vx119().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @WebMethod(operationName = "newOrderTransaction_Vx144")
    public ShortOrder newOrderTransaction_Vx144(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "c_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String c_id,
            @WebParam(name = "o_ol_cnt", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") int o_ol_cnt,
            @WebParam(name = "o_all_local", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") int o_all_local,
            @WebParam(name = "itemIDs", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList itemIDs,
            @WebParam(name = "supplierWarehouseIDs", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList supplierWarehouseIDs,
            @WebParam(name = "orderQuantities", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") NewOrderLongList orderQuantities) {
        return new NewOrder_Vx144().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }
}
