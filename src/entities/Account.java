package entities;

public class Account {
     public int agency;
     public int currentAccount;
     public double balance;
     public String holder;

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

