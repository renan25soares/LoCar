package entidades;

public class Locacao {
    private String ID;
    private String codigoCarro;
    private String codigoCliente;
    private String dataRetorno;

    public Locacao() {
    }

    public Locacao(String id, String codigoCarro, String codigoCliente, String dataRetorno) {
        this.ID = id;
        this.codigoCarro = codigoCarro;
        this.codigoCliente = codigoCliente;
        this.dataRetorno = dataRetorno;
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String id) {
        this.ID = id;
    }

    public String getCodigoCarro() {
        return codigoCarro;
    }

    public void setCodigoCarro(String codigoCarro) {
        this.codigoCarro = codigoCarro;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(String dataRetorno) {
        this.dataRetorno = dataRetorno;
    }
    
}
