public class Main{

    View view;
    Controller controller;
    Model model;
    

    //Konstruktor
    Main(){
        start();
    }

    //Methoden
    void start(){
        this.controller = new MyController();
        this.view = new Adressbuch_GUI("title");
        this.model = new UnterKlasseModel();
        
        controller.modelSetzen(model);
        controller.viewSetzen(view);
        model.viewSetzen(view);
        view.controllerSetzen(controller);
        
    }


}