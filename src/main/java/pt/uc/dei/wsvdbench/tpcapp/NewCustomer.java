package pt.uc.dei.wsvdbench.tpcapp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pt.uc.dei.wsvdbench.tpcapp.input.NewCustomerInput;
import pt.uc.dei.wsvdbench.tpcapp.output.NewCustomerOutput;
import pt.uc.dei.wsvdbench.tpcapp.versions.NewCustomer_Vx0;
import pt.uc.dei.wsvdbench.tpcapp.versions.NewCustomer_Vx101;
import pt.uc.dei.wsvdbench.tpcapp.versions.NewCustomer_Vx138;
import pt.uc.dei.wsvdbench.tpcapp.versions.NewCustomer_Vx158;
import pt.uc.dei.wsvdbench.tpcapp.versions.NewCustomer_Vx197;
import pt.uc.dei.wsvdbench.tpcapp.versions.NewCustomer_VxA;

/**
 * WS - Vulnerability Detection Tools Benchmark
 * TPC - APP Benchmark Services
 *
 *
 *
 *
 * @author cnl@dei.uc.pt
 * @author nmsa@dei.uc.pt
 */
@WebService
public class NewCustomer {

    @WebMethod(operationName = "newCustomer_Vx0")
    public NewCustomerOutput newCustomer_Vx0(@WebParam(name = "input", targetNamespace = "http://tpcapp.wsvdbench.dei.uc.pt/") NewCustomerInput input) throws Exception {
        return new NewCustomer_Vx0().process(input);
    }

    @WebMethod(operationName = "newCustomer_Vx101")
    public NewCustomerOutput newCustomer_Vx101(@WebParam(name = "input", targetNamespace = "http://tpcapp.wsvdbench.dei.uc.pt/") NewCustomerInput input) throws Exception {
        return new NewCustomer_Vx101().process(input);
    }

    @WebMethod(operationName = "newCustomer_Vx138")
    public NewCustomerOutput newCustomer_Vx138(@WebParam(name = "input", targetNamespace = "http://tpcapp.wsvdbench.dei.uc.pt/") NewCustomerInput input) throws Exception {
        return new NewCustomer_Vx138().process(input);
    }

    @WebMethod(operationName = "newCustomer_Vx158")
    public NewCustomerOutput newCustomer_Vx158(@WebParam(name = "input", targetNamespace = "http://tpcapp.wsvdbench.dei.uc.pt/") NewCustomerInput input) throws Exception {
        return new NewCustomer_Vx158().process(input);
    }

    @WebMethod(operationName = "newCustomer_Vx197")
    public NewCustomerOutput newCustomer_Vx197(@WebParam(name = "input", targetNamespace = "http://tpcapp.wsvdbench.dei.uc.pt/") NewCustomerInput input) throws Exception {
        return new NewCustomer_Vx197().process(input);
    }

    @WebMethod(operationName = "newCustomer_VxA")
    public NewCustomerOutput newCustomer_VxA(@WebParam(name = "input", targetNamespace = "http://tpcapp.wsvdbench.dei.uc.pt/") NewCustomerInput input) throws Exception {
        return new NewCustomer_VxA().process(input);
    }
}
