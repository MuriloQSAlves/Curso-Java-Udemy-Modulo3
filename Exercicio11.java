/*
Faça um programa que leia um número inteiro positivo 'N' e imprima todos os números
naturais de 0 até 'N' em ordem crescente
*/
package Modulo3;
import java.util.Scanner;
public class Exercicio11 {
	public static void main(String[]args)
	{
		int num = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número positivo: ");
		int cont = leitor.nextInt();
		
		while(num <= cont)
		{
			System.out.println(num);
			num += 1;
		}
		leitor.close();
	}
}
