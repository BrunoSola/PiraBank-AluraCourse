package application;

import entities.*;

public class Main {
    public static void main(String[] args) {
        //Account firstAccount = new Account(); - Alterado, Account agora é uma classe abstract.
        Account firstAccount = new CurrenteAccount(1111, 22222);
        firstAccount.deposit(200);
        System.out.println("O saldo da firstAccount é: $" + firstAccount.getBalance());
        //Account secondAccount = new Account(); - Alterado, uma nova conta necessita de uma agencia e C/C para ser criada.
        Account secondAccount = new SavingsAccount(3333, 44444);
        secondAccount.deposit(50);
        System.out.println("O saldo da secondAccount é: $" + secondAccount.getBalance());
        System.out.println();
        System.out.println("O total de contas abertas é: "+ Account.getAmount() + " contas.");
        System.out.println();

        firstAccount.deposit(100);
        secondAccount.deposit(300);
        System.out.println("O novo saldo da firstAccount é: $" + firstAccount.getBalance());
        System.out.println("O novo saldo da secondAccount é: $" + secondAccount.getBalance());

        System.out.println();

        if(firstAccount.withdraw(200)){
            System.out.println("Saque Realizado com sucesso.");
            System.out.println("O novo saldo da firstAccount é: $" + firstAccount.getBalance());
        }else {
            System.out.println("Saldo insulficiente.");
        }

        System.out.println();

        if (secondAccount.withdraw(400)){
            System.out.println("Saque Realizado com sucesso.");
            System.out.println("O novo saldo da secondAccount é: $" + secondAccount.getBalance());
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
        System.out.println();

        Client client1 = new Client();
        client1.setName("Bruno Sola");
        client1.setCpf("111.111.111-11");
        client1.setProfissao("Student");

        // Composição - O titular da firstAccount aponta para o client1.
        firstAccount.setHolder(client1);

        System.out.println(firstAccount.getHolder().getName());
        System.out.println(firstAccount.getHolder().getCpf());
        System.out.println(firstAccount.getHolder().getProfissao());
        System.out.println();

        client1.setAddress(new Address()) ;
        client1.getAddress().setCity("Piracicaba");
        client1.getAddress().setCountry("Brasil");
        client1.getAddress().setNumber("1111");
        client1.getAddress().setState("São Paulo");
        client1.getAddress().setStreet("Av. São Paulo");
        client1.getAddress().setZipCode("12345-123");
        System.out.println(client1.getAddress());

    }
}