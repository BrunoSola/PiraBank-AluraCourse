package employee;

import entities.EmployeeAuthenticator;

public class Manager extends EmployeeAuthenticator {

    private String username;// = getName().toLowerCase().replace(" ","");
    private int password;

    public Manager() {
        //super(name, cpf, salary);
        //this.password = password;
    }

    public double getBonus() {
        double bonus = super.getSalary();
        System.out.println("O bônus do "+ getName() + " é R$" + bonus);
        return bonus;
    }

}
