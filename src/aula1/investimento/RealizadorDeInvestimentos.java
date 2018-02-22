package aula1.investimento;

import aula1.Conta;

public class RealizadorDeInvestimentos {

    public void realiza(Conta conta, Investimento investimento) {
        conta.deposita(investimento.calcula(conta) * 0.75);
        System.out.println("Novo saldo: " + conta.getSaldo());
    }

}
