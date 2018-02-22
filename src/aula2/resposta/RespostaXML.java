package aula2.resposta;

import aula2.Conta;
import aula2.Formato;
import aula2.Requisicao;

public class RespostaXML implements Resposta {

    private Resposta proxima;

    public RespostaXML(Resposta proxima) {
        this.proxima = proxima;
    }

    @Override
    public void responde(Requisicao req, Conta conta) {
        if (Formato.XML.equals(req.getFormato())) {
            System.out.println("<conta><titular>" + conta.getTitular()
                    + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>");
        } else if (proxima != null) {
            proxima.responde(req, conta);
        }
    }

}
