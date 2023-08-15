/*
 * Faça um programa que receba um número inteiro maior que 1, e verifique se o número fornecido é primo ou não
 */
package Modulo3;
import java.util.*;
public class Exercicio54 {
	public static void main(String[]args)
	{
		int cont = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número inteiro: ");
		int num = leitor.nextInt();
		for(int i = 1; i <= num; i++)
		{			
			if(num % i == 0)
			{
				cont++;
			}
		}
		if(cont == 2 )
		{
			System.out.println(num + " é primo.");
		}
		else
		{
			System.out.println(num + " não é primo.");
		}
		leitor.close();
	}
}
