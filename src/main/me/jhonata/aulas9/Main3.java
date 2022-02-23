package main.me.jhonata.aulas9;

import main.me.jhonata.aulas1.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args){
        List<Cliente> clientes = new ArrayList<Cliente>(); //melhor declaração?

        clientes.add(new Cliente("Jhonata","Rua dom romoaldo"));
        clientes.add(new Cliente("Josiely","Rua tubipanim"));
        clientes.add(new Cliente("Felicity","Rua Brasil"));

        for(Cliente cliente : clientes){
            System.out.println(cliente.toString());
        }
    }
}
