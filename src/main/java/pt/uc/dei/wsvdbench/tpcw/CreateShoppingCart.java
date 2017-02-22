package pt.uc.dei.wsvdbench.tpcw;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pt.uc.dei.wsvdbench.tpcw.object.Cart;
import pt.uc.dei.wsvdbench.tpcw.versions.CreateShoppingCart_Vx0;
import pt.uc.dei.wsvdbench.tpcw.versions.CreateShoppingCart_VxA;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - W Benchmark Services
 *
 *
 *
 * @author nmsa@dei.uc.pt
 */
@WebService()
public class CreateShoppingCart {

    @WebMethod(operationName = "createShoppingCart_Vx0")
    public Cart createShoppingCart_Vx0(
            @WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "I_ID") Integer I_ID,
            @WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "ids") List<String> ids,
            @WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "quantities") List<String> quantities,
            @WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "SHOPPING_ID") Integer SHOPPING_ID) {
        return new CreateShoppingCart_Vx0().createShoppingCart(I_ID, ids, quantities, SHOPPING_ID);
    }

    @WebMethod(operationName = "createShoppingCart_VxA")
    public Cart createShoppingCart_VxA(
            @WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "I_ID") Integer I_ID,
            @WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "ids") List<String> ids,
            @WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "quantities") List<String> quantities,
            @WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "SHOPPING_ID") Integer SHOPPING_ID) {
        return new CreateShoppingCart_VxA().createShoppingCart(I_ID, ids, quantities, SHOPPING_ID);
    }
}
