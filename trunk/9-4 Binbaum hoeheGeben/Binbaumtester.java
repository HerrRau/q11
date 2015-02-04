public class Binbaumtester {
    // Attribute
    Binbaum b;
    
    // Konstruktoren
    public Binbaumtester() {
    }

    // Methoden
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
        
        System.out.println(b.hoeheGeben());
    }

}

 
