/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author Vitor
 */
public class Mavenproject1 {
 public static void main(String[] args) {
  
   Scanner transporte = new Scanner(System.in);

        System.out.println("Escolha seu transporte:");
        System.out.println("1 - Ônibus urbano (R$4.40)");
        System.out.println("2 - Metrô (R$5.00)");
        System.out.println("3 - Trem intermunicipal (R$8.50)");
        System.out.println("4 - Ônibus rodoviário (R$12.00)");
        
        int opcao = transporte.nextInt();

        if (opcao < 1 || opcao > 4) {
            System.out.println("Transporte inválido!");
        }

        System.out.println("Digite a quantidade de bilhetes:");
        int quantidade = transporte.nextInt();
        
        double total = 0;

        switch (opcao) {
            case 1 -> total = quantidade * 4.40;
            case 2 -> total = quantidade * 5.00;
            case 3 -> total = quantidade * 8.50;
            case 4 -> total = quantidade * 12.00;
        }

        System.out.printf("Valor total da compra: R$ %.2f%n", total);

        Scanner banco = new Scanner(System.in);
        double saldo = 1000;
        
        System.out.println("bem vindo ao Banco");
        System.out.println("1- consultar o saldo");
        System.out.println("2- sacar dinheiro");
        System.out.println("3- depositar dinheiro");
        System.out.println("4- encerrar atendimento");
        int opcao2 = banco.nextInt();
        
        switch (opcao2) {
            case 1 ->  System.out.printf("seu saldo atual é: R$ %.2f%n", saldo);
            case 2 -> { 
               System.out.print("digite o valor para saque:");
               double saque = banco.nextDouble();
               if (saque > saldo) {
                System.out.println("erro: saldo insuficiente");
               } else {
                   saldo -= saque;
                   System.out.printf("saque realizado. novo saldo: R$ %.2f%n",saldo);
                
               }
         }
            case 3 -> {
                System.out.print("digite o valor para deposito");
                
                double deposito = banco.nextDouble();
                saldo += deposito;
                System.out.printf("deposito realizado. novo saldo: R$ %.2f%n",saldo);
               
            }
            case 4 -> System.out.println("atendimento encerrado. obrigado");
          
            default -> System.out.println("erro: opçao invalida");
        }
        
        
        Scanner faixaetaria = new Scanner(System.in); 
        System.out.print("digite sua idade:");
        int idade = faixaetaria.nextInt();
        
        int faixa;

if (idade >= 0 && idade <= 12) {
    faixa = 1;
} else if (idade >= 13 && idade <= 17) {
    faixa = 2;
} else if (idade >= 18 && idade <= 59) {
    faixa = 3;
} else if (idade >= 60) {
    faixa = 4;
} else {
    faixa = -1;
}

switch (faixa) {
    case 1 -> System.out.println("Você é uma criança.");
    case 2 -> System.out.println("Você é um adolescente.");
    case 3 -> System.out.println("Você é um adulto.");
    case 4 -> System.out.println("Você é um idoso.");
    default -> System.out.println("Idade inválida.");
}
 }
    }
