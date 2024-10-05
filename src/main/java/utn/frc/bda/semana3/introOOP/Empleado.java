package utn.frc.bda.semana3.introOOP;

public class Empleado extends Persona{
    private double salario;

    public Empleado(String nombre, String apellido, double salario) {
        super(nombre, apellido);
        this.salario = salario;

    }

    @Override
    public String toString() {
        //return apellido + ", " + nombre + "(" + salario + ")";

        return String.format("%s, %s (%.2f)",apellido, nombre, salario);
    }

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Jose", "Silva", 1500);
        System.out.println(empleado);
    }
}
