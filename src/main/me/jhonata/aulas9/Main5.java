package main.me.jhonata.aulas9;

import main.me.jhonata.aulas1.Cliente;
import main.me.jhonata.aulas6.Conta;

import java.util.HashMap;
import java.util.Map;

public class Main5 {
    /**
     *
     * A classe HashMap implementa a interface Map e trabalha com chave/valor
     *  Não aceita chaves duplicadas, mas valores sim
     *
     *
     */
    public static void main(String[] args){
        Map<String, Cliente> contas = new HashMap<String,Cliente>();

        Cliente cl1 = new Cliente("jhonata","rua dom romoaldo");
        Cliente cl2 = new Cliente("josiely","rua grajauna");


        contas.put("Pessoa fisica",cl1);
        contas.put("Pessoa fisica",cl2);



    }
}
