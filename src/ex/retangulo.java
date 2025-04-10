package ex;

public class retangulo {

	public String nome;
	public double notaF, nota1, nota2, nota3;

	public double media() {

		return nota1 + nota2 + nota3;
	}
	// nessa parte, essa conta matematica nao precisa necessariamente estar em uma variável

	public double situcao() {

		if (media() < 60) {

			return media() - 60;
			// o return serve para executar uma operação

		} else {

			return 0.0;
		}

	}
// nesse caso não precisou converter para String, e a mostra do resultado ficu para a outra parte do código, se atentar a isso
	
	}


/*
 * public class retangulo {
 * 
 * public String nome; public double salario; public double taxa;
 * 
 * 
 * public double salarioLiquido() {
 * 
 * return salario - taxa; }
 * 
 * public void valorfinal(double aumentoSal){
 * 
 * salario += salario * aumentoSal / 100; }
 * 
 * public String toString() {
 * 
 * return nome + " , $ " + String.format("%.2f", salarioLiquido()) ; }
 */

/*
 * public double widht; public double height;
 * 
 * public double areatotal() {
 * 
 * return widht*height; }
 * 
 * public double peri() {
 * 
 * return 2 * (widht + height);
 * 
 * }
 * 
 * public double diag() {
 * 
 * return Math.sqrt(Math.pow(widht, 2) + Math.pow(height, 2)); }
 * 
 * public String toString() {
 * 
 * return "AREA = " + String.format("%.2f%n", areatotal()) + "PERIMETRO = " +
 * String.format("%.2f%n", peri()) + "DIAGONAL = " + String.format("%.2f%n",
 * diag()); }
 */
