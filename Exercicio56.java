/*
 * Faça um programa que calcule a soma de todos os números primos aaixo de dois milhões
 */
package Modulo3;
import java.lang.Math;
public class Exercicio56 {
	public static void main(String[]args)
	{
		int soma = 2, raiz, primo;
		
		for(int i = 3; i <= 2000000; i += 2)
		{
			primo = 1;		
			raiz = (int)Math.sqrt(i);
			for(int j = 3; j <= raiz; j += 2)
			{
				if(i % j == 0)
				{
					primo = 0;	
					break;
				}				
			}
			if(primo == 1)
			{
				soma += i;				
			}
		}			
		System.out.println("A soma de todos os números primos até 2000000 é: " + soma);
	}	
}
