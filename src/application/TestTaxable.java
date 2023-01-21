package application;

import entities.CurrenteAccount;
import entities.LifeInsurance;
import util.CalculateTax;

public class TestTaxable {
    public static void main(String[] args) {
        CurrenteAccount client1 = new CurrenteAccount(1234, 54321);
        client1.deposit(2000);

        LifeInsurance client2 = new LifeInsurance();

        CalculateTax calc = new CalculateTax();
        calc.register(client1);
        calc.register(client2);

        System.out.println(calc.getTotalTax());
    }


}
