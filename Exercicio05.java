//Fa�a um programa que pe�a ao usu�rio para digitar 10 valores e some-os
package Modulo3;
import java.util.Scanner;
public class Exercicio05 {
	public static void main(String[]args)
	{
		int num = 0, soma = 0;
		Scanner leitor = new Scanner(System.in);
		for(int i = 1; i <= 10; i ++)
		{
			System.out.println("Informe o " + i + "� valor: ");
			num = leitor.nextInt();
			soma = soma + num;
		}
		System.out.println(soma);
		leitor.close();
	}
}
