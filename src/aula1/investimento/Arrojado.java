package aula1.investimento;

import aula1.Conta;
import java.util.Random;

public class Arrojado implements Investimento {

    @Override
    public double calcula(Conta conta) {
        if (new Random().nextBoolean()) {
            return conta.getSaldo() * 0.006;
        } else {
            if (new java.util.Random().nextDouble() > 0.30) {
                return conta.getSaldo() * 0.03;
            } else {
                return conta.getSaldo() * 0.05;
            }
        }
    }

}
