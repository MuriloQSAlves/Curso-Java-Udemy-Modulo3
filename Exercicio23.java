/*
Faça um algoritmo que leia um número positivo e imprima seus divisores.
*/
package Modulo3;
import java.util.Scanner;
public class Exercicio23 {
	public static void main(String[]args)
	{		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número positivo: ");
		double num = leitor.nextDouble();
		double cont = num;
		while(cont != 0)		{
			if(num %cont == 0)
			{
				System.out.println(cont + " é divisor de " + num);
			}
			cont = cont - 1;
		}
		leitor.close();
	}
}
