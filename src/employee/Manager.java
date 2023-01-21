package employee;
import util.Authentication;
import util.Authenticator;

// Manager é um funcionario, herda a classe funcionario e assina o contrato Authenticator.
public class Manager extends Employee implements Authenticator {

    private Authentication autenticacao;

    public Manager(){
        autenticacao = new Authentication(); // É uma composição, O Manager tem uma autenticação.
    }
    public double getBonus() {
        double bonus = super.getSalary();
        System.out.println("O bônus do "+ getName() + " é R$" + bonus);
        return bonus;
    }
    public void setPassword(int password) {
        this.autenticacao.setPassword(password);
    }
    public boolean autentica(int password) {
        return this.autenticacao.autentica(password);
    }





}
