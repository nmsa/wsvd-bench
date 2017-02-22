package pt.uc.dei.wsvdbench.tpcw;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pt.uc.dei.wsvdbench.tpcw.object.ShortBook;
import pt.uc.dei.wsvdbench.tpcw.versions.GetBestSellers_Vx0;
import pt.uc.dei.wsvdbench.tpcw.versions.GetBestSellers_VxA;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - W Benchmark Services
 *
 *
 *
 * @author nmsa@dei.uc.pt
 */
@WebService()
public class GetBestSellers {

    @WebMethod(operationName = "getBestSellers_Vx0")
    public List<ShortBook> getBestSellers_Vx0(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "subject") String subject) {
        return new GetBestSellers_Vx0().getBestSellers(subject);
    }

    @WebMethod(operationName = "getBestSellers_VxA")
    public List<ShortBook> getBestSellers_VxA(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "subject") String subject) {
        return new GetBestSellers_VxA().getBestSellers(subject);
    }
}
