import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Tester {
    static int[][] a = new int[10][10];
    static int[][] b = new int[10][10];
    // @Test
    // void testAdd1() {
    //     Calculator cal = new Calculator();
    //     int result = cal.add(1, 2);
    //     assertEquals(result, 3);
    // }

    // @Test
    // void testSpecialChar() {
    //     SpecialChar checker = new SpecialChar();
    //     assertTrue(checker.special('!'));
    // }

    // @Test
    // void testLetter() {
    //     SpecialChar checker = new SpecialChar();
    //     assertFalse(checker.special('a'));
    // }

    // @Test
    // void testDigit() {
	// SpecialChar checker = new SpecialChar();
    //     assertFalse(checker.special('1'));
    // }


    @Test
    void testalg1(){
        
        assertEqual(transposer.alg1(), new int[10][10]);
    }

    @Test
    void testAlg2(){
        assertEqual(transposer.alg2(), new int[10][10]);
    }
}