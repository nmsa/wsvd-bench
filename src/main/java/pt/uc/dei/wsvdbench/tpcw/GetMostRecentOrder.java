package pt.uc.dei.wsvdbench.tpcw;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pt.uc.dei.wsvdbench.tpcw.object.Order;
import pt.uc.dei.wsvdbench.tpcw.versions.GetMostRecentOrder_Vx0;
import pt.uc.dei.wsvdbench.tpcw.versions.GetMostRecentOrder_VxA;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - W Benchmark Services
 *
 *
 *
 * @author nmsa@dei.uc.pt
 */
@WebService()
public class GetMostRecentOrder {

    @WebMethod(operationName = "getMostRecentOrder_Vx0")
    public Order getMostRecentOrder_Vx0(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "c_uname") String c_uname) {
        return new GetMostRecentOrder_Vx0().getMostRecentOrder(c_uname);
    }

    @WebMethod(operationName = "getMostRecentOrder_VxA")
    public Order getMostRecentOrder_VxA(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "c_uname") String c_uname) {
        return new GetMostRecentOrder_VxA().getMostRecentOrder(c_uname);
    }
}
