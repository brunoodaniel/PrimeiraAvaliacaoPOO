package models;

public class PessoaFisica extends Pessoa{
    private String CPF;

    public PessoaFisica() {
        this.CPF = "";
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
