/*
Fa�a um programa que calcule a diferen�a entre a soma dos quadrados dos primeiros 100 n�meros naturais e o quadrado da soma.
Ex.: A soma dos quadrados dos dez primeiros n�meros naturais �,
1� + 2� + ... + 10� = 385
O quadrado da soma dos dez primeiros n�meros naturais �,
(1 + 2 + ... + 10)� = 552 = 3025
A diferen�a entre a soma dos quadrados dos dez primeiros n�meros naturais e o quadrado da soma � 3025 - 385 = 2640.
*/
package Modulo3;
public class Exercicio36 {
	public static void main(String[]args)
	{
		int num = 1, soma = 0, quad, result1 = 0, result2 = 0;
		for(int i = 0; i < 100; i ++)
		{
			quad = num * num;	
			result1 = result1 + quad;
			num++;
		}		
		System.out.println(result1);
		num = 1;		
		for(int i = 0; i < 100; i ++)
		{
			soma = soma + num;
			num++;
		}
		result2 = soma * soma;
		System.out.println(result2);
		System.out.println("A diferen�a dos diferen�a entre a soma dos quadrados dos primeiros 100 n�meros naturais e o quadrado da soma �: " + (result2 - result1));		
	}
}
