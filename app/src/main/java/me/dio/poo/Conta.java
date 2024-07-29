package me.dio.poo;

class SaldoInsuficienteException extends Exception{}

public class Conta<P extends Pessoa>{
    private double saldo;
    private Pessoa pessoa;

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double quantia){
        saldo += quantia;
    }

    public void sacar(double quantia)throws SaldoInsuficienteException{
        if(saldo - quantia < 0){
            throw new SaldoInsuficienteException();
        }
        saldo -= quantia;
    }
    
    public Pessoa getPessoa(){
        return pessoa;
    }
}

