package entities;

// Cliente assina o contrato Authenticator.
public class Client implements Authenticator{
    private String name;
    private String cpf;
    private String profissao;
    private Address address;
    private Authentication autenticacao;

    public Client(){
        autenticacao = new Authentication();
    }

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

    public void setPassword(int password){
        this.autenticacao.setPassword(password);
    }
    public boolean autentica(int password){
        return this.autenticacao.autentica(password);
    }
}
