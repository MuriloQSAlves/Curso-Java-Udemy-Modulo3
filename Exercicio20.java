/*
Ler uma sequ�ncia de n�meros inteiros e determinar se eles s�o pares ou n�o. Dever� ser informado o n�mero de dados lidos e n�mero de valores pares. O processo termina quando for digitado o n�mero 1000.
*/
package Modulo3;
import java.util.*;
public class Exercicio20 {
	public static void main(String[]args)
	{
		int contador = 0, num;
		Scanner leitor = new Scanner (System.in);
		System.out.println("Informe um n�mero");
		num = leitor.nextInt();
		while(num != 1000)
		{			
			if(num %2 == 0)
			{
				System.out.println(num + " � par");
				contador = contador + 1;
				System.out.println("Informe mais um n�mero");
				num = leitor.nextInt();
			}
			else if(num %2 != 0)
			{
				System.out.println(num + " n�o � par");
				System.out.println("Informe mais um n�mero");
				num = leitor.nextInt();
			}
		}
		System.out.println("A quantidade de n�meros pares foi: " + contador);		
		leitor.close();
	}
}
