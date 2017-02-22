package pt.uc.dei.wsvdbench.tpcw;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pt.uc.dei.wsvdbench.tpcw.object.Book;
import pt.uc.dei.wsvdbench.tpcw.versions.DoTitleSearch_Vx0;
import pt.uc.dei.wsvdbench.tpcw.versions.DoTitleSearch_VxA;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - W Benchmark Services
 *
 *
 *
 * @author nmsa@dei.uc.pt
 */
@WebService()
public class DoTitleSearch {

    @WebMethod(operationName = "doTitleSearch_Vx0")
    public List<Book> doTitleSearch_Vx0(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "search_key") String search_key) {
        return new DoTitleSearch_Vx0().doTitleSearch(search_key);
    }

    @WebMethod(operationName = "doTitleSearch_VxA")
    public List<Book> doTitleSearch_VxA(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "search_key") String search_key) {
        return new DoTitleSearch_VxA().doTitleSearch(search_key);
    }
}
