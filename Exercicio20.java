/*
Ler uma sequência de números inteiros e determinar se eles são pares ou não. Deverá ser informado o número de dados lidos e número de valores pares. O processo termina quando for digitado o número 1000.
*/
package Modulo3;
import java.util.*;
public class Exercicio20 {
	public static void main(String[]args)
	{
		int contador = 0, num;
		Scanner leitor = new Scanner (System.in);
		System.out.println("Informe um número");
		num = leitor.nextInt();
		while(num != 1000)
		{			
			if(num %2 == 0)
			{
				System.out.println(num + " é par");
				contador = contador + 1;
				System.out.println("Informe mais um número");
				num = leitor.nextInt();
			}
			else if(num %2 != 0)
			{
				System.out.println(num + " não é par");
				System.out.println("Informe mais um número");
				num = leitor.nextInt();
			}
		}
		System.out.println("A quantidade de números pares foi: " + contador);		
		leitor.close();
	}
}
