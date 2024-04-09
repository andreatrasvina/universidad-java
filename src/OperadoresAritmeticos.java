
public class OperadoresAritmeticos {
    
    public static void main(String args[]) {
        int a=3, b=2;
        
        
        /*
            SUMA
        */
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        
        /*
            RESTA
        */
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        
        /*
            MULTIPLICACION
        */
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        
        /*
            DIVISION
        */
        var resultado2 = 3.0 / b;
        System.out.println("resultado division = " + resultado2);
        
        /*
            MODULO
        */
        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);
        
        if (a%2==0){
            System.out.println("Es numero par");
        }else{
            System.out.println("Es numero impar");
        }
        
        /*
            Operadores de asignacion
        */
        //int c = a + 5 - b;
        
        //System.out.println("c = " + c);
        
        /*
            Asignacion de composicion
        */
        a += 1;//a = a +1;
        System.out.println("a = " + a);
        
        a += 3;
        System.out.println("a = " + a);
        
        //Operadores de composicion: *=   /=  %=
        
        /*
            Operadores unarios
        */
        a = 3;
        b = -a;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        /*
            Incrementos
        */
        
        //1.preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e; //Primero se incrementa la variable y despues se usa su valor
        
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        //2.postincremento (simbolo despues de la variable)
        var g = 5;
        var h = g++; //Primero se utiliza el valor y despues se incrementa
        
        System.out.println("g = " + g); //decremento pendiente
        System.out.println("h = " + h);
        
        /*
            Decrementos
        */
        
        //1.predecremento
        var i = 2;
        var j = --i;
        
        System.out.println("i = " + i); //ya esta decrementada
        System.out.println("j = " + j);
        
        //2.postdecremento
        var k = 4;
        var l =  k--; // primero se utiliza el valor de la varible y queda pendiente  decremeto
        
        System.out.println("k = " + k); //Tiene pendiente un decremento
        System.out.println("l = " + l);
        
        /*
            Operadores de igualdad
        */
        
        a = 3;
        b = 2;
        
        c = (a==b); //Boolean
        System.out.println("c = " + c);
        
        d = a != b; //Boolean
        System.out.println("d = " + d);
        
        var cadena1 = "Hola";
        var cadena2 = "Adios";
        c = cadena1 == cadena2;
        
        System.out.println("c = " + e);
        
    }
    
}
