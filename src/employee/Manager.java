package employee;
import entities.Authenticator;

// Manager é um funcionario, herda a classe funcionario e assina o contrato Authenticator.
public class Manager extends Employee implements Authenticator {
    private int password;
    public double getBonus() {
        double bonus = super.getSalary();
        System.out.println("O bônus do "+ getName() + " é R$" + bonus);
        return bonus;
    }
    @Override
    public void setPassword(int password) {
        this.password = password;
    }
    @Override
    public boolean autentica(int password) {
        if (this.password == password){
            return true;
        }else {
            return false;
        }
    }





}
