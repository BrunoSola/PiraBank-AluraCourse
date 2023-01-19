package entities;

public class SistemaInterno {

    private int password=1234;

    public void authenticator(EmployeeAuthenticator e){
        boolean autentica = e.authenticator(this.password);
        if (autentica){
            System.out.println("Acesso confirmado!");
        }
        else{
            System.out.println("Acesso negado, senha invalida!");
        }
    }
}
