package entities;

public class Authentication {
    private int password;

    public void setPassword(int password) {
        this.password = password;
    }
    public boolean autentica(int password){
        if (this.password == password){
            return true;
        } else {
            return false;
        }
    }
}
