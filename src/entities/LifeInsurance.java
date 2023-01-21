package entities;

import util.Taxable;

public class LifeInsurance implements Taxable {

    @Override
    public double getValueTax() {
        return 42;
    }
}
