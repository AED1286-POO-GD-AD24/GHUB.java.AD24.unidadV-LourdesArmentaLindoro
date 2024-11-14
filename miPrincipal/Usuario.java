package miPrincipal;

public class Usuario {
    private String usrName;
    private String nombreUsuario;
    private String contrasena;
    private String email;

    public Usuario() {

    }

    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    @Override
    public String toString() {
        return "Usuario [usrName=" + usrName + ", nombreUsuario=" + nombreUsuario + ", contrasena=" + contrasena
                + ", email=" + email + "]";
    }
    

    
    
    
    
}
