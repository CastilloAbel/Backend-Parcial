package utn.frc.bda.semana2;

import utn.frc.bda.util.MathUtil;

public  class NPrimos
{
    private static void firstNPrimes(int n) {
        if (n < 1) {
            return;
        }

        int c = 0;
        int p = 1;

        while (c < n) {
            if (MathUtil.isPrime(p)) {
                System.out.println(p + " es primo");
                c++;
            }
            p++;
        }
    }
    public static void run(){
        firstNPrimes(100);

    }
}
