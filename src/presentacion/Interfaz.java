package presentacion;

import entidad.Alumno;

public class Interfaz {

    public static void main(String[] args) {

        String nombre, apellido, direccion, curso;
        int edad;
        double [] notas;

        Alumno alumno = null;

        int opcion;

        do{
            System.out.println("Sistema de registro de alumnos");
            System.out.println("1. Registro de alumno");
            System.out.println("2. Peor nota del alumno");
            System.out.println("3. Mejor nota del alumno");
            System.out.println("4. Promedio de notas del alumno");
            System.out.println("5. Evaluar situación academica");
            System.out.println("6. Salir");
            opcion = Leer.datoInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingreso el nombre del alumno:");
                    nombre = Leer.dato();
                    System.out.println("Ingreso el apellido del alumno:");
                    apellido = Leer.dato();
                    System.out.println("Ingreso la direccion del alumno:");
                    direccion = Leer.dato();
                    System.out.println("Ingreso la edad del alumno:");
                    edad = Leer.datoInt();
                    System.out.println("Ingrese curso del alumno");
                    curso = Leer.dato();

                    int cantidadNotas;

                    do {
                        System.out.println("Ingrese la cantidad de notas del alumno (entre 3 y 7 notas)");
                        cantidadNotas = Leer.datoInt();
                    }while (cantidadNotas <3 || cantidadNotas >7);

                    notas = new double[cantidadNotas];

                    for(int i = 0; i<notas.length; i++){
                        do{
                            System.out.println("Ingrese nota " + (i+1) + " entre 0.0 y 5.0");
                            notas[i] = Leer.datoDouble();
                        }while (notas[i] < 0 || notas[i] > 5);
                    }

                    alumno = new Alumno(nombre,apellido,direccion,edad,notas,curso);

                    System.out.println("Se ha registrado el alumno " + alumno.getNombre() + " " + alumno.getApellido() + " correctamente");

                    break;
                case 2:
                    if(alumno == null){
                        System.out.println("No se ha registrado el alumno, por favor ingrese opción 1");
                    }else {
                        System.out.println("La peor nota de " + alumno.getNombre() + " " + alumno.getApellido() + " es: " + alumno.notaMenor());
                    }
                    break;
                case 3:
                    if(alumno == null){
                        System.out.println("No se ha registrado el alumno, por favor ingrese opción 1");
                    }else {
                        System.out.println("La mejor nota de " + alumno.getNombre() + " " + alumno.getApellido() + " es: " + alumno.notaMayor());
                    }
                    break;
                case 4:
                    if(alumno == null){
                        System.out.println("No se ha registrado el alumno, por favor ingrese opción 1");
                    }else {
                        System.out.println("El promedio de " + alumno.getNombre() + " " + alumno.getApellido() + " es: " + alumno.promedioNotas());
                    }
                    break;
                case 5:
                    if(alumno == null){
                        System.out.println("No se ha registrado el alumno, por favor ingrese opción 1");
                    }else {
                        alumno.evaluarSituacionAcademica();
                    }
                    break;
            }

        }while (opcion != 6);

    }
}
