package aula2.desconto;

import aula2.Orcamento;

public class DescontoPorMaisDe5Itens implements Desconto {

    private Desconto proximo = new SemDesconto();

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

    @Override
    public double desconta(Orcamento orcamento) {
        if (orcamento.getItens().size() > 5) {
            return orcamento.getValor() * 0.1;
        }
        return proximo.desconta(orcamento);
    }

}
