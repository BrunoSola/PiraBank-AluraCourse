package application;

import employee.Manager;

import java.util.Locale;
import java.util.Scanner;

public class TestManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Cadastramento do novo funcionario:");
        System.out.print("Nome do funcionario: ");
        String name = sc.nextLine();

        System.out.print("Cpf do funcionario: ");
        String cpf = sc.nextLine();

        System.out.print("Salario do funcionario: ");
        double salary = sc.nextDouble();

        Manager f1 = new Manager(name, cpf, salary);

        System.out.println("Username(Defaut): " + f1.getUsername());
        System.out.print("Digite uma senha: ");
        int password = sc.nextInt();
        f1.setPassword(password);
        System.out.println();

        System.out.print("Digite o Password para Login: ");
        password = sc.nextInt();
        System.out.println();
        System.out.println(password);
        f1.authenticator(password);
    }
}
