package aula2.resposta;

import aula2.Conta;
import aula2.Formato;
import aula2.Requisicao;

public class RespostaPorcento implements Resposta {

    private Resposta proxima;

    public RespostaPorcento(Resposta proxima) {
        this.proxima = proxima;
    }

    @Override
    public void responde(Requisicao req, Conta conta) {
        if (Formato.PORCENTO.equals(req.getFormato())) {
            System.out.println(conta.getTitular() + "%" + conta.getSaldo());
        } else if (proxima != null) {
            proxima.responde(req, conta);
        }
    }

}
