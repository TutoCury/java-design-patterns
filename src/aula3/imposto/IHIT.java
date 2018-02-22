package aula3.imposto;

import aula3.Item;
import aula3.Orcamento;
import java.util.List;
import java.util.stream.Collectors;

public class IHIT extends TemplateDeImpostoCondicional {

    private boolean existemDoisItensComMesmoNome(List<Item> itens) {
        List<String> nomes = itens.stream().map(Item::getNome).collect(Collectors.toList());
        for (Item item : itens) {
            if (nomes.stream().filter(n -> n.equals(item.getNome())).count() >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected boolean atendeCondicao(Orcamento orcamento) {
        return existemDoisItensComMesmoNome(orcamento.getItens());
    }

    @Override
    protected double valorCondicaoVerdadeira(Orcamento orcamento) {
        return orcamento.getValor() * 0.13 + 100;
    }

    @Override
    protected double valorCondicaoFalsa(Orcamento orcamento) {
        return orcamento.getValor() * 0.01 * orcamento.getItens().size();
    }

}
