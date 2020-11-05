package br.edu.unicarioca.dist.models;

public class AlunoModel extends PessoaModel{
    
    private AvaliacaoModel provas;
    
    public AlunoModel(String nome, String matricula, String senha) {
        super(nome, matricula, senha);
    }
    
    public AvaliacaoModel getProvas() {
        return provas;
    }

    public void setProvas(AvaliacaoModel provas) {
        this.provas = provas;
    }
    
    
}
