/*
Faça um programa que gera um número aleatório de 1 a 1000. O usuário deve tentar acertar qual o número foi gerado, a cada tenrativa o programa deverá informar se o chute é menor ou maior que o número gerado. o programa acaa quando o usuário acerttar o número gerado. O programa deve informar em quantas tentativas o número foi descoberto.
*/
package Modulo3;
import java.util.*;
public class Exercicio46 {
	public static void main(String[]args)
	{
		Random r = new Random();
		int low = 1, high = 1000, chute = 0, contador = 0;
		int result = r.nextInt(high-low) + low;
		Scanner leitor = new Scanner(System.in);	
		while(chute != result)
		{
			System.out.println("Informe seu chute: ");
			chute = leitor.nextInt();
			if(chute > result)
			{
				System.out.println("O número é menor.");
			}
			else if(chute < result)
			{
				System.out.println("O número é maior.");
			}
			else
			{
				
			}
			contador ++;
		}
		System.out.println("Acertou! O número é: " + result);
		System.out.println("Você necessitou de " + contador + " tentativas.");
		leitor.close();
	}
}
