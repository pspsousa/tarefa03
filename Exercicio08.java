package tarefa03;

import java.util.Scanner;

public class Exercicio08 {
	//Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto (TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula LITROS_USADOS=DISTANCIA/12. Ao final, o programa deve apresentar os valores da velocidade média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a quantidade de litros (LITROS_USADOS) utilizada na viagem.
	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("Calculadora de Litros Gastos");
System.out.print("Digite o tempo gasto na viagem (em horas): ");
float Tempo = scanner.nextFloat();
System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
float Velocidade = scanner.nextFloat();
float Distancia = Tempo * Velocidade;
float Combustivel = Distancia / 12;
System.out.println("Velocidade média: " + Velocidade + " km/h");
System.out.println("Tempo gasto na viagem: " + Tempo + " horas");
System.out.println("Distância percorrida: " + Distancia + " km");
System.out.println("Quantidade de litros de combustível utilizada: " + Combustivel + " litros");
						
scanner.close();

	}

}