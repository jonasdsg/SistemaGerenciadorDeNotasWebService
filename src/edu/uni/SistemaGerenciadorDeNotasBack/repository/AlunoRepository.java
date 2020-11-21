package edu.uni.SistemaGerenciadorDeNotasBack.repository;

import java.util.ArrayList;
import java.util.List;

import edu.uni.SistemaGerenciadorDeNotasBack.models.Aluno;
import edu.uni.SistemaGerenciadorDeNotasBack.models.Avaliacao;

public class AlunoRepository {
	
	private final List<Aluno> alunos = new ArrayList<Aluno>();
	
	public List<Aluno> findAll(){
		if(alunos.size()==0)
			push();
		return alunos;
	}
	
	private void push() {
		Aluno aluno1 = new Aluno("Jonas Góes","2017103223",new Avaliacao(2.0,3.0,6.0,6.0,8.0));
		Aluno aluno2 = new Aluno("Rafael Caixeta","2018100280",new Avaliacao(0.0,3.0,7.0,4.0,5.0));
		Aluno aluno3 = new Aluno("Fabrizio Alves","2018101441",new Avaliacao(2.0,3.0,8.0,7.0,8.0));
		Aluno aluno4 = new Aluno("Mr. Anderson","1010001000",new Avaliacao(0.0,0.2,6.5,6.0,5.0));

		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
	}

	public Aluno save(Aluno aluno) {
		alunos.add(aluno);
		return aluno;
	}
	
	public Aluno remove(String matricula) {
		int i = 0;
		for(Aluno aluno: alunos) {
			if(aluno.getMatricula().equals(matricula))
				break;
			i++;
		}
		Aluno tmp = alunos.get(i); 
		alunos.remove(i);
		return tmp; 
	}
}
