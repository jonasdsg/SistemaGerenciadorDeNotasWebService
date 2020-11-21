package edu.uni.SistemaGerenciadorDeNotasBack;

import javax.xml.ws.Endpoint;
import edu.uni.SistemaGerenciadorDeNotasBack.ws.*;
public class SistemaGerenciadorDeNotasBack {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:12345/sgnws", new SgnManagerWs());

	}

}
