package application;

import entities.CurrenteAccount;
import entities.SavingsAccount;

public class TestAccounts {

    public static void main(String[] args) {
        CurrenteAccount cc = new CurrenteAccount(1234, 98765);
        cc.deposit(1000.0);

        SavingsAccount sa = new SavingsAccount(4321, 56789);
        sa.deposit(2000.0);

        cc.transfer(500.0, sa);

        System.out.println("Conte Corrente = R$" + cc.getBalance());
        System.out.println("Conte Poupança = R$" + sa.getBalance());
    }
}
