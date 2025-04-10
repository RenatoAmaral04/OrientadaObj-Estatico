package ex;
import java.util.Scanner;

public class EXERCICIOS {

	public static void main(String[] args) {
	
		Scanner ff = new Scanner(System.in);
		retangulo ret = new retangulo();
		

		System.out.print("Nome: ");
		ret.nome = ff.nextLine();

		
		System.out.print("NOTA 1 ");
		ret.nota1 =  ff.nextDouble(); 
		
		System.out.print("NOTA 2 ");
		ret.nota2 =  ff.nextDouble(); 
		
		System.out.print("NOTA 3 ");
		ret.nota3 =  ff.nextDouble();
		
		
	   System.out.printf("NOTA FINAL: %.2f%n", ret.media());
	  
	   
	   if (ret.media() < 60) {
		   
		   System.out.println("REPROVADO");
		   System.out.printf("FALTARAM %.2f pontos%n", ret.situcao());
		   
		  
	   }
	   
		//ret.situacao /*<- pegou da public */ (notaF); /*<- pegou da variavel */
		// não colocar o sacnner " = ff.nextDouble"................
	   
	   // ta recebendo o return do metodo -media-
	   //recebeu o if do metodo situacao
	   
	   
	}

}
