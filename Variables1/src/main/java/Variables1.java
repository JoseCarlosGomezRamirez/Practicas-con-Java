/*
 Partiendo del ejercicio de HolaMundo ponemos en práctica las variables con la 
primera lección
 */

public class Variables1 {

    public static void main(String[] args) {

        String saludar = "saludos desde Java";
        //Puedes cambiar el contenido entre comillas y se repetirá 3 veces.
       
               

        System.out.println(saludar);
        System.out.println(saludar);
        System.out.println(saludar);
        
        var despedirse = "Hasta luego";
        System.out.println(despedirse);
        
         /*
        Acuerdate de que va sin comillas cuando imprimes las variables en el
        System.out.println(); si pones las comillas se imprimirá lo que pongas 
        ahí. 
        Para "despedirse" también podríamos usar String como en el caso anterior
        en vez de Var, ya que con var al utiiizar un string en el lado derecho 
        la variable se cambia a ese tipo sin tener que especificarlo( desde la 
        versión JDK 10 en adelante)
        */
        
        var numero = 1;
        System.out.println(numero);
        
        /*
        En este caso pasa lo mismo que en el otro "var", al poner un dato de
        tipo entero en el lado derecho se asigna automaticamente sin declararla
        como tipo entero.
     
        */
        
       
        
    }

}
