/*
Faça um prgrama que leia um número indeterminado e idades de indivíduos (pare quando for informada a idade 0), e calcule a idade média desse grupo.
*/
package Modulo3;
import java.util.*;
public class Exercicio43 {
	public static void main(String[]args)
	{
		double media, soma = 0;
		int cont = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a idade: ");
		double idade = leitor.nextDouble();
		if(idade > 0)
		{
			soma = idade;
			cont = 1;
			while(idade > 0)
			{
				if(idade > 0)
				{
					System.out.println("Informe mais uma idade");
					idade = leitor.nextDouble();
					soma = soma + idade;
					cont ++;
				}
				else
				{
					
				}				
			}
		}
		cont --;
		media = soma / cont;
		System.out.println(media);
		leitor.close();		
	}
}
