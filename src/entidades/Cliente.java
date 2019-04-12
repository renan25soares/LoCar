package entidades;

public class Cliente {

    private String ID;
    private String nome;
    private String rg;
    private String cpf;
    private String carteiraMotorista;

    public Cliente() {
    }

    public Cliente(String ID, String nome, String rg, String cpf, String carteiraMotorista) {
        this.ID = ID;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.carteiraMotorista = carteiraMotorista;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCarteiraMotorista() {
        return carteiraMotorista;
    }

    public void setCarteiraMotorista(String carteiraMotorista) {
        this.carteiraMotorista = carteiraMotorista;
    }

}
