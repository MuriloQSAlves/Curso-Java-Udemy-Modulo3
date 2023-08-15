/*
Faça um programa que apresente um menu de opções para cálculo das seguintes operações entre números:
* Adição (Opção 1)
* Subtração (Opção 2)
* Multiplicação (Opção 3)
* Divisão (Opção 4)
* Saída (Opção 5)
O programa deve possibilitar ao usuário a escolha da operação desejada, a exibição do resultado e a volta ao menu de opções. O programa só termina quando for escolhida a opção de saída (Opção 5).
*/
package Modulo3;
import java.util.*;
public class Exercicio47 {
	public static void main(String[]args)
	{
		int opcoes = 0, num1 = 0, num2 = 0, total = 0;
		Scanner leitor = new Scanner(System.in);
		while(opcoes != 5)
		{
			System.out.println("Escolha a operação desejada: ");
			System.out.println("(1) para Adição");
			System.out.println("(2) para Subtração");
			System.out.println("(3) para Multiplicação");
			System.out.println("(4) para Divisão");
			System.out.println("(5) para Sair");
			opcoes = leitor.nextInt();
			if (opcoes == 1)
			{
				System.out.println("Informe o primeiro valor: ");
				num1 = leitor.nextInt();
				System.out.println("Informe o segundo valor: ");
				num2 = leitor.nextInt();
				total = num1 + num2;
				System.out.println("O total da soma é: " + total);	
				System.out.println("");
			}
			else if (opcoes == 2)
			{
				System.out.println("Informe o primeiro valor: ");
				num1 = leitor.nextInt();
				System.out.println("Informe o segundo valor: ");
				num2 = leitor.nextInt();
				total = num1 - num2;
				System.out.println("O total da subtração é: " + total);	
				System.out.println("");
			}
			else if (opcoes == 3)
			{
				System.out.println("Informe o primeiro valor: ");
				num1 = leitor.nextInt();
				System.out.println("Informe o segundo valor: ");
				num2 = leitor.nextInt();
				total = num1 * num2;
				System.out.println("O total da multiplicação é: " + total);	
				System.out.println("");
			}
			else if (opcoes == 4)
			{
				System.out.println("Informe o primeiro valor: ");
				num1 = leitor.nextInt();
				System.out.println("Informe o segundo valor: ");
				num2 = leitor.nextInt();
				total = num1 / num2;
				System.out.println("O total da divisão é: " + total);
				System.out.println("");
			}
			else if (opcoes == 5)
			{
				System.out.println("Encerrando programa.");				
				break;
			}
			else
			{
				System.out.println("Erro de entrada.");
			}			
		}
		leitor.close();
	}
}
