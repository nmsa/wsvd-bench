package pt.uc.dei.wsvdbench.tpcw;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pt.uc.dei.wsvdbench.tpcw.object.ShortBook;
import pt.uc.dei.wsvdbench.tpcw.versions.GetNewProducts_Vx0;
import pt.uc.dei.wsvdbench.tpcw.versions.GetNewProducts_VxA;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - W Benchmark Services
 *
 *
 *
 * @author nmsa@dei.uc.pt
 */
@WebService()
public class GetNewProducts {

    @WebMethod(operationName = "getNewProducts_Vx0")
    public List<ShortBook> getNewProducts_Vx0(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "subject") String subject) {
        return new GetNewProducts_Vx0().getNewProducts(subject);
    }

    @WebMethod(operationName = "getNewProducts_VxA")
    public List<ShortBook> getNewProducts_VxA(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "subject") String subject) {
        return new GetNewProducts_VxA().getNewProducts(subject);
    }
}
