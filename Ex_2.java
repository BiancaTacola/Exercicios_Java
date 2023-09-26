package com.fiap.view;

import java.util.Scanner;

public class Ex_2 {


    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário o número para o qual a tabuada será calculada
        System.out.print("Digite um número para a tabuada: ");
        int numero = scanner.nextInt();
        
        // Loop para calcular e mostrar a tabuada do número de 0 a 12
        for (int i = 0; i <= 12; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        // Fecha o Scanner, pois não será mais usado
        scanner.close();
    }
}
