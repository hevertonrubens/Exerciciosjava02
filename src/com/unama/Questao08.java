package com.unama;

import java.util.Scanner;

public class Questao08 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int menu;
        int valor1;
        int valor2;
        int soma;
        System.out.println("[1] - Soma de dois números");
        System.out.println("[2] - Raíz quadrada de um número");
        System.out.println("Menu: ");
        menu = sc.nextInt();
        if (menu==1) {
            System.out.println("Digite dois números: ");
            valor1 = sc.nextInt();
            valor2 = sc.nextInt();
            soma = valor1 + valor2;
            System.out.println("O resultado é: " + soma);
        }
            else if (menu==2){
                System.out.println("Digite um número: ");
             sc = new Scanner(System.in);
            int valor = sc.nextInt();
            double raizQuadrada = Math.pow(valor, 0.5);

            System.out.println("A raíz quadrada é = " + raizQuadrada);

            }
        }
    }
