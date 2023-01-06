package entities;

public class Account {
     private int agency;
     private int currentAccount;
     private double balance;
     private Client holder;

    public double getBalance() {
        return balance;
    }

    public int getAgency() {
        return agency;
    }
    public void setAgency(int agency) {
        this.agency = agency;
    }
    public int getCurrentAccount() {
        return currentAccount;
    }
    public void setCurrentAccount(int currentAccount) {
        this.currentAccount = currentAccount;
    }
    public Client getHolder() {
        return holder;
    }
    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public void deposit(double valor) {
         this.balance += valor;
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

