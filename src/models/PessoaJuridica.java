package models;

public class PessoaJuridica extends Pessoa{
    private String CNPJ;

    public PessoaJuridica() {
        this.CNPJ = "";
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
