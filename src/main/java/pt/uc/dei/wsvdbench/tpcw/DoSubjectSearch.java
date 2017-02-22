package pt.uc.dei.wsvdbench.tpcw;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pt.uc.dei.wsvdbench.tpcw.object.Book;
import pt.uc.dei.wsvdbench.tpcw.versions.DoSubjectSearch_Vx0;
import pt.uc.dei.wsvdbench.tpcw.versions.DoSubjectSearch_VxA;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - W Benchmark Services
 *
 *
 *
 * @author nmsa@dei.uc.pt
 */
@WebService()
public class DoSubjectSearch {

    @WebMethod(operationName = "doSubjectSearch_Vx0")
    public List<Book> doSubjectSearch_Vx0(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "search_key") String search_key) {
        return new DoSubjectSearch_Vx0().doSubjectSearch(search_key);
    }

    @WebMethod(operationName = "doSubjectSearch_VxA")
    public List<Book> doSubjectSearch_VxA(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "search_key") String search_key) {
        return new DoSubjectSearch_VxA().doSubjectSearch(search_key);
    }
}
