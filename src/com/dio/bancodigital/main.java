package com.dio.bancodigital;

public class main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("tst");

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cc.depositar(100);
        cc.transferir(80, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
