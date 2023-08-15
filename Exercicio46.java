/*
Fa�a um programa que gera um n�mero aleat�rio de 1 a 1000. O usu�rio deve tentar acertar qual o n�mero foi gerado, a cada tenrativa o programa dever� informar se o chute � menor ou maior que o n�mero gerado. o programa acaa quando o usu�rio acerttar o n�mero gerado. O programa deve informar em quantas tentativas o n�mero foi descoberto.
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
				System.out.println("O n�mero � menor.");
			}
			else if(chute < result)
			{
				System.out.println("O n�mero � maior.");
			}
			else
			{
				
			}
			contador ++;
		}
		System.out.println("Acertou! O n�mero �: " + result);
		System.out.println("Voc� necessitou de " + contador + " tentativas.");
		leitor.close();
	}
}
