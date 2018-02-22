package aula2.desconto;

import aula2.Orcamento;
import aula2.desconto.Desconto;

public class SemDesconto implements Desconto {

    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto proximo) {

    }

}
