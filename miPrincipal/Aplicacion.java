package miPrincipal;

import java.io.FileInputStream;
import java.util.Properties;


public class Aplicacion {
    public Usuario login(String usrname, String password)
    {
        try{
            //Abrimos el archivo de propiedades para lectura
            FileInputStream fis = new FileInputStream("usuario.properties");

            //cargar el archivo de propiedades en un objeto tipo Properties
            Properties p = new Properties();
            p.load(fis);

            //leemos el valor de la propiedad usrname
            String usr = p.getProperty("usrname");

            //leermos el valor de la propiedad password
            String pwd = p.getProperty("password");

            //definimos la variable de retorno
            Usuario u = null;

            //si coinciden los datos proporcionados con los leidos
            if( usr.equals(usrname) && pwd.equals(password))
            {
                //instanciamos y settear todos los datos del usuario
                u = new Usuario();
                u.setUsrName(usr);
                u.setContrasena(pwd);
                u.setNombreUsuario(p.getProperty("nombre"));
                u.setEmail(p.getProperty("email"));
                //retornamos una instancia o null si no entramos al if
               
            }
             //retornamos una instancia o null si no entramos al if
            return u;
        }
        catch( Exception ex ){
            //cualquie error "salgo por la excepcion"
            throw new RuntimeException("Erro verificando datos",ex);


        }
        
    

    }
    
}
