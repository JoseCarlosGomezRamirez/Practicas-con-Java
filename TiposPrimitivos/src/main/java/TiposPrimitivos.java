
public class TiposPrimitivos {
    
    public static void main(String[] args) {
        
        /*
        Tipos primitivos de tipo enteros: byte, short, int y long.
        */
        byte byteVar = 15;
        System.out.println("byteVar = " + byteVar);
        
        System.out.println("bits tipo byte:" + Byte.SIZE);
        System.out.println("Bytes tipo bytes:" + Byte.BYTES);
        System.out.println("Valor minimo tipo byte:" + Byte.MIN_VALUE);
        System.out.println("Valor máximo tipo byte:" + Byte.MAX_VALUE);
        
        short shortVar = 1000;
        System.out.println("shortVar =" + shortVar);
        
        System.out.println("bits tipo short:" + Short.SIZE);
        System.out.println("Bytes tipo short:" + Short.BYTES);
        System.out.println("Valor minimo tipo short:" + Short.MIN_VALUE);
        System.out.println("Valor máximo tipo short:" + Short.MAX_VALUE);
        
        int intVar = 5000;
        System.out.println("intVar =" + intVar);
        
        System.out.println("bits tipo int:" + Integer.SIZE);
        System.out.println("Bytes tipo int:" + Integer.BYTES);
        System.out.println("Valor minimo tipo int:" + Integer.MIN_VALUE);
        System.out.println("Valor máximo tipo int:" + Integer.MAX_VALUE);
        
        long longVar = 859000888888L;/*
      Para declarar que es tipo long hay que poner una "L" al final.
        Debe de ser mayusculas porque aunque admita la minúscula se puede 
        confundir con un uno(1).
      */

        System.out.println("longVar =" + longVar);
        
        System.out.println("bits tipo long:" + Long.SIZE);
        System.out.println("Bytes tipo long:" + Long.BYTES);
        System.out.println("Valor minimo tipo long:" + Long.MIN_VALUE);
        System.out.println("Valor máximo tipo long:" + Long.MAX_VALUE);
        
        var numero = 2147483647; /*Ésta variable es de tipo entero(int) porque admite el
        tipo byte y short pero sin ponemos el número máximo de int nos da error.
        también podriamos definrla como tipo long poniendo una "L" al final.
        Por lo que "var" va a definir el tipo automaticamente. 
        */
        System.out.println("numero = " + numero);
        
        // Aquí lo imprimo para tener las refencias.
        var numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        
        var numeroLong = 2147483648L;
        System.out.println("numeroLong = " + numeroLong);
        
        
    }
    
}
