package application;

import employee.Manager;
import entities.SistemaInterno;

public class TestSystem {

    public static void main(String[] args) {

        Manager m = new Manager();
        m.setPassword(1234);

        SistemaInterno autenticacao = new SistemaInterno();
        autenticacao.authenticator(m);

    }
}
