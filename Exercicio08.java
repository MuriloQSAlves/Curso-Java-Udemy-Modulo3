/*
Escreva um programa que leia 10 n�meros e escreva o menor valor lido e o maior valor lido.
*/
package Modulo3;
import java.util.*;
public class Exercicio08 {
	public static void main(String[]args)
	{ int num = 0, max = 0, min = 9999999;
		Scanner leitor = new Scanner(System.in);
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Informe um n�mero: ");
			num = leitor.nextInt();
			if(num > max)
			{
				max = num;
			}
			if(num < min)
			{
				min = num;
			}
		}
		System.out.println("O m�nimo �: " + min + ", o m�ximo �: " + max);
		leitor.close();
	}	
}
