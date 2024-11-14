package miPrincipal;

public class Principal {
    

    public static void main(String[] args) {
        try{
            //instanciamos la clase Aplicacion
            Aplicacion app = new Aplicacion();
            //intentamos el login
            Usuario u = app.login("juan", "juan123sito");
            //mostramos el resultado
            System.out.println(u);
        }
        catch(Exception ex){
            //ocurrio un error
            System.out.print("Servicio temporalmente interrumpido:");
            System.out.println(ex.getMessage());
        }
        
    }
}