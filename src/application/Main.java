package application;

import entities.Account;
import entities.Address;
import entities.Client;

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
        System.out.println();

        Client client1 = new Client();
        client1.name = "Bruno Sola";
        client1.cpf = "111.111.111-11";
        client1.profissao= "Student";

        // Composição - O titular da firstAccount aponta para o client1.
        firstAccount.holder = client1;

        System.out.println(firstAccount.holder.name);
        System.out.println(firstAccount.holder.cpf);
        System.out.println(firstAccount.holder.profissao);
        System.out.println();

        client1.address = new Address();
        client1.address.city = "Piracicaba";
        client1.address.country = "Brasil";
        client1.address.number = "1111";
        client1.address.state = "São Paulo";
        client1.address.street = "Av. São Paulo";
        client1.address.zipCode = "12345-123";
        System.out.println(client1.address.toString());

    }
}