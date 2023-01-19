package entities;
//Contrato Autenticavel
    //Quem assina esse contrato, precisa implementar os metodos.
        //metodo setPassword.
        //metodo autentica.

public abstract interface Authenticator {

    public abstract void setPassword(int password);
    public abstract boolean autentica(int password);

}
