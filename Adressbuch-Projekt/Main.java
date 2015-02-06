public class Main{

    View view;
    Controller controller;
    Model model;

    //Konstruktor
    Main(){

    }

    //Methoden
    void start(){
        this.controller = new MyController();
        this.view = adressbuchGUI();
        this.model = new UnterKlasseModel();
    }

    public void controllerSetzen(Controller c) {
        this.controller = c;
    }

    public void viewSetzen(View v){
        this.view = v;
    }

    public void modelSetzen(Model m){
        this.model = m;
    }

}