/*
Faça um programa que determine e mostre os cinco primeiros multiplos de 3, considerando
números maiores que 0
*/
package Modulo3;

public class Exercicio01 {
	public static void main(String[]args)
	{
		int num = 3, cont = 1;
		for(int i = 0; i < 5; i++)
		{
			num = num * cont;
			cont++;
			System.out.println(num);
			num = 3;
		}
	}

}
