package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank();
        int option = 0;
        Boolean stateFlow = true;

        do {
            System.out.println("===============================");
            System.out.println("========== JAVA BANK ==========");
            System.out.println("===============================");

            System.out.println(" ");
            System.out.println("[1] - Create account");
            System.out.println("[2] - Show account");
            System.out.println("[3] - List accounts");
            System.out.println("[4] - Exit");

            System.out.println("===============================");
            System.out.println("===============================");
            System.out.println(" ");

            option = scan.nextInt();

            switch (option) {
                case 1 -> bank.createAccount(scan);
                case 2 -> {
                    System.out.println("Enter with account number");
                    bank.viewAccount(scan.nextLong(), scan);
                }
                case 3 -> bank.getAll();
                case 4 -> stateFlow = false;
                default -> System.out.println("Invalid option");
            }
        } while (stateFlow);

        scan.close();
    }
}