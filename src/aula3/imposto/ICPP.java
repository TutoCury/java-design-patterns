package aula3.imposto;

import aula3.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {

    @Override
    protected boolean atendeCondicao(Orcamento orcamento) {
        return orcamento.getValor() < 500;
    }

    @Override
    protected double valorCondicaoVerdadeira(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

    @Override
    protected double valorCondicaoFalsa(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

}
