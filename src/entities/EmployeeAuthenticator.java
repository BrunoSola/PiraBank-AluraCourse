package entities;

import employee.Employee;

public abstract class EmployeeAuthenticator extends Employee {

    private int password;
    public void setPassword(int password){
        this.password = password;
    }
    public boolean authenticator(int password){
        if (this.password == password){
            return true;
        }else {
            return false;
        }
    }



}
