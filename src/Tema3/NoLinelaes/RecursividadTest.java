
package Tema3.NoLinelaes;

/**
 *
 * @author vanesahonorato
 */
public class RecursividadTest {
    public static void main(String[] args) {


        long starTime = System.nanoTime();
        System.out.println(Recursividad.powerBad(3, 10));
        long endTime = System.nanoTime();
        System.out.println((endTime - starTime) / 1e6 + "ms");
        
        starTime = System.nanoTime();
        System.out.println(Recursividad.powerGood(3, 10));
         endTime = System.nanoTime();
        System.out.println((endTime - starTime) / 1e6 + "ms");

    }
}
