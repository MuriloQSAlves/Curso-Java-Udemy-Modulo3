/*
Escreva um algoritimo que leia certa quantidade de n�meros e imprima o maior deles e
quantas vezes o maior n�mero foi lido. A quantidade de n�meros a serem lidos deve ser
fornecida pelo usu�rio.
*/
package Modulo3;
import java.util.Scanner;
public class Exercicio18 {
	public static void main(String[]args)
	{
		int maior = 0, num, cont = 1, contador = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a quantidade de n�meros a serem inseridos:");
		int quant = leitor.nextInt();
		while (cont <= quant)
		{
			System.out.println("Insira um n�mero: ");
			num = leitor.nextInt();
			if(num > maior)
			{
				maior = num;
				contador = 1;				
			}
			else
			{
				if(maior == num)
				{
					contador = contador + 1;
				}
			}
			cont = cont + 1;			
		}
		System.out.println("O maior n�mero �: " + maior);
		System.out.println("O n�mero de repeti��es foi de: " + contador);
		leitor.close();
	}
}
