package tarefa03;

import java.util.Scanner;

public class Exercicio04 {
	//O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.
	 
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("Custo do Carro");
System.out.print("Digite o custo de fábrica do carro: ");
double Fabrica = scanner.nextDouble();
double Distribuidor = 0.28 * Fabrica;
double Imposto = 0.45 * Fabrica;
double Final = Fabrica + Distribuidor + Imposto;
System.out.println("O custo final é: R$" + Final);


scanner.close();

	}

}
