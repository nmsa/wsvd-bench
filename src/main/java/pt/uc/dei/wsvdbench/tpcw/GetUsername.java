package pt.uc.dei.wsvdbench.tpcw;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pt.uc.dei.wsvdbench.tpcw.versions.GetUsername_Vx0;
import pt.uc.dei.wsvdbench.tpcw.versions.GetUsername_VxA;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - W Benchmark Services
 *
 *
 *
 * @author nmsa@dei.uc.pt
 */
@WebService()
public class GetUsername {

    @WebMethod(operationName = "getUserName_Vx0")
    public String getUserName_Vx0(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "C_ID") int C_ID) {
        return new GetUsername_Vx0().getUserName(C_ID);
    }

    @WebMethod(operationName = "getUserName_VxA")
    public String getUserName_VxA(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "C_ID") int C_ID) {
        return new GetUsername_VxA().getUserName(C_ID);
    }
}
