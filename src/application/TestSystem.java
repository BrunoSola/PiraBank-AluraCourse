package application;

import employee.Administration;
import employee.Manager;
import employee.Marketing;
import entities.Authenticator;
import entities.Client;
import entities.SistemaInterno;

public class TestSystem {

    public static void main(String[] args) {

        Manager m = new Manager();
        m.setPassword(1234);

        Administration adm = new Administration();
        adm.setPassword(1234);

        Client client = new Client();
        client.setPassword(1234);


        SistemaInterno autenticacao = new SistemaInterno();
        autenticacao.authenticator(m);
        autenticacao.authenticator(adm);
        autenticacao.authenticator(client);


    }
}
