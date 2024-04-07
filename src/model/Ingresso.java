/**
 * 
 */
package model;

/**
 * @author Lucas Batista 7 de abr. de 2024
 */
public class Ingresso {
	private String id;
	private float valor;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float valorFinal(float taxaConveniencia) {
		taxaConveniencia = 1 + taxaConveniencia / 100;
		return getValor() * taxaConveniencia;
	}
}
