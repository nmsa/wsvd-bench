package pt.uc.dei.wsvdbench.tpcapp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import pt.uc.dei.wsvdbench.tpcapp.input.ProductDetailInput;
import pt.uc.dei.wsvdbench.tpcapp.output.ProductDetailOutput;
import pt.uc.dei.wsvdbench.tpcapp.versions.ProductDetail_Vx0;
import pt.uc.dei.wsvdbench.tpcapp.versions.ProductDetail_VxA;

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
public class ProductDetail {

    @WebMethod(operationName = "productDetail_Vx0")
    public ProductDetailOutput productDetail_Vx0(
            @WebParam(targetNamespace = "http://tpcapp.wsvdbench.dei.uc.pt/", name = "input") ProductDetailInput input) throws Exception {
        return new ProductDetail_Vx0().process(input);
    }

    @WebMethod(operationName = "productDetail_VxA")
    public ProductDetailOutput productDetail_VxA(
            @WebParam(targetNamespace = "http://tpcapp.wsvdbench.dei.uc.pt/", name = "input") ProductDetailInput input) throws Exception {
        return new ProductDetail_VxA().process(input);
    }
}
