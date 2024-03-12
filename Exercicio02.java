package tarefa03;

import java.util.Scanner;


public class Exercicio02 {

	            //Algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
System.out.println("Total de Votos");
System.out.print("Digite o total de votos: ");
int Votos = scanner.nextInt();
System.out.print("Digite os votos válidos: ");
int Validos = scanner.nextInt();
float Eleitores = (Validos *100 /Votos);	        
System.out.println("Percentual Votos Válidos: " + Eleitores + "%");
System.out.print("Digite a quantidade votos nulos: ");
int Nulos = scanner.nextInt();	        
float EleitoresNulo = (Nulos *100 /Votos);	        
System.out.println("Percentual Votos Nulos: " + EleitoresNulo + "%");
System.out.print("Digite a quantidade votos brancos: ");
int Branco = scanner.nextInt();
float EleitoresBranco = (Branco *100 /Votos);	        
System.out.println("Percentual Votos Brancos: " + EleitoresBranco + "%");


scanner.close();
	}

}
