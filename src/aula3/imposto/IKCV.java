package aula3.imposto;

import aula3.Item;
import aula3.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional {

    private boolean itemTemValorMaiorQue100(Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if (item.getValor() > 100) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected boolean atendeCondicao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && itemTemValorMaiorQue100(orcamento);
    }

    @Override
    protected double valorCondicaoVerdadeira(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

    @Override
    protected double valorCondicaoFalsa(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

}
