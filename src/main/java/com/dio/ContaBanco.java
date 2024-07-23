package com.dio;

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
    
        
        Scanner scan = new Scanner(System.in);
        var dadosConta = new ContaTerminal();
        
        System.out.println("Por favor digite o nome do cliente");
        dadosConta.setNomeCliente(scan.nextLine());

        System.out.println("Por favor digite o numero da conta");
        dadosConta.setNumero(scan.nextInt());

        System.out.println("Por favor digite a agencia");
        dadosConta.setAgencia(scan.nextInt());
        
        System.out.println("Por favor digite seu saldo");
        dadosConta.setSaldo(scan.nextDouble());

        System.out.println("olá " + dadosConta.getNomeCliente());
        System.out.println("obrigado por criar uma conta em nosso banco, sua agência é " + dadosConta.getAgencia() + " e sua conta " + dadosConta.getNumero());
        System.out.println("e seu saldo " + dadosConta.getSaldo() + " já está disponível para saque \".");
    }
}