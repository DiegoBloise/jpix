package com.dbl;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Jix("Nome", "chavepix", "1.00", "Sao Paulo", "NomeLoja").gerarPayload());
        // CPF: 44455566699
        // CEL: +5511977778888
        // EMAIL: email.exemplo@email.com
    }
}