/*
Escreva um programa que verifique quais números entre 1000 e 9999(inclusive) possuem a propriedade seguinte: a soma dos dois dígitos de mais aixa ordem com os dois dígitos de mais alta ordem elevada ao quadrado é igual ao prórpio número.
Por exemplo para o inteiro 2025, temos que:
30 + 25 = 55
55² = 3025
*/
package Modulo3;
public class Exercicio37 {
	public static void main(String[]args)
	{
		int soma = 0, parte1, parte2, quad;
		for(int i = 1000; i <= 9999; i ++)
		{
			parte1 = i / 100;
			parte2 = i %100;
			soma = parte1 + parte2;
			quad = soma * soma;
			if(quad == i)
			{
				System.out.println("O número " + i + " possui esta característica.");
			}			
		}
	}
}
