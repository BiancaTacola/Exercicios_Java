package com.fiap.view;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        int quantidadePessoas = 0; // Inicialmente, não temos pessoas informadas
        double somaSalarios = 0.0; // Inicialmente, a soma dos salários é zero
        
        // Loop para ler informações das pessoas
        while (true) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.next();
            
            System.out.print("Digite o salário da pessoa: ");
            double salario = scanner.nextDouble();
            
            // Adiciona o salário à soma
            somaSalarios += salario;
            
            quantidadePessoas++; // Incrementa a quantidade de pessoas informadas
            
            // Verifica se o usuário deseja continuar a inserir informações
            System.out.print("Deseja continuar (S/N)? ");
            String continuar = scanner.next();
            
            if (!continuar.equalsIgnoreCase("S")) {
                break; // Sai do loop se a resposta não for "S"
            }
        }
        
        // Fecha o Scanner, pois não será mais usado
        scanner.close();
        
        // Calcula a média dos salários
        double mediaSalarios = somaSalarios / quantidadePessoas;
        
        // Apresenta os resultados
        System.out.println("Quantidade de pessoas informadas: " + quantidadePessoas);
        System.out.println("Média dos salários: " + mediaSalarios);
    }
}
