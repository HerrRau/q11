public abstract class Model {
    
    View view;
    
    public Model() {
    }
    
    public void viewSetzen(View neuerView) {
        this.view = neuerView;
    }
    
//     public void nachrichtAnView(char c) {
//         if (view !=null) {
//             view.nachrichtEmpfangen(c);
//         }
//         else {
//             System.out.println("Fehler: Noch kein View verbunden.");
//         }
//     }
    

}
