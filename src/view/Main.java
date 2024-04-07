/**
 * 
 */
package view;

import model.Ingresso;
import model.IngressoVIP;

/**
 * @author Lucas Batista 7 de abr. de 2024
 */
public class Main {
	public static void main(String[] args) {
		Ingresso ingressoComum = new Ingresso();
		ingressoComum.setId("001");
		ingressoComum.setValor(100);
		float valorFinalComum = ingressoComum.valorFinal(15);
		System.out.println("Valor final do ingresso comum: R$" + valorFinalComum);

		IngressoVIP ingressoVIP = new IngressoVIP();
		ingressoVIP.setId("002");
		ingressoVIP.setValor(150);
		ingressoVIP.setFuncao("Convidado de Honra");
		float valorFinalVIP = ingressoVIP.valorFinal(10);

		System.out.println("Valor final do ingresso VIP: R$" + valorFinalVIP);
	}
}