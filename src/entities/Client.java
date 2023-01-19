package entities;

// Cliente assina o contrato Authenticator.
public class Client implements Authenticator{
    private String name;
    private String cpf;
    private String profissao;
    private Address address;
    private int password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public void setPassword(int password){
        this.password = password;
    }

    public boolean autentica(int password){
        if (this.password == password){
            return true;
        }else {
            return false;
        }
    }
}
