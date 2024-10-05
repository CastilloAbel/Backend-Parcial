package utn.frc.bda.semana2;

import utn.frc.bda.util.MathUtil;

public class Figuras {
    public static void Figura1(String car){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(car + " ");
            }
            System.out.println(" ");
            System.out.println(" ");
        }
    }
    public static void Figura2(String car){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                if (MathUtil.isEven(i)){
                    System.out.print(car + " ");

                }
                else {
                    System.out.print(" " + car);

                }
                }
            System.out.println(" ");
            System.out.println(" ");
        }

        }
        public static void Figura3(String car){

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(car + " ");
                }
                System.out.println(" ");
                System.out.println(" ");
            }
        }
        public static void Figura4(String car){

                int a = 0;
                for (int i = 0; i < 10; i++) {
                    a++;
                    for (int j = 1; j <= a; j++) {
                        System.out.print(car + " ");
                    }
                    if(i>3){
                        a--;
                        a--;
                    }
                    System.out.println();
                }


        }
    public static void run(){
        Figura4("*");
    }
}
