package entidad;

public class Alumno {

    // Atributos
    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private double[] notas;
    private String curso;

    // Métodos
    // Accesadores y mutadores
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Constructor
    public Alumno(String nombre, String apellido, String direccion, int edad, double[] notas, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.notas = notas;
        this.curso = curso;
    }

    public Alumno() {

    }

    // Métodos
    // Carlcular la peor nota del alumno

    public double notaMenor ()
    {
        double minimo = this.notas[0];

        for (int i=1; i<this.notas.length; i++)
        {
            if(notas[i]<minimo){
                minimo = notas[i];
            }
        }
        return minimo;
    }

    // Carlcular la mejor nota del alumno
    public double notaMayor ()
    {
        double mayor = this.notas[0];

        for (int i=1; i<this.notas.length; i++)
        {
            if(notas[i]>mayor){
                mayor = notas[i];
            }
        }
        return mayor;
    }

    public double promedioNotas ()
    {
        double suma = 0;

        for(double nota: notas)
        {
            suma = suma + nota;
        }
        return suma/notas.length;
    }

    public void evaluarSituacionAcademica()
    {
        if(this.promedioNotas()>=4.0){
            System.out.println("La situación academica de: " + this.getNombre() + " " + this.getApellido() + " es: Aprobado");
        }else {
            System.out.println("La situación academica de: " + this.getNombre() + " " + this.getApellido() + " es: Reprobado");
        }
    }

}
