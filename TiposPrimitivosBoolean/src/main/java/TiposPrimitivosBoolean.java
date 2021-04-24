
public class TiposPrimitivosBoolean {
    
    public static void main(String[] args) {
        
        // boolean: solo es o true o false.
        System.out.println("true tipo boolean:" + Boolean.TRUE);
        System.out.println("false tipo boolean:" + Boolean.FALSE);
        
        boolean booleanVar = true;
        
        if(booleanVar){
            System.out.println("el valor es verdadero");
        }
        else{
            System.out.println("el valor es falso");
        }
        
        System.out.println("");
        
        var edad = 30;
        var esAdulto = edad >= 18; // "var" es de tipo boolean porque al lado
        // derecho es de tipo boolean. se podria escribir como: boolean esAdulto.
        System.out.println("esAdulto = " + esAdulto);
    }
}
