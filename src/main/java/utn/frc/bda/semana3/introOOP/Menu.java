package utn.frc.bda.semana3.introOOP;

import java.util.Scanner;

public class Menu {
    private Scanner sc;
    private int op;
    public String[] opciones = {"Error", "1. Multiplos en vector", "2. Nros primos", "3. Figuras (ciclos for))", "4. ISBN", "5. Salir"};

    public String[] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    public Menu(Scanner sc, int op) {
        this.sc = sc;
        this.op = op;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public void run(){

        while (op != 5) {
            System.out.println("Ingrese una opcion:");
            System.out.println("1. Multiplos en vector");
            System.out.println("2. Nros primos");
            System.out.println("3. Figuras (ciclos for))");
            System.out.println("4. ISBN");
            System.out.println("5. Salir");

            try {
                op = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Debe ingresar un numero entero entre 1 y 5");
                op = 0;
            }
            MenuItem item = new MenuItem(op, opciones[op]);
            item.ejecutar();
        }
    }
}
