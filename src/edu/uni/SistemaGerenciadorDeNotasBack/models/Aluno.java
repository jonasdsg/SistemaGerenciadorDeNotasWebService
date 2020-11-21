package edu.uni.SistemaGerenciadorDeNotasBack.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Aluno  {

	private Integer id;
	private String nome;
	private String matricula;
	
	private Avaliacao avaliacao;
	
	public Aluno(){}
	
	public Aluno(String nome, String matricula, Avaliacao avaliacao) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.avaliacao = avaliacao;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	
}
