package views;

import models.PessoaFisica;
import models.PessoaJuridica;
import models.Produto;

import java.util.Scanner;

public class ClienteView {
    Scanner read = new Scanner(System.in);

    public PessoaFisica InicioFisico() {
        PessoaFisica pessoaFisica = new PessoaFisica();
        read.nextLine();
        System.out.println("Qual o seu nome?");
        String nome = read.nextLine();
        pessoaFisica.setNome(nome);

        System.out.println("Qual o seu CPF?");
        String cpf = read.next();
        pessoaFisica.setCPF(cpf);

        return pessoaFisica;
    }
    public PessoaJuridica InicioJuridico(){
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        read.nextLine();
        System.out.println("Qual o seu nome?");
        String nome = read.nextLine();
        pessoaJuridica.setNome(nome);

        System.out.println("Qual o seu CNPJ?");
        String cnpj = read.next();

        pessoaJuridica.setCNPJ(cnpj);

        return pessoaJuridica;

    }
    public Produto Produto(PessoaFisica pessoaFisica){
        System.out.println("Digite o nome do produto: ");
        read.nextLine();
        String nomeProduto = read.nextLine();

        System.out.println("Digite o valor unitário do produto: ");
        double valorUnitario = read.nextDouble();

        System.out.println("Digite a quantidade de produto");
        int quantidadeDeProduto = read.nextInt();

        return new Produto(pessoaFisica, nomeProduto, valorUnitario, quantidadeDeProduto);

    }
    public Produto Produto(PessoaJuridica pessoaJuridica){
        System.out.println("Digite o nome do produto: ");
        read.nextLine();
        String nomeProduto = read.nextLine();

        System.out.println("Digite o valor unitário do produto: ");
        double valorUnitario = read.nextDouble();

        System.out.println("Digite a quantidade de produto");
        int quantidadeDeProduto = read.nextInt();

        return new Produto(pessoaJuridica, nomeProduto, valorUnitario, quantidadeDeProduto);

    }
}
