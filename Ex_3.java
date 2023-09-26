package com.fiap.view;

public class Ex_3 {
    public static void main(String[] args) {
        // Declaramos os primeiros dois termos da sequência
        int termo1 = 1;
        int termo2 = 1;
        
        // Imprimimos os dois primeiros termos
        System.out.print(termo1 + " " + termo2 + " ");
        
        // Calculamos e imprimimos os próximos 28 termos
        for (int i = 3; i <= 30; i++) {
            int termoAtual = termo1 + termo2;
            
            // Imprimimos o termo atual
            System.out.print(termoAtual + " ");
            
            // Atualizamos os valores de termo1 e termo2 para os próximos cálculos
            termo1 = termo2;
            termo2 = termoAtual;
        }
    }
}
