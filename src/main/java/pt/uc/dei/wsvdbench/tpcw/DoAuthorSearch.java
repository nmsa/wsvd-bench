package pt.uc.dei.wsvdbench.tpcw;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pt.uc.dei.wsvdbench.tpcw.object.Book;
import pt.uc.dei.wsvdbench.tpcw.versions.DoAuthorSearch_Vx0;
import pt.uc.dei.wsvdbench.tpcw.versions.DoAuthorSearch_VxA;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - W Benchmark Services
 *
 *
 *
 * @author nmsa@dei.uc.pt
 */
@WebService()
public class DoAuthorSearch {

    @WebMethod(operationName = "doAuthorSearch_VxA")
    public List<Book> doAuthorSearch_VxA(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "search_key") String search_key) {
        return new DoAuthorSearch_VxA().doAuthorSearch(search_key);
    }

    @WebMethod(operationName = "doAuthorSearch_Vx0")
    public List<Book> doAuthorSearch_Vx0(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "search_key") String search_key) {
        return new DoAuthorSearch_Vx0().doAuthorSearch(search_key);
    }
}
