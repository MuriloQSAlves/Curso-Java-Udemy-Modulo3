/*
Faça um algoritmo que converta uma velocidade expressa em km/h para m/s e vice e versa. Você deve criar um menu com duas opções de conversão e com uma opção para finalizar o programa. O usuário poderá fazer quantas conversões desejar, sendo que o programa só será finalizado quando a opção de finalizar for escolhida.
*/
package Modulo3;
import java.util.*;
public class Exercicio45 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escolha a opção desejada: ");
		System.out.println("Para fazer conversão digite '1': ");
		System.out.println("Para encerrar o programa digite '2': ");
		int opcao = leitor.nextInt();
		switch (opcao)
		{
		case 1:
			while(opcao == 1)
			{
				System.out.println("Informe a velocidade que desejas converter:");
				System.out.println("Converter km/h para m/s, digite 3: ");
				System.out.println("Converter m/s para km/h, digite 4: ");
				System.out.println("Digite '2' para sair.");
				int opVeloc = leitor.nextInt();
				if(opVeloc == 3)
				{
					double ms = 0;
					System.out.println("Informe a velocidade em km/h: ");
					double km = leitor.nextDouble();
					ms = km / 3.6;
					System.out.println("A velocidade convertida em m/s é de: " + ms);
				}
				else if(opVeloc == 4)
				{
					double km = 0;
					System.out.println("Informe a velocidade em m/s: ");
					double ms = leitor.nextDouble();
					km = ms * 3.6;
					System.out.println("A velocidade convertida em km/h é de: " + km);
				}
				else if(opVeloc == 2)
				{
					System.out.println("Sair do Programa");
					break;
				}
				else
				{
					System.out.println("erro de entrada!");
				}	
			}			
			break;			
		case 2:
			System.out.println("Programa Encerrado!");
			break;
		default:
			System.out.println("Entrada inválida!");
			break;
		}
		leitor.close();
	}
}
