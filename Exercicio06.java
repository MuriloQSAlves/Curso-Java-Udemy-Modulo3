//Fa�a um programa que leia 10 inteiros e imprima a m�dia
package Modulo3;
import java.util.Scanner;
public class Exercicio06 {
	public static void main(String[]args)
	{
		int cont = 0, num = 0, soma = 0, media = 0;
		Scanner leitor = new Scanner(System.in);
		while(cont < 10)
		{
			System.out.println("informe um numero inteiro: ");
			num = leitor.nextInt();
			soma = soma + num;
			cont += 1;
		}
		media = soma / cont;
		System.out.println("A m�dia dos n�meros �: " + media);
		leitor.close();
	}
}
