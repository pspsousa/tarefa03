package tarefa03;

import java.util.Scanner;

public class Exercicio03 {
 	//Algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário.

 public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);
System.out.println("Calculadora de Reajuste Salarial");
System.out.print("Digite o salário atual: ");
float salario1 = scanner.nextFloat();
System.out.print("Digite o percentual de reajuste em decimal: ");
float Reajuste = scanner.nextFloat();
float Salario2 = (salario1) * (1 + Reajuste/100);
System.out.println("Salario com reajuste: R$" + Salario2);


scanner.close();
	

	 }
}