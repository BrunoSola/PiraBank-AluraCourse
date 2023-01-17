package entities;

public class Account {
     private int agency;
     private int AccountNumber;
     private double balance;
     private Client holder;
     // Criando um atributo static(atributo da classse conta)
    private static int amount;

    public Account(){

    }

    public Account(int agency, int AccountNumber) {
        //criando um contador de contas instanciadas(abertas).
        Account.amount++;

        this.agency = agency;
        this.AccountNumber = AccountNumber;
    }

    public int getAgency() {
        return agency;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return balance;
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
         System.out.println("Saldo Insulficiente!");
         return false;
    }

    public boolean transfer(double valor, Account destino){
        if (this.withdraw(valor)) {
            destino.deposit(valor);
            System.out.println("Transferencia realizada com sucesso!");
            return true;
        }
        return false;
    }
}

