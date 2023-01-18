package employee;

public class Marketing extends Employee{

    @Override
    public double getBonus() {
        double bonus = 250.0;
        System.out.println("O bônus do "+ getName() + " é R$" + bonus);
        return bonus;
    }
}
