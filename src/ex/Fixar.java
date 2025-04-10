package ex;

public class Fixar {

	public static double IOF = 0.06;
	
	public static double val(double valor, double conversao) {
		
		return  valor * conversao *(1.0 + IOF);
	}	
}

//o val ta puxando os dois scanners para efetuar a conta e o IOF ja tem o valor pre definido