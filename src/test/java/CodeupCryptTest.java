import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {
    @Test
    public void testIfSetterForVersionWorks(){
        assertEquals(0.0, CodeupCrypt.version, 0);
        CodeupCrypt.version = 1.0;
        assertEquals(1.0, CodeupCrypt.version, 0);
        assertNotEquals(0.0, CodeupCrypt.version, 0);
    }

    @Test
    public void testIfHashPasswordWorks(){
        assertEquals("C0d39p", CodeupCrypt.hashPassword("Codeup"));
        assertEquals("F3r", CodeupCrypt.hashPassword("Fer"));
        assertEquals("123", CodeupCrypt.hashPassword("123"));
        assertEquals("124", CodeupCrypt.hashPassword("12a"));
        assertEquals(" f3r ", CodeupCrypt.hashPassword(" fer "));
    }

    @Test
    public void testIfCheckPasswordWorks(){
        assertTrue(CodeupCrypt.checkPassword("fer", "f3r"));
        assertFalse(CodeupCrypt.checkPassword("fer", "fer"));
    }

}