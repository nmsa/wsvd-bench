package pt.uc.dei.wsvdbench.tpcw;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pt.uc.dei.wsvdbench.tpcw.versions.AdminUpdate_Vx0;
import pt.uc.dei.wsvdbench.tpcw.versions.AdminUpdate_VxA;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - W Benchmark Services
 *
 *
 *
 * @author nmsa@dei.uc.pt
 */
@WebService
public class AdminUpdate {

    @WebMethod(operationName = "adminUpdate_Vx0")
    public void adminUpdate_Vx0(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "i_id") int i_id,
            @WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "cost") double cost,
            @WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "image") String image,
            @WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "thumbnail") String thumbnail) {
        new AdminUpdate_Vx0().adminUpdate(i_id, cost, image, thumbnail);
    }

    @WebMethod(operationName = "adminUpdate_VxA")
    public void adminUpdate_VxA(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "i_id") int i_id,
            @WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "cost") double cost,
            @WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "image") String image,
            @WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "thumbnail") String thumbnail) {
        new AdminUpdate_VxA().adminUpdate(i_id, cost, image, thumbnail);
    }
}
