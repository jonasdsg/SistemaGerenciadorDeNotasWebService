/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicarioca.dist.controllers;

import br.edu.unicarioca.dist.models.AlunoModel;
import br.edu.unicarioca.dist.models.AvaliacaoModel;
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
    
    @WebMethod(operationName = "getAlunos")
    public String getAlunos(@WebParam(name = "name") String txt) {
        aluno.add(new AlunoModel("jonas","292929292929","123"));
        aluno.add(new AlunoModel("maria","565767292929","123"));
        aluno.add(new AlunoModel("carla","435453345349","123"));
        
        aluno.get(0).setProvas(new AvaliacaoModel());
        aluno.get(0).getProvas().setAps1(3);
        aluno.get(0).getProvas().setAps2(2);
        aluno.get(0).getProvas().setAv1(7);
        aluno.get(0).getProvas().setAv2(8);
        aluno.get(0).getProvas().setAv3(9);

        aluno.get(1).setProvas(new AvaliacaoModel());
        aluno.get(1).getProvas().setAps1(3);
        aluno.get(1).getProvas().setAps2(2);
        aluno.get(1).getProvas().setAv1(7);
        aluno.get(1).getProvas().setAv2(8);
        aluno.get(1).getProvas().setAv3(9);
        
        aluno.get(2).setProvas(new AvaliacaoModel());
        aluno.get(2).getProvas().setAps1(3);
        aluno.get(2).getProvas().setAps2(2);
        aluno.get(2).getProvas().setAv1(7);
        aluno.get(2).getProvas().setAv2(8);
        aluno.get(2).getProvas().setAv3(9);
        
        return toXML.toXML(this.aluno);
    }
    
    @WebMethod(operationName = "addAluno")
    public boolean addAluno(@WebParam(name = "addAluno") String alunoxml) {
        AlunoModel o = (AlunoModel) toXML.fromXML(alunoxml);
        if(o!=null){
            aluno.add(o);
            return true;
        }
        return false;
    }
    
    @WebMethod(operationName = "removeAluno")
    public boolean removeAluno(@WebParam(name = "removeAluno") String matricula) {
        boolean removed = false;
        for(AlunoModel al:aluno){
            if(al.getMatricula().equals(matricula)){
                aluno.remove(al);
                removed = true;
            }
        }
        return removed;
    }
}
