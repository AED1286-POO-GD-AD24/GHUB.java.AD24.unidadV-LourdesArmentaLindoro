package miPrincipal;

public class TestPersona {
    public static void main(String[] args) {
        /*
         * Si la excepcion lanzada es de tipo RuntimeExcepcion, no es 
         * necesario que la coloque dentro de un bloque try
         */
        /*
        Persona p1=null;
      
        p1 = new Persona(0,"Luis Garcia");
     
        System.out.println(p1);
        */
        /*
         * pero en caso contrario si es necesario
         */
        Persona p1=null;
        try{
      
            p1 = new Persona(0,"Luis Garcia");
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
     
        System.out.println(p1);
    }
    
}
