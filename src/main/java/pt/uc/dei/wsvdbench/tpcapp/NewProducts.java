package pt.uc.dei.wsvdbench.tpcapp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import pt.uc.dei.wsvdbench.tpcapp.input.NewProductsInput;
import pt.uc.dei.wsvdbench.tpcapp.output.NewProductsOutput;
import pt.uc.dei.wsvdbench.tpcapp.versions.NewProducts_Vx0;
import pt.uc.dei.wsvdbench.tpcapp.versions.NewProducts_VxA;

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
public class NewProducts {

    @WebMethod(operationName = "newProducts_Vx0")
    public NewProductsOutput newProducts_Vx0(
            @WebParam(targetNamespace = "http://tpcapp.wsvdbench.dei.uc.pt/", name = "input") NewProductsInput input) throws Exception {
        return new NewProducts_Vx0().process(input);
    }

    @WebMethod(operationName = "newProducts_VxA")
    public NewProductsOutput newProducts_VxA(
            @WebParam(targetNamespace = "http://tpcapp.wsvdbench.dei.uc.pt/", name = "input") NewProductsInput input) throws Exception {
        return new NewProducts_VxA().process(input);
    }
}
