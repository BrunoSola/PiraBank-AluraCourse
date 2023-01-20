package employee;

import entities.Authentication;
import entities.Authenticator;

// Administration é um funcionario, herda a classe funcionario e assina o contrato Authenticator.
public class Administration extends Employee implements Authenticator {

    private Authentication autenticacao;
    public Administration(){
        autenticacao = new Authentication();
    }
    @Override
    public double getBonus() {
        double bonus = 300.0;
        System.out.println("O bônus do "+ getName() + " é R$" + bonus);
        return bonus;
    }

    public void setPassword(int password) {
        this.autenticacao.setPassword(password);
    }
    public boolean autentica(int password){
        return this.autenticacao.autentica(password);
    }
}
