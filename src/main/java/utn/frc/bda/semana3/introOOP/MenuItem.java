package utn.frc.bda.semana3.introOOP;

import utn.frc.bda.semana2.Figuras;
import utn.frc.bda.semana2.NPrimos;

public class MenuItem implements MenuCall{
    private int opcion;
    private String nombreItem;

    public MenuItem(int opcion, String nombreItem) {
        this.opcion = opcion;
        this.nombreItem = nombreItem;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    @Override
    public void ejecutar() {
        System.out.println(nombreItem);
        switch (opcion){
            case 1:
                //MultiplosEnVector.run();
                break;
            case 2:
                NPrimos.run();
                break;
            case 3:
                Figuras.run();
                break;
            case 4:
                //ISBN.run();
                break;
            case 5:
                break;
            default:
                System.out.println("Opcion Incorrecta.");
                break;

        }
    }
}
