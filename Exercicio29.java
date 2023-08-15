/*
Escreva um programa para calcular o valor da série, para 5 termos.
S = 0 + 1/2 + 2/4 + 3/6 + ... 
*/
package Modulo3;
public class Exercicio29 {
	public static void main(String[] args) {
		int ciclos = 5;
		int num = 1;
		double div = 2, result = 0;
		for(int i = ciclos; i > 0; i --)
		{
			result = result + (num / div);
			System.out.println(num + "/" + div);
			num ++;
			div = div * 2;
		}
		System.out.println(result);
	}
}
