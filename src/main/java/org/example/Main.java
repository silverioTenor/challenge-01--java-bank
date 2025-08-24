package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("===============================");
            System.out.println("========== JAVA BANK ==========");
            System.out.println("===============================");

            System.out.println(" ");
            System.out.println("[1] - Create account");
            System.out.println("[2] - Deposit");
            System.out.println("[3] - Withdraw");
            System.out.println("[4] - Transfer");
            System.out.println("[5] - List accounts");
            System.out.println("[6] - Exit");

            System.out.println("===============================");
            System.out.println("===============================");
            System.out.println(" ");

            option = scan.nextInt();

            switch (option) {
                case 1
            }
        } while (true);
    }
}