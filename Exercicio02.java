/*
Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 3 vezes. A primeira
vez deve usar a estrutura de repetição 'for', a segunda 'while', e a terceira 'do while'.
*/
package Modulo3;
public class Exercicio02 {
	public static void main(String[]args)
	{
		System.out.println("For");
		int num = 1;
		for(int i = 0; i < 100; i ++)
		{
			System.out.println(num);
			num++;
		}
		System.out.println("While");
		num = 1;
		while(num < 101)
		{
			System.out.println(num);
			num = num += 1;
		}
		System.out.println("Do While");
		num = 1;
		do
		{
			System.out.println(num);
			num = num += 1;
		}
		while(num < 101);
	}
}
