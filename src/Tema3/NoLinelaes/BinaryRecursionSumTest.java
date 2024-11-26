
package Tema3.NoLinelaes;

/**
 *
 * @author vanesahonorato
 */
public class BinaryRecursionSumTest {
      public static void main(String[] args) {
        
        int[] Ejemplo1 = {1, 2, 3, 4, 5};
        System.out.println("Suma del ejemplo 1: " + BinaryRecursionSum.binarySum(Ejemplo1, 0, Ejemplo1.length - 1));

        
        int[] Ejemplo2 = {-1, 2, -3, 4, -5};
        System.out.println("Suma del ejemplo 2: " + BinaryRecursionSum.binarySum(Ejemplo2, 0, Ejemplo2.length - 1));

        
        int[] Ejemplo3 = {10, -10, 20, -20, 30};
        System.out.println("Suma del ejemplo 3: " + BinaryRecursionSum.binarySum(Ejemplo3, 0, Ejemplo3.length - 1));
    }
}
