//Fa�a um programa que leia 10 inteiros positivos, ignorando n�o positivos, e imprima sua m�dia
package Modulo3;
import java.util.*;
public class Exercicio07 {
	public static void main(String[]args)
	{
		int num, soma = 0, cont = 0;
		Scanner leitor = new Scanner(System.in);
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("Informe um n�mero: ");
			num = leitor.nextInt();
			if(num > 0)
			{
				soma = soma + num;
			}
			else
			{				
			}
			cont += 1;
		}
		System.out.println(soma);
		double media = soma / cont;
		System.out.println(media);
		leitor.close();
	}
}
