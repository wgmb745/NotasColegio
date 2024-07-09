package presentacion;

import entidad.Alumno;

public class App_pruebaMetodos {
    public static void main(String[] args) {
        double[] notas = {4,3,3,4,5};
        Alumno alumno1 = new Alumno("Wil","Perez","Calle 100",6,notas,"1 bachillerato");
        System.out.println("la peor nota " + alumno1.notaMenor());
        System.out.println("la mejor nota " + alumno1.notaMayor());
        System.out.println("la mejor nota " + alumno1.promedioNotas());
        alumno1.evaluarSituacionAcademica();
    }
}
