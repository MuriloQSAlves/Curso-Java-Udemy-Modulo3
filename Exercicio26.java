/*
Fa�a um algoritmo que encontre o primeiro m�ltiplo de 11, 13, ou 17 ap�s um n�mero dado.
*/
package Modulo3;
import java.util.Scanner;
public class Exercicio26 {
	public static void main(String[]args)
	{
		int mult= 0, div= 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");	
		int num = leitor.nextInt();		
		for(int i = num; div < 1; i++)
		{
			if (i %11 == 0 || i %13 == 0 || i %17 == 0)
			{
				mult = i;
				div++;
			}
		}
		System.out.println(mult);
		leitor.close();
	}
}
