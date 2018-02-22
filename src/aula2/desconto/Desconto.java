package aula2.desconto;

import aula2.Orcamento;

public interface Desconto {

    double desconta(Orcamento orcamento);

    void setProximo(Desconto proximo);

}
