package com.dlmv.dates;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Date {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;


        //----------------------------------Operações básicas----------------------------------------------//
        LocalDate dataLocalSistema = LocalDate.now();
        LocalDateTime dataHoraLocalSistema = LocalDateTime.now();
        Instant dataHoraGMT = Instant.now();

        System.out.println("Data do sistema: " + dataLocalSistema);
        System.out.println("Data + hora do sistema: " + dataHoraLocalSistema);
        System.out.println("Data + hora no fuso GMT: " + dataHoraGMT);


        //---------------------------------Passando texto pra data/hora------------------------------------//
        System.out.println();
        LocalDate dataString = LocalDate.parse("2022-05-21");
        LocalDateTime dataHoraString = LocalDateTime.parse("2022-05-21T15:15:00");
        Instant dataHoraGMTString = Instant.parse("2022-05-21T15:15:00Z");
        Instant dataHoraBrZoneString = Instant.parse("2022-05-21T15:15:00-03:00");

        System.out.println("Data parse: " + dataString);
        System.out.println("Data + hora parse: " + dataHoraString);
        System.out.println("Data + hora GMT parse: " + dataHoraGMTString);
        System.out.println("Data + hora Br parse: " + dataHoraBrZoneString);


        //-----------------------------Instanciando data e hora formatada----------------------------------//
        System.out.println();
        LocalDate dataFormatada = LocalDate.parse("21/05/2022", fmt);
        LocalDate dataHoraFormatada = LocalDate.parse("21/05/2022 15:15", fmt2);
        System.out.println("Data parse formatada: " + dataFormatada);
        System.out.println("Data + hora parse formatada: " + dataHoraFormatada);


        //---------------------------Outra forma de instanciar data e hora--------------------------------//
        System.out.println();
        LocalDate data = LocalDate.of(2022,5,21);
        LocalDateTime dataHora = LocalDateTime.of(2022,5,21,15,15, 0);
        System.out.println("Data.of: " + data);
        System.out.println("DataHora.of: " + dataHora);


        //---------------------------Formatando data e hora já instanciada--------------------------------//
        System.out.println();
        System.out.println("Data parse formatada: " + dataString.format(fmt));
        System.out.println("Data parse formatada: " + fmt.format(dataString));
        System.out.println("Data + hora parse formatada: " + dataHoraString.format(fmt));
        System.out.println("Data + hora parse formatada: " + dataHoraString.format(fmt2));
        System.out.println("Data + hora GMt formatada: " + fmt3.format(dataHoraGMTString));
        System.out.println("" + fmt5.format(dataHoraGMTString));
        System.out.println("" + dataHoraGMTString.toString()); //toString() sempre implícito


        //----------------------------Converter data e hora global para local----------------------------//
        /*
        for (String s : ZoneId.getAvailableZoneIds()) //Time zones disponivéis
        {
            System.out.println(s);
        }
        */
        System.out.println();
        Instant novaDataHora = Instant.parse("2022-05-21T01:15:00Z");
        LocalDate novaDataHoraLocal1 = LocalDate.ofInstant(novaDataHora, ZoneId.systemDefault());
        LocalDate novaDataHoraLocal2 = LocalDate.ofInstant(novaDataHora, ZoneId.of("Portugal"));
        LocalDateTime novaDataHoraLocal3 = LocalDateTime.ofInstant(novaDataHora, ZoneId.of("Portugal"));
        System.out.println("Data/Hora Local 1: " + novaDataHoraLocal1);
        System.out.println("Data/Hora Local 2: " + novaDataHoraLocal2);
        System.out.println("Data/Hora Local 3: " + novaDataHoraLocal3);
        System.out.println("Dia do mês Local 3: " + novaDataHoraLocal3.getDayOfMonth());
        System.out.println("Hora do Local 3: " + novaDataHoraLocal3.getHour());


        //------------------------------------------Calculos com datas------------------------------------//
        System.out.println();
        LocalDate pastWeekLocalDate1 = dataString.minusWeeks(1);
        LocalDate pastWeekLocalDate2 = dataString.minusDays(7);
        LocalDate nextWeekLocalDate1 = dataString.plusDays(31);
        LocalDate nextWeekLocalDate2 = dataString.plusMonths(1);

        System.out.println("Data a ser manipulada: " + dataString);
        System.out.println("Data/Hora a ser manipulada: " + dataHoraString);
        System.out.println("Menos uma semana: " + pastWeekLocalDate1);
        System.out.println("Menos sete dias: " + pastWeekLocalDate2);
        System.out.println("Mais trinta e um dias: " + nextWeekLocalDate1);
        System.out.println("Mais um mês: " + nextWeekLocalDate2);


        LocalDateTime pastWeekLocalDateTime = dataHoraString.minusWeeks(1);
        LocalDateTime nexttWeekLocalDateTime = dataHoraString.plusWeeks(1);

        System.out.println("Menos uma semana: " + pastWeekLocalDateTime);
        System.out.println("Mais uma semana: " + nexttWeekLocalDateTime);

        Instant pastWeekInstant = dataHoraGMTString.minus(7, ChronoUnit.DAYS);
        Instant nexttWeekInstant = dataHoraGMTString.plus(7,ChronoUnit.DAYS);

        System.out.println("Menos uma semana: " + pastWeekInstant);
        System.out.println("Mais uma semana: " + nexttWeekInstant);

        //---------------------------------------Calculos de duração------------------------------------//
        System.out.println();
        Duration d1 = Duration.between(pastWeekInstant, nexttWeekInstant);
        Duration d2 = Duration.between(pastWeekLocalDate1.atTime(0,0), nextWeekLocalDate1.atTime(0,0));
        Duration d3 = Duration.between(pastWeekLocalDate1.atStartOfDay(), nextWeekLocalDate1.atStartOfDay());
        System.out.println("d1: " + d1.toDays());
        System.out.println("d2: " + d2.toDays());
        System.out.println("d3: " + d3.toDays());

    }
}
