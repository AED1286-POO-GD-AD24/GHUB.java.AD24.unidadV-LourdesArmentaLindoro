package miPrincipal;
import java.util.Scanner;
public class TestExcepciones{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce un valor entero:");
       
        try{
              int x = entrada.nextInt();
              System.out.println("El valor entero que introdujiste fue: "+x);
        }catch (Exception ex){
            System.out.println("Ocurrio un error "+ex.getMessage());

        }
       
        entrada.close();
        
    }


}
