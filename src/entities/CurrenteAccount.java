package entities;

public class CurrenteAccount extends Account{

    public CurrenteAccount(int Agency, int AccountNumber){
        super(Agency, AccountNumber);
    }

    @Override
    public boolean withdraw(double valor) {
        double WithdrawValue = valor + 0.20;
        return super.withdraw(WithdrawValue);
    }
}
