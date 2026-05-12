public class ValidadorPrimo{
    public static boolean esPrimo(int numero){
        
        if (numero <= 1) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= numero; divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}