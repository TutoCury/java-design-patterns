package aula2;

import aula2.desconto.DescontoPorMaisDe5Itens;
import aula2.desconto.Desconto;
import aula2.desconto.DescontoPorValorMaiorDe500;
import aula2.resposta.Resposta;
import aula2.resposta.RespostaCSV;
import aula2.resposta.RespostaPorcento;
import aula2.resposta.RespostaXML;

public class Aula2 {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(600);
        Desconto desconto = new DescontoPorMaisDe5Itens();
        desconto.setProximo(new DescontoPorValorMaiorDe500());
        System.out.println(desconto.desconta(orcamento));

        Resposta resposta = new RespostaPorcento(new RespostaCSV(new RespostaXML(null)));
        Conta conta = new Conta("Luizinho", 3000);
        Requisicao req = new Requisicao(Formato.XML);
        resposta.responde(req, conta);
    }

}
