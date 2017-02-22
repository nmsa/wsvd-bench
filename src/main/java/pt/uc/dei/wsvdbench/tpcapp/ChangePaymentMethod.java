package pt.uc.dei.wsvdbench.tpcapp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pt.uc.dei.wsvdbench.tpcapp.output.ChangePaymentMethodOutput;
import pt.uc.dei.wsvdbench.tpcapp.input.ChangePaymentMethodInput;
import pt.uc.dei.wsvdbench.tpcapp.versions.ChangePaymentMethod_Vx0;
import pt.uc.dei.wsvdbench.tpcapp.versions.ChangePaymentMethod_VxA;

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
public class ChangePaymentMethod {

    @WebMethod(operationName = "changePaymentMethod_Vx0")
    public ChangePaymentMethodOutput changePaymentMethod_Vx0(
            @WebParam(targetNamespace = "http://tpcapp.wsvdbench.dei.uc.pt/", name = "input") ChangePaymentMethodInput input) throws Exception {
        return new ChangePaymentMethod_Vx0().process(input);
    }

    @WebMethod(operationName = "changePaymentMethod_VxA")
    public ChangePaymentMethodOutput changePaymentMethod_VxA(
            @WebParam(targetNamespace = "http://tpcapp.wsvdbench.dei.uc.pt/", name = "input") ChangePaymentMethodInput input) throws Exception {
        return new ChangePaymentMethod_VxA().process(input);
    }
}
