public class Textview implements View
{
    Controller controller;
    
    public void controllerSetzen(Controller neuerController) {
        controller = neuerController;
    }
    
    public void nachrichtEmpfangen(char c) {
        System.out.println("View hat empfangen: "+c);
    }

    public void kommentarAnzeigen(String nachrichtentext) {
        System.out.println("View zeigt an: "+nachrichtentext);
    }
    
}
