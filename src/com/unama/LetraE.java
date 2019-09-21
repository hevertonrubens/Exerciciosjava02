package com.unama;

import java.util.Scanner;

public class LetraE {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int faltas;
        float notas;
        System.out.println("Informe a quantidade de faltas do aluno: ");
        faltas = sc.nextInt();
        System.out.println("Informe a média alcançada pelo aluno: ");
        notas = sc.nextFloat();
        if ((faltas >= 40) && (notas <= 6.0)){
            System.out.println("Reprovado");
        }else if (notas <= 6.0) {
            System.out.println("Recuperação");
        }else{
            System.out.println("Aprovado");
        }
    }
}
