package edu.uni.SistemaGerenciadorDeNotasBack.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import edu.uni.SistemaGerenciadorDeNotasBack.models.Aluno;
import edu.uni.SistemaGerenciadorDeNotasBack.repository.AlunoRepository;

@WebService
public class SgnManagerWs {
	
	private final AlunoRepository alunoRepository = new AlunoRepository();
	
	@WebMethod(operationName = "obterTodosOsAlunos")
	@WebResult(name = "item")
	public List<Aluno> obterAlunos(){
		return alunoRepository.findAll();
	}
	
	@WebMethod(operationName = "cadastrarAluno")
	@WebResult(name = "item")
	public Aluno cadastrarAluno(@WebParam(name = "aluno") Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	@WebMethod(operationName = "removerAluno")
	@WebResult(name = "item")
	public Aluno removerAluno(@WebParam(name = "matricula") String matricula) {
		return alunoRepository.remove(matricula);
	}
}
