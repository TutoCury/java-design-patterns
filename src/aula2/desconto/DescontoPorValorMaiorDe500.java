package aula2.desconto;

import aula2.Orcamento;

public class DescontoPorValorMaiorDe500 implements Desconto {

    private Desconto proximo = new SemDesconto();

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

    @Override
    public double desconta(Orcamento orcamento) {
        if (orcamento.getValor() > 500) {
            return orcamento.getValor() * 0.07;
        }
        return proximo.desconta(orcamento);
    }

}
