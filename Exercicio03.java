/*
Faça um algoritmo utilizando o comando 'while' que mostra uma contagem regressiva
na tela, iniciando em 10 e determinando em 0. Mostrar uma mensagem "FIM!" após a
contagem
*/
package Modulo3;

public class Exercicio03 {
	public static void main(String[]args)
	{
		int num = 10;
		while(num > 0)
		{
			System.out.println(num);
			num = num -= 1;
		}
		System.out.println("FIM!");
	}
}
