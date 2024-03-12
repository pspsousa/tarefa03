package tarefa03;

import java.util.Scanner;

public class Exercicio07 {
	//Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume = πRaio2Altura

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Calculadora do Volume");
System.out.print("Digite o raio da lata de óleo: ");
float Raio = scanner.nextFloat();
System.out.print("Digite a altura da lata de óleo: ");
float Altura = scanner.nextFloat();
double Volume = Math.PI * Math.pow(Raio, 2) * Altura;
System.out.println("O volume da lata de óleo é: " + Volume );

			
					
scanner.close();

	}

}