/*
Fa�a um programa que leia um n�mero inteiro positivo 'N' e calcule a soma dos 'N' primeiros
numeros naturais
*/
package Modulo3;
import java.util.*;
public class Exercicio17 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um n�mero positivo: ");
		int num = leitor.nextInt();
		int soma = 0, cont = 0;
		while(cont < num)
		{
			cont = cont + 1;
			soma = soma + cont;
			System.out.println(soma);
		}
		leitor.close();
	}
}
