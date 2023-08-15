/*
Em matemática o número harmônico designado por H(n) define-se como sendo a soma da série harmônica:
H(n) = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
Faça um programa que leia um valor "n" inteiro e positivoe apresente o valor de H(n).
*/
package Modulo3;
import java.util.Scanner;
public class Exercicio27 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número inteiro e positivo: ");
		int num = leitor.nextInt();
		double result = 0, denom = num; 
		for(int i = 0; i < num; i++)
		{
			result = result + (1 / denom);
			System.out.println("1/" + denom);
			denom --;			
		}
		System.out.println(result);
		leitor.close();
	}
}
