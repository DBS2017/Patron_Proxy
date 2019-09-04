

import static calculadora.Calculadora.suma;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculadoraTest {
    
  
//    @Test//Notacion -- lo que hace es marcar el metodo como prueba  .-- culaquier metodo que lleve la notacion Test era reconocido por JUNIt como prueba Unitaria
//    public void test(){
//        fail("BUUUU");
//    }
    
    @Test // reconocer como prueba
    public void testSuma(){
        int resultado  = suma(2, 3);
        int esperado = 5;
        assertEquals(esperado, resultado);
    }
}
