package entities;

public class Address {
    public String number;
    public String street;
    public String city;
    public String state;
    public String zipCode;
    public String country;

    @Override
    public String toString() {
        return number + " " +
                street + ", " +
                city + ", " +
                state + ", " +
                zipCode + ", " +
                country + ".";
    }
}
