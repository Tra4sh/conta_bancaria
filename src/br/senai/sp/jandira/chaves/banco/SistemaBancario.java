package br.senai.sp.jandira.chaves.banco;

import br.senai.sp.jandira.chaves.banco.model.Agencia;
import br.senai.sp.jandira.chaves.banco.model.Cliente;
import br.senai.sp.jandira.chaves.banco.model.Conta;
import br.senai.sp.jandira.chaves.banco.model.TipoConta;

public class SistemaBancario {
    public static void main(String[] args) {

       Cliente cliente01 = new Cliente();
       cliente01.setNome("Carlos Aberto");
       cliente01.setTelefone("(11)9874-55555");
       cliente01.setCpf("123.456.789-99");

       Agencia agencia01 = new Agencia();
       agencia01.setNumero("1234-01");
       agencia01.setEndereço("Av. Brasil, 500 - Jandira/SP");
       agencia01.setGerente("Silvio Santos");

        Conta conta01 = new Conta();
        conta01.setCliente(cliente01);
        conta01.setAgencia(agencia01);
        conta01.setNumero("456-01");
        conta01.depositar(100);
        conta01.setTipoConta(TipoConta.CORRENTE);

        // SACAR 100 REIS DA CONTA01
        conta01.sacar(80);

        //MOSTRAR SALDO DA CONTA01
        System.out.println(conta01.getSaldo());

        //DEPOSITAR 50REAIS NA CONTA01
        conta01.depositar(50);

        //MOSTRAR SALDO DA CONTA01
        System.out.println(conta01.getSaldo());

    }
}
