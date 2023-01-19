package employee;

import entities.EmployeeAuthenticator;

public class Administration extends EmployeeAuthenticator {

    @Override
    public double getBonus() {
        double bonus = 300.0;
        System.out.println("O bônus do "+ getName() + " é R$" + bonus);
        return bonus;
    }
}
