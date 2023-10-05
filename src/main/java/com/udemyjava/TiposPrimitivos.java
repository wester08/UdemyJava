public class TiposPrimitivos {
    // tipos primitivos de tipo enteros: byte, short, char, int, long
    public static void main(String args[]) {

        byte numeroByte = (byte) 129;
        System.out.println("Valor byte" + numeroByte);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor minimo byte: " + Byte.MAX_VALUE);


        short numeroShort = (short)32768;
        System.out.println("Numero Short = " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor minimo short: " + Short.MAX_VALUE);
    
    
        int numeroInt = (int)2147483648L;
        System.out.println("Numero int = " + numeroInt);
        System.out.println("Valor minimo short: " + Integer.MIN_VALUE);
        System.out.println("Valor minimo short: " + Integer.MAX_VALUE);
    
        long numeroLong = 923337203685477600L;
        System.out.println("NumeroLong = " + numeroLong);
        System.out.println("Valor minimo Long: " + Long.MIN_VALUE);
        System.out.println("Valor minimo Long: " + Long.MAX_VALUE);
    }

}
