import static org.junit.Assert.*;
import org.junit.*;

public class ConcatTest {
    @Test
    public void testConcat1(){
        assertEquals("Hello", Concat.ConcatWord("Hello", " World!"));
    }
}
