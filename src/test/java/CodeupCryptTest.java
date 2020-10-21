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



}