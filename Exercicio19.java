/*
Escreva um algoritmo que leia um númro inteiro entre 100 e 999 e imprima cada um dos algarísmos que compõem o número
*/
package Modulo3;
import java.util.*;
public class Exercicio19 {
	public static void main(String[]args)
	{		
		Scanner leitor = new Scanner (System.in);
		System.out.println("Informe um número entre 100 e 999: ");
		int num = leitor.nextInt();		
		while (num < 100 || num > 999)
		{
			System.out.println("Número inválido. Digite um numero entre 100 e 999: ");
			num = leitor.nextInt();
		}
		int cent = num / 100;
		int dez = (num - (cent * 100)) / 10;
		int unid = num - (cent * 100 + dez * 10);
		System.out.println(cent);
		System.out.println(dez);
		System.out.println(unid);
		leitor.close();
	}
}
