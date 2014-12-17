

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
        patient1 = new Patient("Patient 1");
        patient2 = new Patient("Patient 2");
        patient3 = new Patient("Patient 3");
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

    public void testInformationAusgeben()
    {
        System.out.println("*****************");
        System.out.println("Test Informationsausgabe");
        liste1.vorneEinfuegen(patient3);
        liste1.vorneEinfuegen(patient2);
        liste1.vorneEinfuegen(patient1);
        liste1.informationAusgeben();
    }

    public void testVorneEinfuegenVolleListe()
    {
        System.out.println("---------------");
        System.out.println("Test Einfuegen am Anfang (volle Liste)");
        liste1.vorneEinfuegen(patient3);
        liste1.vorneEinfuegen(patient2);
        liste1.vorneEinfuegen(patient1);
        liste1.informationAusgeben();
        Patient p = (Patient) liste1.anfangEntfernen();
        assertEquals("Patient 1", p.name);
    }

    public void testVorneEinfuegenLeereListe()
    {
        System.out.println("---------------");
        System.out.println("Test Einfuegen am Anfang (leere Liste)");
        liste1.vorneEinfuegen(patient1);
        liste1.informationAusgeben();
        assertEquals(1, liste1.laengeGeben());
    }

    public void testLaengeGebenVoll()
    {
        System.out.println("---------------");
        System.out.println("Test Laengenberechnung (voll)");
        liste1.vorneEinfuegen(patient3);
        liste1.vorneEinfuegen(patient2);
        liste1.vorneEinfuegen(patient1);
        liste1.informationAusgeben();
        System.out.println(liste1.laengeGeben());
        assertEquals(3, liste1.laengeGeben());
    }

    public void testLaengeGebenLeer()
    {
        System.out.println("---------------");
        System.out.println("Test Laengenberechnung (leer)");
        System.out.println(liste1.laengeGeben());
        assertEquals(0, liste1.laengeGeben());
    }

    public void testSuchenLeer()
    {
        System.out.println("---------------");
        System.out.println("Test Suchen (leer)");
        assertEquals(null, liste1.suchen("Max"));
    }
    
    public void testSuchenVoll()
    {
        System.out.println("---------------");
        System.out.println("Test Suchen (voll)");
        liste1.vorneEinfuegen(patient3);
        liste1.vorneEinfuegen(patient2);
        liste1.vorneEinfuegen(patient1);
        Datenelement d1 = liste1.suchen("Patient 1");
        assertEquals("Patient 1", ((Patient) d1).name);
        Datenelement d2 = liste1.suchen("Patient 2");
        assertEquals("Patient 2", ((Patient) d2).name);
        Datenelement d3 = liste1.suchen("xxx");
        assertEquals(null, d3);
    }
       
    public void testEinfuegenVor() {
        System.out.println("---------------");
        System.out.println("Test Einfuegen vor einem bestimmten anderen");
        liste1.einfuegenVor(patient3,patient1);
        liste1.einfuegenVor(patient2,patient3);
        liste1.einfuegenVor(patient1,patient2);
        liste1.informationAusgeben();
        Patient p1 = (Patient) liste1.anfangEntfernen();
        Patient p2 = (Patient) liste1.anfangEntfernen();
        Patient p3 = (Patient) liste1.anfangEntfernen();
        assertEquals("Patient 1", p1.name);
        assertEquals("Patient 2", p2.name);
        assertEquals("Patient 3", p3.name);
    }
    
    public void testAnfangEntfernenLeer() {
        System.out.println("---------------");
        System.out.println("Test Anfang entfernen (leer)");
        assertEquals(null, liste1.anfangEntfernen());
    }
    
    public void testAnfangEntfernenVoll() {
        System.out.println("---------------");
        liste1.einfuegenVor(patient3,patient1);
        liste1.einfuegenVor(patient2,patient3);
        liste1.einfuegenVor(patient1,patient2);
        Datenelement d = liste1.anfangEntfernen();
        assertEquals("Patient 1", ((Patient) d).name);
        liste1.informationAusgeben();
    }
    
    public void testKnotenEntfernenLeer() {
        System.out.println("---------------");
        System.out.println("Test Knoten entfernen (leer)");
        liste1.knotenEntfernen(patient1);
        liste1.informationAusgeben();
        assertEquals(0, liste1.laengeGeben());
    }
    
    public void testKnotenEntfernenVoll() {
        System.out.println("---------------");
        System.out.println("Test Knoten entfernen (voll)");
        liste1.vorneEinfuegen(patient3);
        liste1.vorneEinfuegen(patient2);
        liste1.vorneEinfuegen(patient1);
        liste1.knotenEntfernen(patient2);
        liste1.informationAusgeben();
        Patient p1 = (Patient) liste1.anfangEntfernen();
        Patient p3 = (Patient) liste1.anfangEntfernen();
        assertEquals("Patient 1", p1.name);
        assertEquals("Patient 3", p3.name);
   }
    
    public void testSortiertEinfuegenVoll() {
        System.out.println("---------------");
        System.out.println("Test Sortiert einfuegen (voll)");
        liste1.sortiertEinfuegen(patient1);
        liste1.sortiertEinfuegen(patient3);
        liste1.sortiertEinfuegen(patient2);
        liste1.informationAusgeben();
        Patient p1 = (Patient) liste1.anfangEntfernen();
        Patient p2 = (Patient) liste1.anfangEntfernen();
        Patient p3 = (Patient) liste1.anfangEntfernen();
        assertEquals("Patient 1", p1.name);
        assertEquals("Patient 2", p2.name);
        assertEquals("Patient 3", p3.name);
    }
    
    public void testSortiertEinfuegenLeer() {
        System.out.println("---------------");
        System.out.println("Test Sortiert einfuegen (leer)");
        liste1.sortiertEinfuegen(patient1);
        liste1.informationAusgeben();
        assertEquals(1, liste1.laengeGeben());
    }

    public void testHintenEinfuegenLeereListe()
    {
        System.out.println("---------------");
        System.out.println("Test Einfuegen am Ende (leere Liste)");
        liste1.hintenEinfuegen(patient1);
        liste1.informationAusgeben();
        assertEquals(1, liste1.laengeGeben());
    }

    public void testHintenEinfuegenVolleListe()
    {
        System.out.println("---------------");
        System.out.println("Test Einfuegen am Ende (volle Liste)");
        liste1.hintenEinfuegen(patient1);
        liste1.hintenEinfuegen(patient2);
        liste1.informationAusgeben();
        assertEquals(2, liste1.laengeGeben());
        Patient p1 = (Patient) liste1.anfangEntfernen();
        Patient p2 = (Patient) liste1.anfangEntfernen();
        assertEquals("Patient 2",p2.name);
    }

    public void testEndeEntfernenLeer() {
        System.out.println("---------------");
        System.out.println("Test Ende entfernen (leer)");
        assertEquals(null, liste1.endeEntfernen());
    }
    
    public void testEndeEntfernenVoll() {
        System.out.println("---------------");
        System.out.println("Test Ende entfernen (voll)");
        liste1.einfuegenVor(patient3,patient1);
        liste1.einfuegenVor(patient2,patient3);
        liste1.einfuegenVor(patient1,patient2);
        Datenelement d = liste1.endeEntfernen();
        assertEquals("Patient 3", ((Patient) d).name);
        liste1.informationAusgeben();     
    }
        
    
}   



