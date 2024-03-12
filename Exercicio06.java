package tarefa03;

import java.util.Scanner;

public class Exercicio06 {
	//Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula deconversão é C=(F-32)*(5/9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Conversao de Fahrenheit para Celsius");
System.out.print("Digite a temperatura em Fahrenheit: ");
float F = scanner.nextFloat();
double C = (F - 32) * (5.0 / 9.0);
System.out.println("A temperatura em Celsius é: " + C + "°C");
	
			
scanner.close();

	}

}