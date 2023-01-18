package employee;

public class Economist extends Employee {

    @Override
    public double getBonus() {
        double bonus = 200.0;
        System.out.println("O bônus do "+ getName() + " é R$" + bonus);
        return bonus;
    }
}
