package com.unama;

import java.util.Scanner;

public class LetraG {

        public static void main (String[] args){
            int numero;
            Scanner sc =  new Scanner(System.in);
            System.out.println("Informe um número: ");
            numero = sc.nextInt();
            if (numero % 2 == 0) {
                System.out.println("É Par");

            }else {
                System.out.println("É impar");
            }
        }

    }
