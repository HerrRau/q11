public class Binbaumtester {
    // Attribute
    public Binbaum b;
    
    // Konstruktoren
    public Binbaumtester() {
    }

    public void testTiefe() {
        System.out.println("**************");
        Woerterbucheintrag w1 = new Woerterbucheintrag("dog", "Hund, nachtrotten, verfolgen");
        Woerterbucheintrag w2 = new Woerterbucheintrag("cat", "Katze, Schimpfwort (unter Frauen)");
        Woerterbucheintrag w3 = new Woerterbucheintrag("mouse", "Maus, Maus (Eingabegeraet)");
        Woerterbucheintrag w4 = new Woerterbucheintrag("tortoise", "Schildkroete");
        b = new Binbaum();
        b.einfuegen(w1);
        b.einfuegen(w2);
        b.einfuegen(w3);
        b.einfuegen(w4);
        b.preorderAusgeben();
        System.out.println("dog: Tiefe " + b.tiefeGeben("dog"));
        System.out.println("cat: Tiefe " + b.tiefeGeben("cat"));
        System.out.println("mouse: Tiefe " + b.tiefeGeben("mouse"));
        System.out.println("tortoise: Tiefe " + b.tiefeGeben("tortoise"));
        System.out.println("**************");
        System.out.println("zebra: Tiefe " + b.tiefeGeben("zebra"));
        System.out.println("**************");
        System.out.println("**************");
}
    
    public void testFormatiert() {
        System.out.println("**************");
        Woerterbucheintrag w1 = new Woerterbucheintrag("dog", "Hund, nachtrotten, verfolgen");
        Woerterbucheintrag w2 = new Woerterbucheintrag("cat", "Katze, Schimpfwort (unter Frauen)");
        Woerterbucheintrag w3 = new Woerterbucheintrag("mouse", "Maus, Maus (Eingabegeraet)");
        Woerterbucheintrag w4 = new Woerterbucheintrag("tortoise", "Schildkroete");
        b = new Binbaum();
        b.einfuegen(w1);
        b.einfuegen(w2);
        b.einfuegen(w3);
        b.einfuegen(w4);
        
        b.einfuegen(new Woerterbucheintrag("zebra",""));
        b.einfuegen(new Woerterbucheintrag("aardvark",""));
        b.einfuegen(new Woerterbucheintrag("gazelle",""));
        b.einfuegen(new Woerterbucheintrag("gnu",""));

        
        b.strukturAusgeben();
    }
    
    
    public void test() {
        Woerterbucheintrag w1 = new Woerterbucheintrag("dog", "Hund, nachtrotten, verfolgen");
        Woerterbucheintrag w2 = new Woerterbucheintrag("cat", "Katze, Schimpfwort (unter Frauen)");
        Woerterbucheintrag w3 = new Woerterbucheintrag("mouse", "Maus, Maus (Eingabegeraet)");
        Woerterbucheintrag w4 = new Woerterbucheintrag("dog", "Doppelter Eintrag");
        
        System.out.println("**************");
        
        b = new Binbaum();
        b.einfuegen(w1);
        b.einfuegen(w2);
        b.einfuegen(w3);
        
        
        System.out.println("Und jetzt noch ein >>dog<<");
        b.einfuegen(w4);        
        
        System.out.println("**************");
        
        System.out.println("Inorder-Ausgabe:");
        b.inorderAusgeben();
        System.out.println("**************");
        System.out.println("Preorder-Ausgabe:");
        b.preorderAusgeben();
        System.out.println("**************");
        System.out.println("Postorder-Ausgabe:");
        b.postorderAusgeben();
        System.out.println("**************");
        
    }

}

 
