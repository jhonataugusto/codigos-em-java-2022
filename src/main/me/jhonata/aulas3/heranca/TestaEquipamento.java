package main.me.jhonata.aulas3.heranca;

public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento("ACER", "L20");
        Computador computador = new Computador("ASUS", "L2080", 8, "RTX 2050 TI");

        System.out.println(equipamento.toString());
        System.out.println(computador.toString());

    }
}
