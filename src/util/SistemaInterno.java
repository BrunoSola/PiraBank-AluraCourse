package util;

import util.Authenticator;

public class SistemaInterno {

    private int password=1234;

    public void authenticator(Authenticator fa){
        boolean autentica = fa.autentica(this.password);
        if (autentica){
            System.out.println("Acesso confirmado!");
        }
        else{
            System.out.println("Acesso negado, senha invalida!");
        }
    }
}
