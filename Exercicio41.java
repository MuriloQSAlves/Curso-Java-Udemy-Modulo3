/*
Fa�a um programa que calcula a associa��o em paralelo de dois resistores R1 e R2 fornecidos pelo usu�rio via teclado. O programa fica pedindo estes valores e calculando at� que o usu�rio entre com um valor para resist�ncia igual a zero.
F�rmula: R = (R1 * R2) / (R1 + R2)
*/
package Modulo3;
import java.util.Scanner;
public class Exercicio41 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor de R1: ");
		double R1 = leitor.nextDouble();
		System.out.println("Informe o valor de R2: ");
		double R2 = leitor.nextDouble();
		double Res = (R1 * R2) / (R1 + R2);
		System.out.println("O valor de resist�ncia �: " + Res);
		while(R1 > 0 && R2 > 0)
		{
			System.out.println("Informe o valor de R1: ");
			R1 = leitor.nextDouble();
			System.out.println("Informe o valor de R2: ");
			R2 = leitor.nextDouble();
			Res = (R1 * R2) / (R1 + R2);
			System.out.println("O valor de resist�ncia �: " + Res);
		}
		leitor.close();
	}	
}
