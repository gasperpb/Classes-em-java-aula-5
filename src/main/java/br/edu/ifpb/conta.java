package br.edu.ifpb;

public class conta {
    int numero;
    String titular;
    double saldo;

    boolean sacar(double quantia) {

        if (quantia > saldo)
            return false;
        saldo = saldo - quantia;
        return true;

    }

    boolean deposito(double quantia) {

        if (quantia < 0)
            return false;
        saldo = saldo + quantia;
        return true;

    }

}
