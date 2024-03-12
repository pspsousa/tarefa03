package tarefa03;

import java.util.Scanner;


public class Exercicio10 {
	//Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Alternando os valores das Variaveis");
System.out.print("Digite o valor para A: ");
int A = scanner.nextInt();
System.out.print("Digite o valor para B: ");
int B = scanner.nextInt();
int Troca = A;
A = B;
B = Troca;
System.out.println("Valor de A após a troca: " + A);
System.out.println("Valor de B após a troca: " + B);
	
		
		scanner.close();
	}

}

