public class Main {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 200;
        System.out.println("O saldo da firstAccount é: $" + firstAccount.balance);


        Account secondAccount = new Account();
        secondAccount.balance = 50;
        System.out.println("O saldo da secondAccount é: $" + secondAccount.balance);

        firstAccount.balance += 100;
        secondAccount.balance += 300;
        System.out.println("O novo saldo da firstAccount é: $" + firstAccount.balance);
        System.out.println("O novo saldo da secondAccount é: $" + secondAccount.balance);
        
    }
}