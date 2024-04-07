/**
 * 
 */
package model;

/**
 * @author Lucas Batista 7 de abr. de 2024
 */
public class IngressoVIP extends Ingresso {
	private String funcao;

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public float valorFinal(float taxaConveniencia) {
		taxaConveniencia = 1 + taxaConveniencia / 100;
		return getValor() * (taxaConveniencia + 0.18f) ;
	}
}
