package aula3.imposto;

import aula3.Orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        if (atendeCondicao(orcamento)) {
            return valorCondicaoVerdadeira(orcamento);
        } else {
            return valorCondicaoFalsa(orcamento);
        }
    }

    protected abstract boolean atendeCondicao(Orcamento orcamento);

    protected abstract double valorCondicaoVerdadeira(Orcamento orcamento);

    protected abstract double valorCondicaoFalsa(Orcamento orcamento);
}
