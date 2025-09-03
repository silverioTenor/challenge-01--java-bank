package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    final ArrayList<Account> accounts = new ArrayList<>();

    void createAccount(Scanner scan) {
        long accountNumber = System.currentTimeMillis();
        double balance = 0;

        System.out.println("Enter with customer name:");
        String name = scan.next();

        Account newAccount = new Account.Builder()
                .number(accountNumber)
                .owner(name)
                .balance(balance)
                .build();

        accounts.add(newAccount);

        System.out.println("==================");
        System.out.println("Account Created!");
        System.out.println(newAccount.toString());
        System.out.println("==================");
    }

    Account getAccount(long accountNumber) {
        return accounts.stream()
                .filter(account -> account.getNumber() == accountNumber)
                .toList()
                .getFirst();
    }

    void viewAccount(long accountNumber, Scanner scan) {
        var startAction = true;

        Account myAccount = getAccount(accountNumber);

        do {
            System.out.println(" ");
            System.out.println("==================");
            System.out.println("Select one option");
            System.out.println("[1] - Balance");
            System.out.println("[2] - Deposit");
            System.out.println("[3] - Withdraw");
            System.out.println("[4] - Transfer");
            System.out.println("[5] - Exit");
            System.out.println("==================");
            System.out.println(" ");

            int option = scan.nextInt();

            switch (option) {
                case 1 -> System.out.println("Current balance: " + myAccount.getBalance() + " US$");
                case 2 -> {
                    System.out.println("Enter with value (0.0)");
                    double valueToDeposit = scan.nextDouble();
                    myAccount.deposit(valueToDeposit);
                }
                case 3 -> {
                    System.out.println("Enter with value (0.0)");
                    double valueToWithdraw = scan.nextDouble();
                    myAccount.withDraw(valueToWithdraw);
                }
                case 4 -> {
                    System.out.println("Enter with destination account");
                    long accountDestinationNumber = scan.nextLong();
                    Account accountDestination = getAccount(accountDestinationNumber);

                    if (accountDestination != null) {
                        System.out.println("Enter with value (0.0)");
                        double valueToTransfer = scan.nextDouble();
                        myAccount.transfer(accountDestination, valueToTransfer);
                    } else {
                        System.out.println("Account destination not found!");
                    }
                }
                case 5 -> startAction = false;
                default -> System.out.println("Invalid option!");
            }
        } while (startAction);
    }

    void getAll() {
        System.out.println("============================");
        if (!accounts.isEmpty()) {
            accounts.forEach(account -> System.out.println(account.toString()));
        } else {
            System.out.println("[]");
        }
        System.out.println("============================");
    }
}
