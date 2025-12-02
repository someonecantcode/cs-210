import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Tester {
    @Test
    void testAdd1() {
        Calculator cal = new Calculator();
        int result = cal.add(1, 2);
        assertEquals(result, 3);
    }

    @Test
    void testSpecialChar() {
        SpecialChar checker = new SpecialChar();
        assertTrue(checker.special('!'));
    }

    @Test
    void testLetter() {
        SpecialChar checker = new SpecialChar();
        assertTrue(checker.special('a'));
    }

    @Test
    void testDigit() {
	SpecialChar checker = new SpecialChar();
        assertTrue(checker.special('1'));
    }

}