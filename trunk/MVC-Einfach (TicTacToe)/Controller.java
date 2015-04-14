public abstract class Controller  {
    
    protected Model model;
    protected View view;
    
    public Controller() {
    }
    
    public void viewSetzen(View neuerView) {
        this.view = neuerView;
    }

    public void modelSetzen(Model neuesModel) {
        this.model = neuesModel;
    }
    
    
    
    
    public void nachrichtVonViewEmpfangen(String s) {
    
    }
    
//     public void kommentarAnViewSenden(String s){
//         if (view !=null) {
//             view.kommentarAnzeigen(s);
//         }
//         else {
//             System.out.println("Fehler: Noch kein View verbunden.");
//         }
//     }

}
