/*
 * Fa�a um programa que receba um n�mero inteiro maior que 1, e verifique se o n�mero fornecido � primo ou n�o
 */
package Modulo3;
import java.util.*;
public class Exercicio54 {
	public static void main(String[]args)
	{
		int cont = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um n�mero inteiro: ");
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
			System.out.println(num + " � primo.");
		}
		else
		{
			System.out.println(num + " n�o � primo.");
		}
		leitor.close();
	}
}
