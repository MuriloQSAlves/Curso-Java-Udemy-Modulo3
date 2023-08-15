/*
Leia um n�mero positivo do usu�rio, ent�o, calcule e imprima a sequencia Fibonacci at� o primeiro n�mero superior lido.
Exemplo: Se o usu�rio informou o n�mero 30, a sequencia a ser impressa ser� 0 1 1 2 3 5 8 13 21 34.
*/
package Modulo3;
import java.util.*;
public class Exercicio44 {
	public static void main(String[]args)
	{
		int numAnt = 1, numPos = 0, fibo = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um n�mero positivo: ");
		int quant = leitor.nextInt();
		System.out.println(numAnt);
		while(fibo <= quant)
		{
			numAnt = 	numAnt + numPos;	
			numPos = numAnt - numPos;
			System.out.println(numAnt);
			fibo = numAnt;			
		}
		leitor.close();
	}
}
