/*
Faça um program que leia um número inteiro positivo ímpar 'N' e imprima todos os
números ímpares de 1 até 'N' em ordem decrescente.
*/
package Modulo3;
import java.util.Scanner;
public class Exercicio16 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um numero positivo e ímpar: ");
		int cont = leitor.nextInt();
		if(cont >= 0 && cont %2 != 0)
		{
			while(cont >= 0)
			{
				System.out.println(cont);
				cont = cont -= 2;
			}
			System.out.println(cont = 0);
		}
		else
		{
			System.out.println("Erro de entrada!");
		}
		leitor.close();
	}
}
