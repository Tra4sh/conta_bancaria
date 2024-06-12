package br.senai.sp.jandira.celso.banco;

import br.senai.sp.jandira.celso.banco.model.Agencia;
import br.senai.sp.jandira.celso.banco.model.Cliente;
import br.senai.sp.jandira.celso.banco.model.Conta;
import br.senai.sp.jandira.celso.banco.model.TipoConta;

public class SistemaBancario {

    public static void main(String[] args) {

        Cliente cliente01 = new Cliente();
        cliente01.setNome("Carlos Alberto");
        cliente01.setTelefone("(11)98745-5555");
        cliente01.setCpf("123.456.789-99");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Flávia Dias");
        cliente2.setTelefone("(18)98888-8745");
        cliente2.setCpf("321.654.987-00");

        Agencia agencia01 = new Agencia();
        agencia01.setNumero("1234-01");
        agencia01.setEndereco("Av. Brasil, 500 - Jandira/SP");
        agencia01.setGerente("Silvio Santos");

        Conta conta01 = new Conta();
        conta01.setCliente(cliente01);
        conta01.setAgencia(agencia01);
        conta01.setNumero("456-01");
        conta01.depositar(30);
        conta01.setTipoConta(TipoConta.CORRENTE);

        Conta conta02 = new Conta();
        conta02.setCliente(cliente2);
        conta02.setAgencia(agencia01);
        conta02.setNumero("999-01");
        conta02.depositar(50);
        conta02.setTipoConta(TipoConta.POUPANCA);

        // SACAR 100 REIS DA CONTA01
        conta01.sacar(10);

        // MOSTRAR SALDO DA CONTA01
        // System.out.println(conta01.getSaldo());

        // DEPOSITAR 50 REAIS NA CONTA01
        conta01.depositar(50);

        // MOSTRAR SALDO DA CONTA01
        //System.out.println(conta01.getSaldo());


    }

}
