package aula1.investimento;

import aula1.Conta;

public class Conservador implements Investimento {

    @Override
    public double calcula(Conta conta) {
        return conta.getSaldo() * 0.008;
    }

}
