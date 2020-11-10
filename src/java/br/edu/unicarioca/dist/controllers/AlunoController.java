/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicarioca.dist.controllers;

import br.edu.unicarioca.dist.models.AlunoModel;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jonas
 */
@WebService(serviceName = "Aluno")
public class AlunoController {
    private final XStream toXML = new XStream(new DomDriver());
    private List<AlunoModel> aluno = new ArrayList<>();
    
    @WebMethod(operationName = "hello")
    public String hello() {
        aluno.add(new AlunoModel("jonas","292929292929","123"));
        aluno.add(new AlunoModel("maria","565767292929","123"));
        aluno.add(new AlunoModel("carla","435453345349","123"));
        return toXML.toXML(this.aluno);
    }
}
