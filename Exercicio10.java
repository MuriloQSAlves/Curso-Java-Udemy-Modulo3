//Faça um programa que calcule e mostre a soma dos 50 primeiros números pares
package Modulo3;

public class Exercicio10 {
	public static void main(String[]args)
	{
		int num = 0, cont = 0;
		while(cont < 50)
		{
			num = num + 2;
			System.out.println(num);
			cont += 1;
		}
	}
}
