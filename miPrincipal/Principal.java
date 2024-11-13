package miPrincipal;

public class Principal {
    

    public static void main(String[] args) {
        //instanciamos la clase Aplicacion
        Aplicacion app = new Aplicacion();
        //intentamos el login
        Usuario u = app.login("LourdesA", "123");
        //si los datos no son correcto
        if (u==null)
        {
            System.out.println("Usuario y/o password incorrectos");
        }else{
            System.out.println("Felicidades, login exitoso");
            System.out.println("Nombre: "+u.getNombreUsuario());
            System.out.println("Email: "+u.getEmail());
        }
    }
}