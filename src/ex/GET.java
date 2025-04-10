package ex;

public class GET {

	private int conta;
	private String nome;
	private double deposito;

	public void Abertura(int conta, String nome) {
		

	}

	public GET(String nome, int conta) {

		this.conta = conta;
		this.nome = nome;

		//só o depósito pode ser alterado

	}

	public String getName() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double dep) {

		this.deposito += dep;
	}

	public void setSaque(double saq) {

		this.deposito = deposito - saq - 5;
	}

	public String getInf() {

		return nome + " , " + conta + " , " + String.format("%.2f", deposito);

	}

}
