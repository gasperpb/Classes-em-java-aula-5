package br.edu.ifpb;

public class testarApp {
    public static void main(String[] args) {
        conta obj1 = new conta();
        obj1.numero = 123;
        obj1.titular = "Pedro";
        obj1.saldo = 1200.99;

        obj1.sacar(200);
        conta obj2 = new conta();

        System.out.println("conta 1 número  " + obj1.numero);
        System.out.println("conta 1 Titular " + obj1.titular);
        System.out.println("conta 1 Titular " + obj1.saldo);

        System.out.println("conta 2 número  " + obj2.numero);
        System.out.println("conta 2 Titular " + obj2.titular);
        System.out.println("conta 2 Titular " + obj2.saldo);
    }
}
