package com.fiap.view;
	import java.util.Scanner;
	
	public class Ex_1 {
	    public static void main(String[] args) {
	        // Cria um objeto Scanner para ler entrada do usuário
	        Scanner scanner = new Scanner(System.in);
	        
	        // Declara uma variável para armazenar a soma dos valores
	        int soma = 0;
	        
	        // Loop para ler 20 valores inteiros
	        for (int i = 1; i <= 20; i++) {
	            System.out.print("Digite o " + i + "º valor inteiro: ");
	            
	            // Lê o valor inteiro fornecido pelo usuário
	            int valor = scanner.nextInt();
	            
	            // Adiciona o valor lido à soma atual
	            soma += valor;
	        }
	        
	        // Fecha o Scanner, pois não será mais usado
	        scanner.close();
	        
	        // Apresenta o resultado da soma
	        System.out.println("A soma dos 20 valores é: " + soma);
	    }
	}
