package employee;

public class Employee {

    private String name;
    private String cpf;
    private double salary;

    public Employee() {
//        this.name = name;
//        this.cpf = cpf;
//        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return this.salary * 0.1;
    }
}


