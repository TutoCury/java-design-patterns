package aula1;

import aula1.imposto.ISS;
import aula1.imposto.ICCC;
import aula1.imposto.ICMS;
import aula1.imposto.CalculadorDeImpostos;
import java.util.Random;

public class Aula1 {

    public static void main(String[] args) {
        System.out.println("Random: " + new Random().nextDouble());
        System.out.println("Random: " + new Random().nextBoolean());
        
        Orcamento orcamento = new Orcamento(2000);

        CalculadorDeImpostos calculadora = new CalculadorDeImpostos();
        calculadora.calcula(orcamento, new ISS());
        calculadora.calcula(orcamento, new ICMS());
        calculadora.calcula(orcamento, new ICCC());
    }

}
