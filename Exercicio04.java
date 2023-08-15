/*
Escreva um programa que declare um inteiro, inicialize-o com 0, e incremente-o de 1000
em 1000, imprimindo seu valor na tela, até que seu valor seja 100000.
*/
package Modulo3;
public class Exercicio04 {
	public static void main(String[]args)
	{
		int num = 1000;
		while(num < 100001)
		{
			System.out.println(num);
			num = num += 1000;
		}
	}
}
