/*
Fa�a um programa que calcule a �rea de um tri�ngulo, cuja a base e altura s�o fornecidas pelo usu�rio. Esse programa n�o pode permitir a entrada de dados inv�lidos, ou seja, medidas menores ou iguais a 0.
A f�rmula da �rea de um tri�ngulo � A = (b*h)/2 sendo b = base e h = altura
*/
package Modulo3;
import java.util.Scanner;
public class Exercicio39 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a base do tri�ngulo: ");
		double base = leitor.nextDouble();
		System.out.println("Informe a altura do triangulo: ");
		double altura = leitor.nextDouble();
		if(base < 1 || altura < 1 || base < 1 && altura <1)
		{
			System.out.println("Erro de entrada!");
		}
		else
		{
			double area = (base * altura) / 2;
			System.out.println("A �rea do tri�ngulo �: " + area);
		}
		leitor.close();			
	}
}
