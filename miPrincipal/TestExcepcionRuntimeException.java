package miPrincipal;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TestExcepcionRuntimeException {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1=0,num2=0;
        try{
            System.out.println("Proporciona un Número: ");
            num1 = entrada.nextInt();
            System.out.println("Proporciona un Número: ");
            num2 = entrada.nextInt();
            
            double coc = num1/num2;
            System.out.println("El resultado de la división = "+coc);
        }catch(ArithmeticException ex){
            ex.printStackTrace();
            System.out.println("Ocurrio un error aritmetico "+ex.getMessage());

        }
        catch(InputMismatchException ex){
            ex.printStackTrace();
            System.out.println("Dato no válido "+ex.getMessage()); 
            

        }
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Ocurrio un error "+ex.getMessage());

        }

    }
    
}
