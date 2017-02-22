package pt.uc.dei.wsvdbench.tpcw;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pt.uc.dei.wsvdbench.tpcw.object.Customer;
import pt.uc.dei.wsvdbench.tpcw.versions.GetCustomer_Vx0;
import pt.uc.dei.wsvdbench.tpcw.versions.GetCustomer_VxA;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - W Benchmark Services
 *
 *
 *
 * @author nmsa@dei.uc.pt
 */
@WebService()
public class GetCustomer {

    @WebMethod(operationName = "getCustomer_Vx0")
    public Customer getCustomer_Vx0(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "UNAME") String UNAME) {
        return new GetCustomer_Vx0().getCustomer(UNAME);
    }

    @WebMethod(operationName = "getCustomer_VxA")
    public Customer getCustomer_VxA(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "UNAME") String UNAME) {
        return new GetCustomer_VxA().getCustomer(UNAME);
    }
}
