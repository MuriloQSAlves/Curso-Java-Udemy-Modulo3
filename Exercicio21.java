/*
Fa�a um programa que receba dois n�meros. Calcule e mostre:
* a soma dos n�meros pares desse intervalo de n�meros, invluindo os n�meros digitados.
* a multiplica��o dos n�meros �mpares desse intervalo, incluindo os digitados.
*/
package Modulo3;
import java.util.Scanner;
public class Exercicio21 {
	public static void main(String[]args)
	{
		int resultado = 0, result = 1;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int numA = leitor.nextInt();
		System.out.println("Informe mais um n�mero: ");
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
					System.out.println("Resultado �mpar: " + numA);
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
					System.out.println("Resultado �mpar: " + numA);										
				}
				numA = numA - 1;
			}			
		}
		else
		{
			System.out.println("N�meros iguais.");
		}
		System.out.println("Total das somas dos pares: " + resultado);
		System.out.println("Total da multiplica��o dos �mpares: " + result);
		leitor.close();		
	}
}
