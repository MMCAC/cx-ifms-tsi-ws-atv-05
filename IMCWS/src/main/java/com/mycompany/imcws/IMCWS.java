/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imcws;


import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

/**
 *
 * @author maico
 */
@WebService
public class IMCWS{

    @WebMethod
    public double calcularIMC(
            @WebParam(name = "peso") double peso, 
            @WebParam(name = "altura") double altura) {
        return peso / (altura * altura);
    }

    @WebMethod
    public String categoriaIMC(@WebParam(name = "imc") double imc) {
        if (imc < 18.5) return "Abaixo do peso";
        if (imc < 25) return "Peso normal";
        if (imc < 30) return "Sobrepeso";
        if (imc < 35) return "Obesidade Grau I";
        if (imc < 40) return "Obesidade Grau II";
        return "Obesidade Grau III";
    }
}
