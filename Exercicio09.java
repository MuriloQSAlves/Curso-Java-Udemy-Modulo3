/*
Faça um programa que leia um número 'N' e depois imprima os 'N' primeiros números naturais ímpares
*/
package Modulo3;
import java.util.*;
public class Exercicio09 {
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int num = leitor.nextInt();
		int cont = num;
		for(int i = 1; i <= cont; i ++)
		{
			if(num % 2 == 0)
			{
				System.out.println(num += 1);
			}
			else
			{
				System.out.println(num += 2);
			}
			leitor.close();
		}
	}

}
