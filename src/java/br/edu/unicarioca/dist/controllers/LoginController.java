/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicarioca.dist.controllers;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jonas
 */
@WebService(serviceName = "LoginController")
public class LoginController {

    private final String login="jonas";
    private final String senha="123";
    
    @WebMethod(operationName = "login")
    public boolean login(@WebParam(name = "login") String login,@WebParam(name = "senha") String senha) {
        return this.login.equals(login)&&this.senha.equals(senha);
    }
}
