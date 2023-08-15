/*
Faça um programa para calcular as seguintes sequências:
1 + 2 + 3 + 4 + 5 + ... + n
1 - 2 + 3 - 4 + 5 + ... + (2n - 1)
1 + 3 + 5 + 7 + ... + (2n - 1)
*/
package Modulo3;
import java.util.*;
public class Exercicio30 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número positivo inteiro: ");
		int num = leitor.nextInt();
		int result = 0, calc = 1;
		System.out.println("sequência: +1+...+n=");
		for(int i = 1; i <= num; i++)
		{
			result = result + calc;
			System.out.print(" +" + calc);
			calc++;
		}
		System.out.println(": " + result);
		result = 0;
		int impar = (1);
		int par = (-2);
		System.out.println("sequência: +1-2+3-4...+(2n-1)=");
		for(int i = 0; i < num; i++)
		{
			result = result + impar + par;
			System.out.print(" +" + impar + " " + par);
			impar = impar + 2;
			par = par - 2;
		}
		System.out.println(": " + result);
		result = 1;
		int cont = 1;
		System.out.println("sequência: +1+3...+(2n-1)=");
		for(int i = 0; i < num; i++)
		{
			result = result + cont;
			System.out.print(" +" + cont);
			cont = cont + 2;
		}
		System.out.println(": " + result);
		leitor.close();
	}
}
