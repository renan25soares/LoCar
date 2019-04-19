package entidades;

public class Carro {

    private String ID;
    private String nome;
    private String marca;
    private String chassis;
    private String placa;
    private String kilometragem;
    private String status;
    private String valorLocacao;

    public Carro() {
    }

    public Carro(String ID, String nome, String marca, String chassis, String placa, String kilometragem, String status, String valorLocacao) {
        this.ID = ID;
        this.nome = nome;
        this.marca = marca;
        this.chassis = chassis;
        this.placa = placa;
        this.kilometragem = kilometragem;
        this.status = status;
        this.valorLocacao = valorLocacao;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(String kilometragem) {
        this.kilometragem = kilometragem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(String valorLocacao) {
        this.valorLocacao = valorLocacao;
    }
   
}
