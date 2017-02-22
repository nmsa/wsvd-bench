package pt.uc.dei.wsvdbench.tpcw;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pt.uc.dei.wsvdbench.tpcw.object.Customer;
import pt.uc.dei.wsvdbench.tpcw.versions.CreateNewCustomer_Vx0;
import pt.uc.dei.wsvdbench.tpcw.versions.CreateNewCustomer_Vx078;
import pt.uc.dei.wsvdbench.tpcw.versions.CreateNewCustomer_Vx103;
import pt.uc.dei.wsvdbench.tpcw.versions.CreateNewCustomer_Vx113;
import pt.uc.dei.wsvdbench.tpcw.versions.CreateNewCustomer_Vx132;
import pt.uc.dei.wsvdbench.tpcw.versions.CreateNewCustomer_VxA;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - W Benchmark Services
 *
 *
 *
 * @author nmsa@dei.uc.pt
 */
@WebService()
public class CreateNewCustomer {

    /**
     *
     * @param cust
     * @return
     */
    @WebMethod(operationName = "createNewCustomer_Vx0")
    public Customer createNewCustomer_Vx0(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "cust") Customer cust) {
        return new CreateNewCustomer_Vx0().createNewCustomer(cust);
    }

    /**
     *
     * @param cust
     * @return
     */
    @WebMethod(operationName = "createNewCustomer_VxA")
    public Customer createNewCustomer_VxA(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "cust") Customer cust) {
        return new CreateNewCustomer_VxA().createNewCustomer(cust);
    }

    /**
     *
     * @param cust
     * @return
     */
    @WebMethod(operationName = "createNewCustomer_Vx078")
    public Customer createNewCustomer_Vx078(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "cust") Customer cust) {
        return new CreateNewCustomer_Vx078().createNewCustomer(cust);
    }

    /**
     *
     * @param cust
     * @return
     */
    @WebMethod(operationName = "createNewCustomer_Vx103")
    public Customer createNewCustomer_Vx103(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "cust") Customer cust) {
        return new CreateNewCustomer_Vx103().createNewCustomer(cust);
    }

    /**
     *
     * @param cust
     * @return
     */
    @WebMethod(operationName = "createNewCustomer_Vx113")
    public Customer createNewCustomer_Vx113(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "cust") Customer cust) {
        return new CreateNewCustomer_Vx113().createNewCustomer(cust);
    }

    /**
     *
     * @param cust
     * @return
     */
    @WebMethod(operationName = "createNewCustomer_Vx132")
    public Customer createNewCustomer_Vx132(@WebParam(targetNamespace = "http://tpcw.wsvdbench.dei.uc.pt/", name = "cust") Customer cust) {
        return new CreateNewCustomer_Vx132().createNewCustomer(cust);
    }
}
