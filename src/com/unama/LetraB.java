package com.unama;

import java.util.Scanner;

public class LetraB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int producao;
        System.out.println("Informe o número de peças produzidas: ");
        producao = sc.nextInt();
        System.out.println("Informe o número de peças com defeito: ");
        double defeito = sc.nextInt();
        defeito = 0.10 * producao;
        if (defeito > 0.10) {
            System.out.println("A máquina precisa de manutenção");
        }else{
            System.out.println("A máquina não precisa de manutenção");
        }


    }
    }

