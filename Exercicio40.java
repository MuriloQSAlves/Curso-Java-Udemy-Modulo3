/*
Elabore um programa que fa�a leitura de v�rios n�meros inteiros, at� que se digite um n�mero negativo. O programa tem que retornar o maior e menor valor lido.
*/

package Modulo3;
import java.util.Scanner;
public class Exercicio40 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		int maior = 0, menor = 999999999, num;
		System.out.println("Informe um n�mero: ");
		num = leitor.nextInt();
		while(num > -1)
		{
			System.out.println("informe um novo n�mero: ");
			num = leitor.nextInt();
			if(num < menor && num > -1)
			{
				menor = num;
			}
			if(num > maior)
			{
				maior = num;
			}
		}
		System.out.println("Maior = " + maior);
		System.out.println("Menor = " + menor);		
		leitor.close();
	}
}
