package edu.uni.SistemaGerenciadorDeNotasBack.models;


public class Avaliacao {

	private Integer id;
	
	private Double aps1;
	private Double aps2;
	private Double av1;
	private Double av2;
	private Double av3;
	public Avaliacao() {}
	
	public Avaliacao(Double aps1, Double aps2, Double av1, Double av2, Double av3) {
		super();
		this.aps1 = aps1;
		this.aps2 = aps2;
		this.av1 = av1;
		this.av2 = av2;
		this.av3 = av3;
	}
	public Double getAps1() {
		return aps1;
	}
	public void setAps1(Double aps1) {
		this.aps1 = aps1;
	}
	public Double getAps2() {
		return aps2;
	}
	public void setAps2(Double aps2) {
		this.aps2 = aps2;
	}
	public Double getAv1() {
		return av1;
	}
	public void setAv1(Double av1) {
		this.av1 = av1;
	}
	public Double getAv2() {
		return av2;
	}
	public void setAv2(Double av2) {
		this.av2 = av2;
	}
	public Double getAv3() {
		return av3;
	}
	public void setAv3(Double av3) {
		this.av3 = av3;
	}
	
}
