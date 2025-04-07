package RetosAbril;

public class Reto2 {

//    Reto 2 abril - Calendario
//            Enunciado
//    Tu misión es simple, soldado: crear un calendario que muestre todos los meses del año y
//    sus semanas de forma clara y organizada. Nada de efectos especiales ni complicaciones innecesarias,
//    solo un buen código que haga el trabajo. Crea un programa que:
//
//    Itere los meses del año
//    Itere las semanas del mes
//    PISTA: Bucle for anidad.
//            Ejemplo
//    Enero Semana 1 Semana 2 Semana 3 …

    public static void main(String[] args) {
        String[] meses  = new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre" };

        for (int i = 0; i < meses.length; i++){

            int dias = 0;

            if (i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11){
                dias = 31;
            } else if (i == 3 || i == 5 || i == 8 || i == 10) {

                dias = 30;

            }else {

                dias = 28;

            }
            System.out.println(meses[i]);
            for(int j = 1; j <= dias; j++){
                System.out.println(j + "\t");
                if (j % 7 == 0){
                    System.out.println();
                }
                System.out.println("\n\n");
            }
        }

    }


}
