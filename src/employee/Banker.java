package employee;

public class Banker extends Employee{

    @Override
    public double getBonus() {
        double bonus = super.getSalary() * 0.05;
        System.out.println("O bônus do "+ getName() + " é R$" + bonus);
        return bonus;
    }
}
