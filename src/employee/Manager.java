package employee;

public class Manager extends Employee{

    private String username = getName().toLowerCase().replace(" ","");
    private int password;

    public Manager(String name, String cpf, double salary) {
        super(name, cpf, salary);
    }

    public String getUsername() {
        return username;
    }

    public int getPassword() {
        return password;
    }

    public double getBonus(){
        return getSalary();
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

}
