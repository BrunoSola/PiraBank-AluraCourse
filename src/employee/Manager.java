package employee;

public class Manager extends Employee{

    private String username = getName().toLowerCase().replace(" ","");
    private int password;

    public Manager(String name, String cpf, double salary, int password) {
        super(name, cpf, salary);
        this.password = password;

    }

    public String getUsername() {
        return username;
    }

    public int getPassword() {
        return password;
    }

    public void setChangeUsername(String username) {
        this.username = username;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void authenticator(int password) {
        if (this.password == password) {
            System.out.println("Login realizado com sucesso!");
            return;
        }
        System.out.println("Senha incorreta!");
    }

    public double getBonus() {
        return super.salary;
    }

}
