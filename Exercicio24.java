/*
Escreva um programa que leia um n�mero inteiro e calcule a soma de todos os divisores desse n�mero. com exce��o dele pr�prio.Ex: a soma dos divisores do n�mero 66 � 1+2+3+6+11+22+33=78.
*/
package Modulo3;
import java.util.Scanner;
public class Exercicio24 {
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um n�mero inteiro: ");
		double num = leitor.nextDouble();
		double cont = num - 1, soma = 0;
		while(cont > 0)
		{
			if(num %cont == 0)
			{				
				soma = soma + cont;				
			}			
			cont = cont -1;
		}
		System.out.println("A soma de todos os multiplos �: " + soma);
		leitor.close();
	}
}