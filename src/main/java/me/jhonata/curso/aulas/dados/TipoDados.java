package main.java.me.jhonata.curso.aulas.dados;

public class TipoDados {
    public static void main(String[] args) {

        // ======================= NUMEROS INTEIROS


        //tipos primários (tipos comuns em JAVA)
        long h = 6516515164L;
        int x = 4;
        short y = 4; //inteiro (menor capacidade de memória)
        byte t = 4; //numero mais pequeno ainda

        //tipos não primários (dados que representam os dados primários (com mais funcionalidades na orientação a objetos) )
        Long h2 = 6516546L;
        Integer x2 = 98;
        Short y2 = 7;
        Byte t2 = 4;


        // ======================= NUMEROS REAIS

        double z = 23.4; // tipo de dado padrão no java que usamos para representar os números reais
        float k = 23.4f; // por padrão, os  números reais em java são considerados double (e o double ocupa menos espaço do que o float)


        //tipos não primários
        Double z2 = 23.4;
        Float k2 = 23.4f;

        System.out.println(Integer.SIZE);
        System.out.println(Short.SIZE);
        System.out.println(Byte.SIZE);

        System.out.println("");


        //vamos utilizar os tipos não primitivos para realizar conversões!


    }
}
