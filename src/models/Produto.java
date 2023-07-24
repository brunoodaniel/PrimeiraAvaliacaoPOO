package models;

public class Produto {
    private String docCliente;
    private String nome;
    private double valorUnitario;
    private double quantidadeVendida;

    public Produto(PessoaFisica docCliente, String nome, double valorUnitario, double quantidadeVendida){
        this.docCliente = String.valueOf(docCliente);
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.quantidadeVendida = quantidadeVendida;
    }
    public Produto(PessoaJuridica docCliente, String nome, double valorUnitario, double quantidadeVendida){
        this.docCliente = String.valueOf(docCliente);
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.quantidadeVendida = quantidadeVendida;
    }

    public String getDocCliente() {
        return docCliente;
    }

    public void setDocCliente(String docCliente) {
        this.docCliente = docCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    @Override
    public String toString() {
        return "Produto: " + this.nome + "Documento cliente: " + this.docCliente + "\nValor unitario:" + this.valorUnitario + "\nQuantidade vendida:" + this.quantidadeVendida;
    }
}
