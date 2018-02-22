package aula2.desconto;

import aula2.Item;
import aula2.Orcamento;

public class DescontoPorVendaCasada implements Desconto {

    private Desconto proximo = new SemDesconto();

    @Override
    public double desconta(Orcamento orcamento) {
        if (existe("LAPIS", orcamento) && existe("CANETA", orcamento)) {
            return orcamento.getValor() * 0.05;
        }
        return proximo.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

    private boolean existe(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if (item.getNome().equals(nomeDoItem)) {
                return true;
            }
        }
        return false;
    }

}
