
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BinbaumTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BinbaumTest
{
    /**
     * Default constructor for test class BinbaumTest
     */
    public BinbaumTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void einfuegenLeer()
    {
        Binbaum binbaum1 = new Binbaum();
        Woerterbucheintrag woerterb1 = new Woerterbucheintrag("piano", "Klavier");
        binbaum1.einfuegen(woerterb1);
        Knoten k = (Knoten)  binbaum1.wurzel;
        Datenelement d = k.daten;
        Woerterbucheintrag w = (Woerterbucheintrag) d;
        assertEquals("Klavier", w.bedeutungGeben());
    }

    @Test
    public void einfuegenVoll()
    {
        Binbaum binbaum1 = new Binbaum();
        Woerterbucheintrag woerterb1 = new Woerterbucheintrag("piano", "Klavier");
        Woerterbucheintrag woerterb2 = new Woerterbucheintrag("violin", "Geige");
        Woerterbucheintrag woerterb3 = new Woerterbucheintrag("harmonica", "Mundharmonika");
        binbaum1.einfuegen(woerterb1);
        binbaum1.einfuegen(woerterb2);
        binbaum1.einfuegen(woerterb3);
        Knoten k1 = (Knoten)  binbaum1.wurzel;
        Knoten k2 = (Knoten)  k1.rechterNachfolger;
        Knoten k3 = (Knoten)  k1.linkerNachfolger;
        Datenelement d1 = k1.daten;
        Datenelement d2 = k2.daten;
        Datenelement d3 = k3.daten;
        Woerterbucheintrag w1 = (Woerterbucheintrag) d1;
        Woerterbucheintrag w2 = (Woerterbucheintrag) d2;
        Woerterbucheintrag w3 = (Woerterbucheintrag) d3;
        assertEquals("Klavier", w1.bedeutungGeben());
        assertEquals("Geige", w2.bedeutungGeben());
        assertEquals("Mundharmonika", w3.bedeutungGeben());
    }

    @Test
    public void suchenLeer()
    {
        Binbaum binbaum1 = new Binbaum();
        assertEquals(null, binbaum1.suchen("kangaroo"));
    }
    @Test
    public void suchenVollErfolglos()
    {
        Binbaum binbaum1 = new Binbaum();
        Woerterbucheintrag woerterb1 = new Woerterbucheintrag("piano", "Klavier");
        Woerterbucheintrag woerterb2 = new Woerterbucheintrag("violin", "Geige");
        Woerterbucheintrag woerterb3 = new Woerterbucheintrag("harmonica", "Mundharmonika");
        binbaum1.einfuegen(woerterb1);
        binbaum1.einfuegen(woerterb2);
        binbaum1.einfuegen(woerterb3);
        assertEquals(null, binbaum1.suchen("kangaroo"));
    }
    @Test
    public void suchenVollErfolgreich()
    {
        Binbaum binbaum1 = new Binbaum();
        Woerterbucheintrag woerterb1 = new Woerterbucheintrag("piano", "Klavier");
        Woerterbucheintrag woerterb2 = new Woerterbucheintrag("violin", "Geige");
        Woerterbucheintrag woerterb3 = new Woerterbucheintrag("harmonica", "Mundharmonika");
        binbaum1.einfuegen(woerterb1);
        binbaum1.einfuegen(woerterb2);
        binbaum1.einfuegen(woerterb3);
        String s1 = ((Woerterbucheintrag)binbaum1.suchen("piano")).bedeutungGeben();
        String s2 = ((Woerterbucheintrag)binbaum1.suchen("violin")).bedeutungGeben();
        String s3 = ((Woerterbucheintrag)binbaum1.suchen("harmonica")).bedeutungGeben();
        assertEquals("Klavier", s1);
        assertEquals("Geige", s2);
        assertEquals("Mundharmonika", s3);
    }


    
}

