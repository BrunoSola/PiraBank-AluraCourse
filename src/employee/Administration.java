package employee;

import entities.Authenticator;

// Administration é um funcionario, herda a classe funcionario e assina o contrato Authenticator.
public class Administration extends Employee implements Authenticator {

    private int password;
    @Override
    public double getBonus() {
        double bonus = 300.0;
        System.out.println("O bônus do "+ getName() + " é R$" + bonus);
        return bonus;
    }
    @Override
    public void setPassword(int password) {
        this.password = password;
    }
    public boolean autentica(int password){
        if (this.password == password){
            return true;
        } else {
            return false;
        }
    }
}
