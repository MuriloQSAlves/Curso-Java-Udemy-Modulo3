/*
Fa�a um programa que some todos os n�meros naturais abaixo de 1000 que s�o m�ltiplos de 3 e 5.
*/
package Modulo3;
public class Exercicio25 {
	public static void main(String[] args)
	{
		int num = 1000;
		while(num > 0)
		{
			if(num %3 == 0 && num %5 == 0)
			{
				System.out.println(num);
			}
			num = num -1; 
		}
	}
}
