package com.mycompany.imcws;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import jakarta.xml.ws.Endpoint;

/**
 *
 * @author maico
 */
public class Servidor {
    public static void main(String[] args) {
        String url = "http://localhost:8080/imcws";
        Endpoint.publish(url, new IMCWS());
        System.out.println("Serviço IMC publicado em: " + url + "?wsdl");
    }
}
