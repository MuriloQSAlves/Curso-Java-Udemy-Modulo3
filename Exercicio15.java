/*
Fa�a um programa que leia um n�mero inteiro positivo �mpar 'N' e imprima todos os n�meros
�mpar de 0 at� 'N' em ordem crescente.
*/
package Modulo3;
import java.util.Scanner;
public class Exercicio15 {
	public static void main(String[]args)
	{
		int num = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um n�mero positivo e �mpar: ");
		int cont = leitor.nextInt();
		System.out.println(num);
		num++;
		if(cont >= 0 && cont %2 != 0)
		{
			while(num <= cont)
			{
				System.out.println(num);
				num = num += 2;
			}
		}
		else
		{
			System.out.println("Erro de entrada!");
		}
		leitor.close();
	}
}
