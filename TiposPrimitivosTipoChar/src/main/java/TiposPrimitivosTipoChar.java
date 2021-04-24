public class TiposPrimitivosTipoChar {

    public static void main(String[] args) {

        System.out.println("bits tipo char:" + Character.SIZE);
        System.out.println("bytes tipo char:" + Character.BYTES);
        System.out.println("valor minimo tipo char:" + Character.MIN_VALUE);
        System.out.println("valor maximo tipo char:" + Character.MAX_VALUE);
        
        char varChar = '\u0021'; /*se puede poner "var" y al encontrar \u se 
        combierte en una variable de tipo "char"
        */
        System.out.println("varChar = " + varChar);
        // escribir en el navegador: List unicode character.
        char varCharDecimal = 33; //aqui si utilizamos "var" define de tipo numerico
        // por lo que no se podria utilizar
        System.out.println("varCharDecimal = " + varCharDecimal);
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        
    }
}
