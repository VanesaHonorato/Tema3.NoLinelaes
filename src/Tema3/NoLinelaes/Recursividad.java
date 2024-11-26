package Tema3.NoLinelaes;

/**
 *
 * @author vanesahonorato
 */
public class Recursividad {

    public static double powerBad(double x, int n) {
        if (n == 0) 
            return 1;
         else {
            return x * powerBad(x, n - 1);
        }
    }

    public static double powerGood(double x, int n) {

        if (n == 0) 
            return 1;
         else {
            double partial = powerGood(x, n / 2);
            double result = partial*partial;
            if (n % 2 ==1) 
            result *= x;
            return result;
        }

    }
}
