//Mi clase en Java

import java.util.Scanner;

public class Variables {

    public static void main(String args[]) {
        
        //Variables
        int variableEntera = 10;
        System.out.println(variableEntera);

        variableEntera = 5;
        System.out.println(variableEntera);

        String variableCadena = "Saludos";
        System.out.println(variableCadena);

        variableCadena = "Adios";
        System.out.println(variableCadena);

        //VAR SIRVE PARA INFERENCIA DE DATOS
        var variableEntera2 = 21;
        System.out.println(variableEntera2);

        var variableCadena2 = "hola";
        //soutv
        System.out.println("variableCadena2 = " + variableCadena2);

        
        //Nombres de variables que son aceptados
        var miVariable = 1;
        var _miVariable = 1;
        var $miVariable = 1;
        //No se pueden iniciar con numeros ni otros caracteres especiales
        
        
        //Concatenacion
        var usuario = "Hazael";
        var titulo2 = "Ingeniero bachicho";

        var union = titulo2 + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j); //Suma
        
        System.out.println(i + j + usuario);//al iniciar numeros se concatena
        
        System.out.println(usuario + i + j); //contexto cadena
        
        System.out.println(usuario + (i + j)); //los parentesis modifican el orden de importancia
        
        
        //Caracteres especiales
        var nombre = "Yeya";
        
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \" " + nombre + " \" ");
        
        
        //Clase scanner
        //System.out.println("Escirbe tu nombre: ");
        
        
        //var usuario2 = consola.nextLine();
        //System.out.println("usuario = " + usuario2);
        
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Proporciona el titulo: ");
        var titulo = consola.nextLine();
        
        System.out.println("Proporciona el autor: ");
        var autor = consola.nextLine();
        
        System.out.println(titulo + " fue escrito por " + autor);

    }

}
