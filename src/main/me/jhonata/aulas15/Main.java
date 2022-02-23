package main.me.jhonata.aulas15;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //como trabalhar com Datas?

        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);

        LocalDate ano_novo = LocalDate.of(2019, Month.JANUARY, 1);

        System.out.println(ano_novo);


        int ano = ano_novo.getYear();
        Month mes = ano_novo.getMonth();
        int dia = ano_novo.getDayOfMonth();

        System.out.println(mes);


        Period periodo = Period.between(hoje, ano_novo);

        System.out.println(periodo);

        System.out.println(periodo.getDays());
        System.out.println(periodo.getYears());
        System.out.println(periodo.getMonths());

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(hoje.format(formatador));


        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);
        DateTimeFormatter hora = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");

        System.out.println(agora.format(hora));


        LocalTime intervalo = LocalTime.of(9,30);
        System.out.println(intervalo);
    }

}
