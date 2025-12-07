package labxx.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Division классын тест.
 * Hotfix v1.0.1: NaN болон Infinity тестүүд нэмсэн.
 */
public class DivisionTest {
    
    @Test
    void testDivideNormal() {
        Division calc = new Division();
        assertEquals(2.0, calc.divide(4.0, 2.0), 
            "4 / 2 нь 2-той тэнцүү байх ёстой");
    }
    
    @Test
    void testDivideByZero() {
        Division calc = new Division();
        assertThrows(IllegalArgumentException.class, 
            () -> calc.divide(4.0, 0.0), 
            "Тэгээр хуваах нь exception өгөх ёстой");
    }
    
    @Test
    void testDivideNegative() {
        Division calc = new Division();
        assertEquals(-2.0, calc.divide(-4.0, 2.0), 
            "-4 / 2 нь -2-той тэнцүү байх ёстой");
    }
    
    @Test
    void testDivideDecimals() {
        Division calc = new Division();
        assertEquals(2.5, calc.divide(5.0, 2.0), 0.0001, 
            "5 / 2 нь 2.5-тай тэнцүү байх ёстой");
    }
    
    @Test
    void testDivideWithNaN() {
        Division calc = new Division();
        assertThrows(IllegalArgumentException.class, 
            () -> calc.divide(Double.NaN, 2.0), 
            "NaN утгатай хуваах нь exception өгөх ёстой");
    }
    
    @Test
    void testDivideByNaN() {
        Division calc = new Division();
        assertThrows(IllegalArgumentException.class, 
            () -> calc.divide(4.0, Double.NaN), 
            "NaN-д хуваах нь exception өгөх ёстой");
    }
    
    @Test
    void testDivideWithInfinity() {
        Division calc = new Division();
        assertThrows(IllegalArgumentException.class, 
            () -> calc.divide(Double.POSITIVE_INFINITY, 2.0), 
            "Infinity утгатай хуваах нь exception өгөх ёстой");
    }
    
    @Test
    void testDivideByInfinity() {
        Division calc = new Division();
        assertThrows(IllegalArgumentException.class, 
            () -> calc.divide(4.0, Double.NEGATIVE_INFINITY), 
            "Infinity-д хуваах нь exception өгөх ёстой");
    }
}