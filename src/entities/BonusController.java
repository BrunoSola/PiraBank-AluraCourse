package entities;

import employee.Employee;

public class BonusController {

    private double sum;

    public void register(Employee e) { // Utilizando polimorfismo - metodo register identifica o .getBonus especifico de cada employee com base no tipo objeto criado em "TestPolimorfismo".
        double bonus = e.getBonus();
        this.sum = this.sum + bonus;
    }

    public double getSum() {
        return sum;
    }
}
