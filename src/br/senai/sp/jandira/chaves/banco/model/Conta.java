package br.senai.sp.jandira.chaves.banco.model;

public class Conta {
    private Agencia agencia;
    private String numero;
    private double saldo;
    private Cliente cliente;
    private TipoConta tipoConta;

    public Agencia getAgencia() {
        return agencia;
    } public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public TipoConta getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }
    public void sacar(double valor){
        if (saldo > valor){
            saldo = saldo - valor;
            System.out.println("SAQUE REALIZADO COM SUCESSO...");
        } else{
            System.out.println("SALDO INSUFICIENTE...");
        }
    }
    public void depositar(double valor){
       if(valor > 0){
        saldo = saldo + valor;
           System.out.println("DEPÓSITO REALIZADO COM SUCESSO!");
       } else {
           System.out.println("VALOR INFOMADO INCORRETO...");
       }
    }
}
