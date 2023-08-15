/*
Faça um programa que leia um valor N inteiro e positivo, calcule e mostre o valor E, conforme a fórmula a seguir.
E = 1 + 1/1 + 1/2 + 1/3 + ... + 1/N
*/
package Modulo3;
import java.util.*;
public class Exercicio28 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número inteiro positivo: ");
		int num = leitor.nextInt();
		double result = 0, denom = num;
		for(int i = 0; i < num; i ++)
		{
			result = result + (1/denom);
			System.out.println(denom);
			denom --;
		}
		System.out.println(result);
		leitor.close();
	}
}
