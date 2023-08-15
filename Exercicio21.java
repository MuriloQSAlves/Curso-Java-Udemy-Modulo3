/*
Faça um programa que receba dois números. Calcule e mostre:
* a soma dos números pares desse intervalo de números, invluindo os números digitados.
* a multiplicação dos números ímpares desse intervalo, incluindo os digitados.
*/
package Modulo3;
import java.util.Scanner;
public class Exercicio21 {
	public static void main(String[]args)
	{
		int resultado = 0, result = 1;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numA = leitor.nextInt();
		System.out.println("Informe mais um número: ");
		int numB = leitor.nextInt();		
		if(numA < numB)
		{
			while(numA <= numB)
			{
				if(numA %2 == 0)
				{
					resultado = resultado + numA;
					System.out.println("Resultado par: " + numA);						
				}
				else if(numA %2 != 0)
				{
					result = result * numA;
					System.out.println("Resultado ímpar: " + numA);
					System.out.println(result);					
				}
				numA = numA + 1;
			}
		}
		else if(numA > numB)
		{
			while(numA >= numB)
			{
				if(numA %2 == 0)
				{
					resultado = resultado + numA;
					System.out.println("Resultado par: " + numA);						
				}
				else if(numA %2 != 0)
				{
					result = result * numA;
					System.out.println("Resultado ímpar: " + numA);										
				}
				numA = numA - 1;
			}			
		}
		else
		{
			System.out.println("Números iguais.");
		}
		System.out.println("Total das somas dos pares: " + resultado);
		System.out.println("Total da multiplicação dos ímpares: " + result);
		leitor.close();		
	}
}
