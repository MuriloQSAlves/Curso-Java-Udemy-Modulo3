/*
Faça um programa que calcule e escreva o valor de S
S = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
*/
package Modulo3;
public class Exercicio31 {
	public static void main(String[]args)
	{
		double num = 1, denom = 1;
		double result = 0.00;
		while(num < 100)
		{
			result = result + (num / denom);
			System.out.println(num + "/" + denom + "= " + result);
			num = num + 2;
			denom++;
		}
		System.out.println("O valor de S é: "+ result);
	}
}
