/*
Faça um programa que calcule a área de um triângulo, cuja a base e altura são fornecidas pelo usuário. Esse programa não pode permitir a entrada de dados inválidos, ou seja, medidas menores ou iguais a 0.
A fórmula da área de um triângulo é A = (b*h)/2 sendo b = base e h = altura
*/
package Modulo3;
import java.util.Scanner;
public class Exercicio39 {
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a base do triângulo: ");
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
			System.out.println("A área do triângulo é: " + area);
		}
		leitor.close();			
	}
}
