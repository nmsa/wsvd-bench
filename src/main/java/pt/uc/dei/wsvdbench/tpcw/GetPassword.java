package pt.uc.dei.wsvdbench.tpcw;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pt.uc.dei.wsvdbench.tpcw.versions.GetPassword_Vx0;
import pt.uc.dei.wsvdbench.tpcw.versions.GetPassword_VxA;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - W Benchmark Services
 *
 *
 *
 * @author nmsa@dei.uc.pt
 */
@WebService()
public class GetPassword {

    @WebMethod(operationName = "getPassword_Vx0")
    public String getPassword_Vx0(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "C_UNAME") String C_UNAME) {
        return new GetPassword_Vx0().getPassword(C_UNAME);
    }

    @WebMethod(operationName = "getPassword_VxA")
    public String getPassword_VxA(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "C_UNAME") String C_UNAME) {
        return new GetPassword_VxA().getPassword(C_UNAME);
    }
}
