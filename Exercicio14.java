/*
Fa�a um programa que leia um n�mero inteiro positivo par 'N' e imprima todos os n�meros
pares de 0 at� 'N' em ordem decrescente.
*/
package Modulo3;
import java.util.*;
public class Exercicio14 {
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um n�mero positivo par: ");
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
