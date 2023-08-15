/*
Fa�a um programa que leia um conjunto n�o determinado de valores, um de cada vez, e escreva para cada um dos valores lidos, o quadrado, o cubo e a raiz quadrada. Finalize a entrada de dados com um valor negativo ou zero.
*/
package Modulo3;
import java.util.*;
public class Exercicio42 {
	public static void main(String[]args)
	{		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
		int num = leitor.nextInt();
		if(num > 0)
		{
			double quadrado = Math.pow(num, 2);
			double cubo = Math.pow(num, 3);
			double raiz = Math.sqrt(num);
			System.out.println("O quadrado de " + num + " �: " + quadrado);
			System.out.println("O cubo de " + num + " �: " + cubo);
			System.out.println("A raiz de " + num + " �: " + raiz);
			while(num > 0)
				{
				if(num > 0)
				{
					System.out.println("Informe outro n�mero: ");
					num = leitor.nextInt();
					quadrado = Math.pow(num, 2);
					cubo = Math.pow(num, 3);
					raiz = Math.sqrt(num);
					System.out.println("O quadrado de " + num + " �: " + quadrado);
					System.out.println("O cubo de " + num + " �: " + cubo);
					System.out.println("A raiz de " + num + " �: " + raiz);
				}
				else
				{
					System.out.println("O programa encerrou");
				}
				}
		}
		else
		{
			System.out.println("O programa encerrou");
		}
		leitor.close();
	}
}
