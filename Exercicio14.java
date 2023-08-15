/*
Faça um programa que leia um número inteiro positivo par 'N' e imprima todos os números
pares de 0 até 'N' em ordem decrescente.
*/
package Modulo3;
import java.util.*;
public class Exercicio14 {
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número positivo par: ");
		int cont = leitor.nextInt();
		if(cont > 0 && cont %2 == 0)
		{
			while(cont >= 0)
			{
				System.out.println(cont);
				cont -= 2;				
			}
		}
		else
		{
			System.out.println("Erro de entrada!");
		}
		leitor.close();
	}
}
