import at.campus02.iwi.swe.Hello;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void sayHello() throws Exception {
        assertEquals("wrong greeting","Hello World",new Hello().sayHello());
    }

}