package application;

import entities.Account;

public class Main {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 200;
        System.out.println("O saldo da firstAccount é: $" + firstAccount.balance);
        Account secondAccount = new Account();
        secondAccount.balance = 50;
        System.out.println("O saldo da secondAccount é: $" + secondAccount.balance);

        System.out.println();

        firstAccount.deposit(100);
        secondAccount.deposit(300);
        System.out.println("O novo saldo da firstAccount é: $" + firstAccount.balance);
        System.out.println("O novo saldo da secondAccount é: $" + secondAccount.balance);

        System.out.println();

        if(firstAccount.withdraw(200)){
            System.out.println("Saque Realizado com sucesso.");
            System.out.println("O novo saldo da firstAccount é: $" + firstAccount.balance);
        }else {
            System.out.println("Saldo insulficiente.");
        }

        System.out.println();

        if (secondAccount.withdraw(400)){
            System.out.println("Saque Realizado com sucesso.");
            System.out.println("O novo saldo da secondAccount é: $" + secondAccount.balance);
        }else {
            System.out.println("Saldo insulficiente.");
        }

        System.out.println();

        if (firstAccount.transfer(100, secondAccount)){
            System.out.println("Transferiencia realizada com sucesso.");
        }
        else {
            System.out.println("Saldo insulficiente.");
        }


    }
}