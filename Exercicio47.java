/*
Fa�a um programa que apresente um menu de op��es para c�lculo das seguintes opera��es entre n�meros:
* Adi��o (Op��o 1)
* Subtra��o (Op��o 2)
* Multiplica��o (Op��o 3)
* Divis�o (Op��o 4)
* Sa�da (Op��o 5)
O programa deve possibilitar ao usu�rio a escolha da opera��o desejada, a exibi��o do resultado e a volta ao menu de op��es. O programa s� termina quando for escolhida a op��o de sa�da (Op��o 5).
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
			System.out.println("Escolha a opera��o desejada: ");
			System.out.println("(1) para Adi��o");
			System.out.println("(2) para Subtra��o");
			System.out.println("(3) para Multiplica��o");
			System.out.println("(4) para Divis�o");
			System.out.println("(5) para Sair");
			opcoes = leitor.nextInt();
			if (opcoes == 1)
			{
				System.out.println("Informe o primeiro valor: ");
				num1 = leitor.nextInt();
				System.out.println("Informe o segundo valor: ");
				num2 = leitor.nextInt();
				total = num1 + num2;
				System.out.println("O total da soma �: " + total);	
				System.out.println("");
			}
			else if (opcoes == 2)
			{
				System.out.println("Informe o primeiro valor: ");
				num1 = leitor.nextInt();
				System.out.println("Informe o segundo valor: ");
				num2 = leitor.nextInt();
				total = num1 - num2;
				System.out.println("O total da subtra��o �: " + total);	
				System.out.println("");
			}
			else if (opcoes == 3)
			{
				System.out.println("Informe o primeiro valor: ");
				num1 = leitor.nextInt();
				System.out.println("Informe o segundo valor: ");
				num2 = leitor.nextInt();
				total = num1 * num2;
				System.out.println("O total da multiplica��o �: " + total);	
				System.out.println("");
			}
			else if (opcoes == 4)
			{
				System.out.println("Informe o primeiro valor: ");
				num1 = leitor.nextInt();
				System.out.println("Informe o segundo valor: ");
				num2 = leitor.nextInt();
				total = num1 / num2;
				System.out.println("O total da divis�o �: " + total);
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
