
import java.util.Scanner;


public class ClaseEscaner {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        
        
        System.out.println("Escribe tu nombre a continuación:");
        var nombre = scanner.nextLine();
        System.out.println("nombre = " + nombre);
        
/* Ésto lo pongo como ejemplo de como seria el valor en codigo duro sin 
        interactuar con el usuario. ¡¡¡No hacer caso!!!
        
        var usuario = "Juan";
        System.out.println("usuario = " + usuario); // valor en codigo duro
        
        */

    }

}
