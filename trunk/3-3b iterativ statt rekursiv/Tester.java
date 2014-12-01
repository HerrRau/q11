

/**
 * The test class Tester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Tester extends junit.framework.TestCase
{
	private Patient patient1;
	private Patient patient2;
	private Patient patient3;
	private Liste liste1;

    /**
     * Default constructor for test class Tester
     */
    public Tester()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
		patient1 = new Patient("Erster");
		patient2 = new Patient("Zweiter");
		patient3 = new Patient("Dritter");
		liste1 = new Liste();
	}

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }

	public void testInformation()
	{
		liste1.vorneEinfuegen(patient1);
		liste1.vorneEinfuegen(patient2);
		liste1.vorneEinfuegen(patient3);
		liste1.informationAusgeben();
	}
}

