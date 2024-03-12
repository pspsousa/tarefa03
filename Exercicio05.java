package tarefa03;

import java.util.Scanner;

public class Exercicio05 {
    //Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F = (9*C + 160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Convesao de Celsius para Fahrenheit");
    System.out.print("Digite a temperatura em Celsius: ");
    int C = scanner.nextInt();
    double F = (9 * C + 160) / 5;
    System.out.println("A temperatura em Fahrenheit é: " + F + "°F");
	
		scanner.close();

	}

}
