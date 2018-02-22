package aula1.investimento;

import aula1.Conta;
import java.util.Random;

public class Moderado implements Investimento {

    @Override
    public double calcula(Conta conta) {
        if (new Random().nextBoolean()) {
            return conta.getSaldo() * 0.025;
        } else {
            return conta.getSaldo() * 0.007;
        }
    }

}
