/*
Faça um programa que leia um número inteiro positivo par 'N' e imprima todos os números
pares de 0 até 'N' em ordem crescente
*/
package Modulo3;
import java.util.Scanner;
public class Exercicio13 {
	public static void main(String[]args)
	{
		int num = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número positivo par: ");
		int cont = leitor.nextInt();
		
		if(cont > 0 && cont %2 == 0)
		{
			while(num < cont)
			{
				num = num += 2;
				System.out.println(num);
			}
		}
		else
		{
			System.out.println("Erro de entrada!");
		}
		leitor.close();
	}
}
