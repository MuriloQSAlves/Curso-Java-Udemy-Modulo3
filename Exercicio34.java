/*
Faça um programa que calcule o menor número divisível por cada um dos números de 1 a 20.
Exemplo  2520 é o menor número que pode ser dividido por cada um dos números de 1 a 10, sem sorar resto.
*/
package Modulo3;
public class Exercicio34 {
	public static void main(String[]args)
	{
		int i, div, valor = 8;
		do
		{
			div = 0;
			valor += 2;
			for(i = 1; i <=20; i++)
			{
				if(valor %i == 0)
				{
					div ++;
				}
			}			
		}		
		while(div != 20);
		System.out.println(valor);
	}
}
