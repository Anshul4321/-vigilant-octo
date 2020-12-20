package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount(" XYZ","  BA720001");
        obj1.showMenu();


    }

}
class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customarID;

    //CONSTRUCTER
    BankAccount(String cname, String cid) {
        customerName = cname;
        customarID = cid;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        {
            balance = balance - amount;
            previousTransaction = -amount;

        }
    }

    void getpreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));

        } else {
            System.out.println("No transaction occured");
        }
    }

    void showMenu() {
        char option = '\0';
        Scanner readme = new Scanner(System.in);
        System.out.println("WELCOME" + customerName);
        System.out.println("Your id is" + customarID);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. withdraw");
        System.out.println("D. Previous transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("-----------------------------------");
            System.out.println("Enter an option;");
            option = readme.next().charAt(0);
            System.out.println("-----------------------------------");
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("-----------------------------------");
                    System.out.println("Balance= " + balance);
                    System.out.println("-----------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("-----------------------------------");
                    System.out.println("Enter the amount to deposit");
                    System.out.println("-----------------------------------");
                    int amount = readme.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("-----------------------------------");
                    System.out.println("Enter the amount to withdraw");
                    System.out.println("-----------------------------------");
                    int amount2 = readme.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("-----------------------------------");
                    getpreviousTransaction();
                    System.out.println("-----------------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("***************************************");
                    break;

                default:
                    System.out.println("Invalid option!!! Please try again");
                    System.out.println("\n");
                    break;

            }

        } while (option != 'E');
        System.out.println("Thank you for using our service");
    }

}






