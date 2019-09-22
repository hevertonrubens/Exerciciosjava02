package com.unama;

import java.util.Scanner;

public class Questao12 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        double salario;
        double reajuste;
        System.out.println("Olá! Por favor, selecione o seu cargo: ");
        System.out.println("[1] - Escrituário");
        System.out.println("[2] - Secretário");
        System.out.println("[3] - Caixa");
        System.out.println("[4] - Gerente");
        System.out.println("[5] - Diretor");
        menu = sc.nextInt();
        if (menu == 1) {
            System.out.println("Digite o seu salário: ");
            salario = sc.nextInt();
            reajuste = (salario * 0.50);
            System.out.println("Seu salário passará a ser de: " + reajuste);
        }
        else if (menu==2){
            System.out.println("Digite o seu salário: ");
            salario = sc.nextInt();
            reajuste = (salario * 0.35);
            System.out.println("Seu salário passará a ser de: " + reajuste);
        }
        else if (menu==3){
            System.out.println("Digite o seu salário: ");
            salario = sc.nextInt();
            reajuste = (salario * 0.20);
            System.out.println("Seu salário passará a ser de: " + reajuste);
        }
        else if (menu==4) {
            System.out.println("Digite o seu salário: ");
            salario = sc.nextInt();
            reajuste = (salario * 0.10);
            System.out.println("Seu salário passará a ser de: " + reajuste);
        }
        else if (menu==5){
            System.out.println("Digite o seu salário: ");
            salario = sc.nextInt();
           System.out.println("Você não terá reajuste");
        }
        }
    }
