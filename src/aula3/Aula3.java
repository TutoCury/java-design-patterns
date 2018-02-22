package aula3;

import aula3.imposto.*;

public class Aula3 {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(550);
        orcamento.adicionaItem(new Item("Teste", 500));
        orcamento.adicionaItem(new Item("Teste", 50));
        
        System.out.println("Valor ICPP: " + new ICPP().calcula(orcamento));
        System.out.println("Valor IKCV: " + new IKCV().calcula(orcamento));
        System.out.println("Valor IHIT: " + new IHIT().calcula(orcamento));
    }
}
