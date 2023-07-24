package views;

import models.PessoaFisica;
import models.PessoaJuridica;
import models.Produto;
import services.GerenciamentoDeVendas;

import java.util.Scanner;

public class MainRunner {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        GerenciamentoDeVendas gerenciador = new GerenciamentoDeVendas();
        ClienteView views = new ClienteView();


        System.out.println("Quantos clientes deseja cadastrar? ");
        int totalDeClientes = read.nextInt();

        PessoaFisica[] clienteFisico = new PessoaFisica[totalDeClientes];
        PessoaJuridica[] clienteJuridico = new PessoaJuridica[totalDeClientes];
        Produto[] produto = new Produto[totalDeClientes];
        int decisao;
        int i = 0;

        do {
            System.out.println("Voce é uma pessoa física ou jurídica? ");
            read.nextLine();
            String pessoa = read.nextLine().toLowerCase();

            if (pessoa.equals("fisica")) {
                clienteFisico[i] = views.InicioFisico();
                produto[i] = views.Produto(clienteFisico[i]);
                gerenciador.produtosVendidos(produto[i]);


            } else if(pessoa.equals("juridica")){
                clienteJuridico[i] = views.InicioJuridico();
                produto[i] = views.Produto(clienteJuridico[i]);
                gerenciador.produtosVendidos(produto[i]);


            }
            else{
                System.out.println("Opção inválida!");
            }

            i++;
            System.out.println("""
                    Deseja sair?
                    1. Sim
                    2. Não""");
            decisao = read.nextInt();
        } while (decisao != 1);

        gerenciador.relatorio();

    }
}
