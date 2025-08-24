package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    ArrayList<Account> accounts;

    void createAccount(Account account) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter with customer name:");
        String name = scan.next();

        Account newAccount = new Account();
        accounts.add(account);
    }

    Account getAccount(int accountNumber) {
        for (var acc : accounts) {
            if (acc.number == accountNumber) return acc;
        }
        return null;
    }

    ArrayList<Account> getAll() {
        return accounts;
    }
}
