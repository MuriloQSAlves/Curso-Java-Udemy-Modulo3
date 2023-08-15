/*
Fa�a um programa que simula o lan�amento de doise dados, d1 e d2, "n" vezes, e tem como sa�da o n�mero de cada dado e a rela��o entre eles(>, <, =) de cada lan�amento.
*/
package Modulo3;
import java.util.Scanner;
public class Exercicio32 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe quantas vezes os dados devem ser lan�ados: ");
		int lances = leitor.nextInt();
		int dado1, dado2, min = 1, max = 6;
		for(int i = 0; i < lances; i ++)
		{
			dado1 = (int)Math.floor(Math.random() * (max - min + 1) + min);
			dado2 = (int)Math.floor(Math.random() * (max - min +1) + min);
			if(dado1 > dado2)
			{
				System.out.println("O dado 1 [" + dado1 + "] � maior que o dado 2 [" + dado2 + "]");
			}
			else if(dado1 < dado2)
			{
				System.out.println("O dado 2 [" + dado2 + "] � maior que o dado 1 [" + dado1 + "]");
			}
			else
			{
				System.out.println("O dado 1 [" + dado1 + "] � igual ao dado 2 [" + dado2 + "]");
			}			
		}
		leitor.close();
	}
}
