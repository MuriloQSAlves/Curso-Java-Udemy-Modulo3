/*
Faça um programa que leia um número inteiro positivo 'N' e imprima todos os números
naturais de 0 a 'N' em ordem decrescente.
*/
package Modulo3;
import java.util.Scanner;
public class Exercicio12 {
	public static void main(String[]args)
	{		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número positivo: ");
		int num = leitor.nextInt();
		while(num >=0)
		{
			System.out.println(num);
			num = num -= 1;
		}
		leitor.close();
	}
}
