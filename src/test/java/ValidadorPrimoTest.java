import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorPrimoTest{
    
    @Test
    public void dosDebeSerPrimo(){
        assertTrue(ValidadorPrimo.esPrimo(2));
    }

    @Test
    public void unoNoDebeSerPrimo(){
        assertFalse(ValidadorPrimo.esPrimo(1));
    }

    @Test
    public void cuatroNoDebeSerPrimo(){
        assertFalse(ValidadorPrimo.esPrimo(4));
    }

    @Test
    public void nueveNoDebeSerPrimo(){
        assertFalse(ValidadorPrimo.esPrimo(9));
    }
}