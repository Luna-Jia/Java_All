package atm_simulation;

import java.util.Scanner;

public class ATM_Simulation {

    private double balance = 100;
    static Scanner sc = new Scanner(System.in);
    public double getBalance(){
        return balance;
    }
    public void checkBalance() {
        System.out.printf("You have $%.2f in your account.\n",getBalance());
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.printf("$%.2f has been deposited to your account. \n", amount);
        } else {
            System.out.println("cannot proceed.");
        }
    }

    public void withdraw(double amount) {
        if (amount>0 && amount<=balance) {
            balance -= amount;
            System.out.printf("%.2f has been withdrawn from your account. \n",amount);
        }else {
            System.out.println("You do not have enough balance. Transaction ignored.");
        }
    }



    public static void main(String[] args) {

        int userInput;
        ATM_Simulation myAccount = new ATM_Simulation();
        double amount;

        do {
            System.out.print("Main menu:\n" +
                    "1: check balance\n" +
                    "2: withdraw\n" +
                    "3: deposit\n" +
                    "4: exit\n" +
                    "Enter a choice: ");
            userInput = ATM_Simulation.sc.nextInt();
            switch (userInput) {
                case 1:
                    myAccount.checkBalance();
                    System.out.println();
                    break;
                case 2:
                    System.out.print("please enter the amount you want to withdraw: ");
                    amount = ATM_Simulation.sc.nextDouble();
                    myAccount.withdraw(amount);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("please enter the amount you want to deposit: ");
                    amount = ATM_Simulation.sc.nextDouble();
                    myAccount.deposit(amount);
                    System.out.println();
                    break;
            }

        }while (userInput !=4);
        System.out.println("Have a nice day!");

        }
    }
