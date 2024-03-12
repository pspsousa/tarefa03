package tarefa03;

import java.util.Scanner;

public class Exe09 {
	//Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Calculadora de prestação em atraso");
System.out.print("Valor original da prestação: ");
float Valor = scanner.nextFloat();
System.out.print("Taxa de juros cobrada diariamente em decimal: ");
float Taxa = scanner.nextFloat();
System.out.print("Quantos de dias em atraso: ");
int Tempo = scanner.nextInt();
double Valoratualizado = Valor + (Valor * (Taxa / 100) * Tempo);
System.out.println("O valor da prestação atualizado é: R$" + Valoratualizado);
						
								
scanner.close();

		}
}