public class Main
{
    Controller controller;
    View view;
    Model model;

    public Main() {
        
       
//         model = new XXX();
//         view = new YYY();
//         controller = new ZZZ();
        
        model.viewSetzen(view);
        controller.viewSetzen(view);
        controller.modelSetzen(model);
        view.controllerSetzen(controller);
    }

    Controller controllerGeben() {
        return controller;
    }
    Model modelGeben() {
        return model;
    }
    View viewGeben() {
        return view;
    }

    public static void main(String[] args) {
        Main starter = new Main();
    }

}
