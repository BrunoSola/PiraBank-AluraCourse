package util;

public class CalculateTax {

    private double TotalTax;

    public void register(Taxable tax){
        double value = tax.getValueTax();
        this.TotalTax += value;
    }

    public double getTotalTax() {
        return TotalTax;
    }
}
