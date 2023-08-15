/*
Escreva um programa completo que permita a qualquer aluno introduzir, pelo teclado uma sequência arbitrária de notas (válidas no intervalo de 10 a 20) e que mostre na tela como resultado, a correspondente média aritmética. O número de notas com que o aluno pretende efetuar o cálculo não será fornecido ao programa, o qual terminará quando for introduzido um valor que não seja válido como nota de aprovação.
*/
package Modulo3;
import java.util.*;
public class Exercicio22 {
	public static void main(String[]args)
	{
		double soma = 0, cont = 1;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe uma nota: ");
		double nota = leitor.nextDouble();
		double notaIni = nota;
		double media = 0;
		if(nota >=1 && nota <= 10)
		{
			while(nota >= 1 && nota <= 10)
			{
				System.out.println("Informe mais uma nota: ");
				nota = leitor.nextDouble();
				if(nota >= 1 && nota <=10)
				{
					soma = soma + nota;
					System.out.println(soma);
					cont++;
				}
			}
		}		
		media = (soma + notaIni) / cont;
		System.out.println(media);
		leitor.close();
	}
}