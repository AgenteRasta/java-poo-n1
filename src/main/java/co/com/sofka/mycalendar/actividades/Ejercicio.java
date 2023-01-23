package co.com.sofka.mycalendar.actividades;
import co.com.sofka.mycalendar.Programable;
import java.time.LocalDate;

public class Ejercicio extends Actividad implements Programable{


    public Ejercicio(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
        if(titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no es valido");
        }

        if(fechaInicial.isAfter(fechaFinal)){
            throw new IllegalArgumentException("La fechas no coinciden");
        }
    }

    @Override
    public void agregarRepeticion(int repeticiones) {
        System.out.println("La actividad se programara para los siguientes "+repeticiones+" semanas");
    }


}
