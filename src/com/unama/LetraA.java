package com.unama;

import java.util.Scanner;

public class LetraA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totaldecopias;
        System.out.println("Informe o número de cópias: ");
        totaldecopias = sc.nextInt();
        double totalPago;
        if (totaldecopias <= 100) {
            totalPago = totaldecopias * 0.25;
        }else {
            totalPago = totaldecopias * 0.20;
        }
        System.out.println("O total a ser pago será de: " + totalPago);
        }

    }

