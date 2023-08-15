/*
Faça um programa que calcule a diferença entre a soma dos quadrados dos primeiros 100 números naturais e o quadrado da soma.
Ex.: A soma dos quadrados dos dez primeiros números naturais é,
1² + 2² + ... + 10² = 385
O quadrado da soma dos dez primeiros números naturais é,
(1 + 2 + ... + 10)² = 552 = 3025
A diferença entre a soma dos quadrados dos dez primeiros números naturais e o quadrado da soma é 3025 - 385 = 2640.
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
		System.out.println("A diferença dos diferença entre a soma dos quadrados dos primeiros 100 números naturais e o quadrado da soma é: " + (result2 - result1));		
	}
}
