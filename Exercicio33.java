/*
Dados "n" e dois números inteiros positivos, "i" e "j", diferentes de 0, imprimir em ordem crescente os "n" primeiros naturais que são múltiplos de "i" ou de "j" e/ou ambos.
Exemplo: Para n = 6, i = 2 e j = 3 a saída deverá ser: 0,2,3,4,6,8.
*/
package Modulo3;
import java.util.*;
public class Exercicio33 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe quantos números de múltiplos deseja: ");
		int quant = leitor.nextInt();
		System.out.println("Informe um valor inteiro positivo: ");
		int val1 = leitor.nextInt();
		System.out.println("Informe outro valor inteiro positivo: ");
		int val2 = leitor.nextInt();
		int cont = 0, num = 0;	
		System.out.print("R: ");
		do
		{
			if(num %val1 == 0 || num %val2 == 0 || num %val1 == 0 && num %val2 == 0)
			{
				System.out.print(num + ", ");				
				cont = cont + 1;
			}			
			num = num +1;
		}
		while(cont < quant);
		leitor.close();
	}
}
