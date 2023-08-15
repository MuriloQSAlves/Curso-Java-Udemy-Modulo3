/*
Faça um programa que some os números ímpares contidos em um intervalo definido pelo usuário. O usuário define o valor inicial do intervalo e o final deste intervalo e o programa deve somar todos os números ímpares contidos neste intervalo. Caso o usuário digite um intervalo inválido (começando por um valor maior que o valor final) o programa termina.
Exemplo de tela:
Digite o valor inicial e valor final:
5
10
Soma dos ímpares neste intervalo: 21
*/
package Modulo3;
import java.util.Scanner;
public class Exercicio35 {
	public static void main(String[]args)
	{
		int soma = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor inicial: ");
		int numIni = leitor.nextInt();
		System.out.println("Digite o valor final");
		int numFim = leitor.nextInt();
		for(int i = numIni; i <= numFim; i++)
		{
			if(i %2 != 0)
			{
				soma = soma + i;
			}
		}
		System.out.println("soma"+soma);
		leitor.close();
	}
}
