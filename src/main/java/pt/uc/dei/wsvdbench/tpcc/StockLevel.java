package pt.uc.dei.wsvdbench.tpcc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pt.uc.dei.wsvdbench.tpcc.versions.StockLevel_Vx0;
import pt.uc.dei.wsvdbench.tpcc.versions.StockLevel_Vx033;
import pt.uc.dei.wsvdbench.tpcc.versions.StockLevel_Vx057;
import pt.uc.dei.wsvdbench.tpcc.versions.StockLevel_VxA;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - C Benchmark Services
 * 
 *
 *
 * @author nmsa@dei.uc.pt
 */
@WebService()
public class StockLevel {

    @WebMethod(operationName = "stockLevelTransaction_Vx0")
    public long stockLevelTransaction_Vx0(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "threshold", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") long threshold) {
        return new StockLevel_Vx0().stockLevelTransaction(w_id, d_id, threshold);
    }

    @WebMethod(operationName = "stockLevelTransaction_Vx033")
    public long stockLevelTransaction_Vx033(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "threshold", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") long threshold) {
        return new StockLevel_Vx033().stockLevelTransaction(w_id, d_id, threshold);
    }

    @WebMethod(operationName = "stockLevelTransaction_Vx057")
    public long stockLevelTransaction_Vx057(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "threshold", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") long threshold) {
        return new StockLevel_Vx057().stockLevelTransaction(w_id, d_id, threshold);
    }

    @WebMethod(operationName = "stockLevelTransaction_VxA")
    public long stockLevelTransaction_VxA(
            @WebParam(name = "w_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String w_id,
            @WebParam(name = "d_id", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") String d_id,
            @WebParam(name = "threshold", targetNamespace = "http://tpcc.wsvdbench.dei.uc.pt/") long threshold) {
        return new StockLevel_VxA().stockLevelTransaction(w_id, d_id, threshold);
    }
}
