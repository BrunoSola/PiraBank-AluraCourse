package entities;

import java.sql.SQLOutput;

public class Account {
     private int agency;
     private int currentAccount;
     private double balance;
     private Client holder;
     // Criando um atributo static(atributo da classse conta)
    private static int amount;

    public Account(int agency, int currentAccount) {
        //criando um contador de contas instanciadas(abertas).
        Account.amount++;

        this.agency = agency;
        this.currentAccount = currentAccount;
    }

    public double getBalance() {
        return balance;
    }

    public int getAgency() {
        return agency;
    }
    public int getCurrentAccount() {

        return currentAccount;
    }

    public Client getHolder() {

        return holder;
    }
    public void setHolder(Client holder) {

        this.holder = holder;
    }

    public static int getAmount() {
        return amount;
    }

    public void deposit(double valor) {
        if (valor >= 0){
            this.balance += valor;
        }
        else {
            System.out.println("O valor de deposito não pode ser negativo.");
        }
    }

    public boolean withdraw(double valor){
         if (this.balance >= valor) {
              balance -= valor;
              return true;
         }
         return false;
    }

    public boolean transfer(double valor, Account destino){
        if (this.balance >= valor) {
            this.balance -= valor;
            destino.deposit(valor);
            return true;
        }
        return false;
    }
}

