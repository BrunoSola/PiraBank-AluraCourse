package employee;

public class Administration extends Employee{

    @Override
    public double getBonus() {
        double bonus = 300.0;
        System.out.println("O bônus do "+ getName() + " é R$" + bonus);
        return bonus;
    }
}
