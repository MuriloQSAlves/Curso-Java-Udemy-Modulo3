/*
 * Escreva um programa que leia um número não negativo 'n' e imprima a soma dos 'n' primeiros números primos.
 */
package Modulo3;
import java.util.*;
public class Exercicio55 {
	public static void main(String[]args)
	{
		int cont = 0, num, soma = 0, quant = 2;
		boolean primo;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número inteiro positivo: ");
		num = leitor.nextInt();
		if(num > 0)
		{
			while(cont < num) //Enquanto nao encontra um numero primo
			{
				primo = true; //considera-se o numero atual como primo
				for (int i = 2; i <= quant / 2; i ++) //Verifica se o numero atual e primo
				{
					if(quant % i == 0) //Se o numero e divisivel por um numero entre 2 e sua metade, ele nao e primo
					{
						primo = false;
						break;  //Interrompe o loop for, pois ja foi confirmado que o numero nao e primo
					}					
				}
				if(primo) //Se o numero e primo
				{
					soma = soma + quant; //adiciona o numero a soma
					cont ++; //Incrementa o contador de numeros primos encontrados
				}
				quant ++; //Testa o proximo numero
			}
			System.out.println("A soma dos " + num + " primeiros númeors primos é: " + soma);
		}
		else
		{
			System.out.println("Número inválido!!!");
		}
		leitor.close();
	}
}
