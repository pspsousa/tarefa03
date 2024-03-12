package tarefa03;

import java.util.Scanner;


public class Exercicio01 {
            //Algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Idade em Dias");
        
        System.out.print("Digite a quantidade de anos: ");
        int anos = scanner.nextInt();
        System.out.print("Digite a quantidade de meses: ");
        int meses = scanner.nextInt();
        System.out.print("Digite a quantidade de dias: ");
        int dias = scanner.nextInt();
        int idadeDias = (anos * 365) + (meses * 30) + dias;
        System.out.println("A idade em dias é: " + idadeDias + " dias");
        
        scanner.close();
    }
}