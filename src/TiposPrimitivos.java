
import java.util.Scanner;

public class TiposPrimitivos {
    
    public static void main(String args[]) {
        /*
            tipos primitivos enteros: byte, short, int, long
        */
        
        byte numeroByte = (byte)129;
        System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE );
        System.out.println("Valor maximo del byte: " + Byte.MAX_VALUE );
        System.out.println("\n");
        
        short numeroShort = 10;
        System.out.println("Valor minimo del short: "+ Short.MIN_VALUE);
        System.out.println("Valor maximo del short: "+ Short.MAX_VALUE);
        System.out.println("\n");
        
        int numeroInt = 10;
        System.out.println("Valor minimo del int: "+ Integer.MIN_VALUE);
        System.out.println("Valor maximo del int: "+ Integer.MAX_VALUE);
        System.out.println("\n");
        
        long numeroLong = 10;
        System.out.println("Valor minimo del long: "+ Long.MIN_VALUE);
        System.out.println("Valor maximo del long: "+ Long.MAX_VALUE);
        System.out.println("\n");
        
        /*
            TIPOS PRIMITIVOS FLOTANTES: float, double
        */
        
        float numeroFloat = (float)3.4028235E38D;
        System.out.println("Valor minimo del float: "+ Float.MIN_VALUE);
        System.out.println("Valor maximo del float: "+ Float.MAX_VALUE);
        System.out.println("\n");
        
        double numeroDouble = 10;
        System.out.println("Valor minimo del double: "+ Double.MIN_VALUE);
        System.out.println("Valor maximo del double: "+ Double.MAX_VALUE);
        System.out.println("\n");
        
        /*
            INFERENCIA DE TIPOS VAR Y TIPOS PRIMITIVOS
        */
        
        var numeroEntero2 = 10;
        System.out.println("numeroEntero = " + numeroEntero2);
        
        var numeroDouble2 = 10.0;
        System.out.println("numeroDouble2 = " + numeroDouble2);
        
        var numeroFloat2 = 10.0;
        System.out.println("numeroFloat2 = " + numeroFloat2);
        
        System.out.println("\n");
        
        /*
            Tipo primitivo Char
            Unicode characters
        */
        
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        
        char varCharCodigo = '\u0021';
        System.out.println("varCharCodigo = " + varCharCodigo);
        
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        int varIntSimbolo = '!';
        System.out.println("varIntSimbolo = " + varIntSimbolo);
        
        int letra = 'A';
        System.out.println("letra = " + letra);
        
        System.out.println("\n");
        
        /*
            Tipo Boolean
        */
        
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean){
            System.out.println("La bandera es verdadera");
        } else{
            System.out.println("La bandera es falsa");
        }
        
        var edad = 30;
        var esAdulto = edad >=18;
        
        System.out.println("esAdulto = " + esAdulto);
        
        System.out.println("\n");
        
        /*
            Conversion de tipos
        */
        
        //Convertir tipo String a tipo Int
        var edadNueva = Integer.parseInt("20");
        System.out.println("edadNueva = " + (edadNueva + 1));
        
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        //Pedir un valor
        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);
        
        /*
            Convertir un tipo proporcionado a tipo String 
        */
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        /*
            Recuperar Char de una cadena 
        */
        var caracter = "Hola".charAt(2);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter: ");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
        /*
            Tarea final
        */
        
        System.out.println("Proporciona el nombre: ");
        String nombre = consola.nextLine();
        
        System.out.println("Proporciona el id: ");
        var id = consola.nextLine();
        
        System.out.println("Proporciona el precio: ");
        var precio = consola.nextLine();
        
        System.out.println("Proporciona el envio gratuito: ");
        boolean envioGratuito = consola.nextBoolean();
        
        System.out.println("nombre = " + nombre + " #" + id);
        System.out.println("precio = $" + precio + ".00");
        System.out.println("Envio gratuito: " + envioGratuito);
        
    }
    
}
