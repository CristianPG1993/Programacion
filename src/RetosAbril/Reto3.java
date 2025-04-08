package RetosAbril;

import java.time.*;
import java.time.temporal.ChronoUnit;


public class Reto3 {

//    Crear dos variables utilizando los objetos fecha
//    En la primera se representa la fecha (día, mes, año) actual.
//    En la segunda se representa la fecha de nacimiento.
//
//    Calcular cuántos años han transcurrido entre ambas fechas y muestra su resultado de maneras diferentes
//    Día, mes y año.
//    Hora, minuto y segundo.
//    Día de año.
//    Día de la semana.
//    Nombre del mes.
//
//    Pistas: buscar sobre el paquete java.time para para fechas y horas.


    public static void main(String[] args) {


        // Fecha actual (día, mes, año)
        LocalDate fechaActual = LocalDate.now();

        // Fecha de nacimiento (cambia si quieres la tuya)
        LocalDate fechaNacimiento = LocalDate.of(1993, 11, 4);

        // Cálculo de diferencias entre ambas fechas

        // Años, meses, días
        long years = ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
        long months = ChronoUnit.MONTHS.between(fechaNacimiento, fechaActual);
        long days = ChronoUnit.DAYS.between(fechaNacimiento, fechaActual);

        // También podríamos calcular minutos, segundos o semanas
        long minutes = ChronoUnit.MINUTES.between(fechaNacimiento.atStartOfDay(), fechaActual.atStartOfDay());
        long seconds = ChronoUnit.SECONDS.between(fechaNacimiento.atStartOfDay(), fechaActual.atStartOfDay());
        long weeks = ChronoUnit.WEEKS.between(fechaNacimiento, fechaActual);

        // Día de la semana
        DayOfWeek diaSemana = fechaNacimiento.getDayOfWeek();

        // Nombre del mes
        Month mes = fechaNacimiento.getMonth();

        // Día del año
        int diaDelAnio = fechaNacimiento.getDayOfYear();

        // Mostramos resultados
        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("----------------------------------------");
        System.out.println("Han pasado:");
        System.out.println("Años: " + years);
        System.out.println("Meses (totales): " + months);
        System.out.println("Días (totales): " + days);
        System.out.println("Semanas: " + weeks);
        System.out.println("Minutos: " + minutes);
        System.out.println("Segundos: " + seconds);
        System.out.println("----------------------------------------");
        System.out.println("Día de la semana de nacimiento: " + diaSemana);
        System.out.println("Mes de nacimiento: " + mes);
        System.out.println("Día del año de nacimiento: " + diaDelAnio);
    }

}
