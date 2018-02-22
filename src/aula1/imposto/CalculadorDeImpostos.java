package aula1.imposto;

import aula1.Orcamento;

public class CalculadorDeImpostos {

    public void calcula(Orcamento orcamento, Imposto imposto) {
        System.out.println(imposto.calcula(orcamento));
    }

}
