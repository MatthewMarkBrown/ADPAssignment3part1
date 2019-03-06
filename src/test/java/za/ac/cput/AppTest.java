package za.ac.cput;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    final App a1 = new App(0);
    final App a2 = new App(0);
    /**
     * Rigorous Test :-)
     */
    @Test(timeout = 100)
    public void objectEquality()
    {
     String object = "Test";
     String object2 = "Test";
     assertEquals(object, object2);
    }

    @Test
    public void objectIdentity(){
        final App a1 = new App(0);
        final App a2 = new App(0);

        assertSame(a1, a2); // AssertionError: expected:<test2.A@7f13d6e> but was:<test2.A@51cdd8a>
    }

    @Test
    public void failingTest(){
         Game g = new Game();
         g.addThrow(5);
         assertEquals(5, g.getScore()); // AssertionError
    }

    @Test
    public void passingTest(){
        Game g = new Game();
        g.addThrow(0);
        assertEquals(0, g.getScore());
    }

    @Test
    @Ignore
    public void timeOut(){

    }








}
