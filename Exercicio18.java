/*
Escreva um algoritimo que leia certa quantidade de números e imprima o maior deles e
quantas vezes o maior número foi lido. A quantidade de números a serem lidos deve ser
fornecida pelo usuário.
*/
package Modulo3;
import java.util.Scanner;
public class Exercicio18 {
	public static void main(String[]args)
	{
		int maior = 0, num, cont = 1, contador = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a quantidade de números a serem inseridos:");
		int quant = leitor.nextInt();
		while (cont <= quant)
		{
			System.out.println("Insira um número: ");
			num = leitor.nextInt();
			if(num > maior)
			{
				maior = num;
				contador = 1;				
			}
			else
			{
				if(maior == num)
				{
					contador = contador + 1;
				}
			}
			cont = cont + 1;			
		}
		System.out.println("O maior número é: " + maior);
		System.out.println("O número de repetições foi de: " + contador);
		leitor.close();
	}
}
