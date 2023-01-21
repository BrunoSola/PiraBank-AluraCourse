package entities;

import util.Taxable;

public class CurrenteAccount extends Account implements Taxable {

    public CurrenteAccount(int Agency, int AccountNumber){
        super(Agency, AccountNumber);
    }

    @Override
    public boolean withdraw(double valor) {
        double WithdrawValue = valor + 0.20;
        return super.withdraw(WithdrawValue);
    }

    @Override
    public double getValueTax() {
        return super.getBalance() * 0.01;
    }
}
