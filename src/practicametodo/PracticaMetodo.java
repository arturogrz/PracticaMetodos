package practicametodo;
public class PracticaMetodo {
    public static void main(String[] args) {
        
        //Llamamos al primer metodo estatico
        System.out.println("---------------------------------------------------------");
        System.out.println("Primer metodo estatico de tipo Boolean:");
        ComparaCadenas ("Hola" , "Hola");
        
        //Llamamos al Segundo metodo estatico
        System.out.println("---------------------------------------------------------");
        System.out.println("Secundo metodo estatico de tipo Integer:");
        Multiplicacion(3 , 6);
        
        //Creamos una instancia para llamar a los metodos 3 y 4
        MetodosNoEstaticos Metodos = new MetodosNoEstaticos();
        
        //Llamamos al Tercer metodo long 
        System.out.println("---------------------------------------------------------");
        System.out.println("Tercer metodo no estatico de tipo Long:");
        System.out.println("  " +"La suma de dos numeros de tipo Long es: "+ Metodos.SumarLong(756856854 , 56978890));
        
        //Llamamos al Cuarto metodo Char
        System.out.println("---------------------------------------------------------");
        System.out.println("Cuarto metodo no estatico de tipo Char:");
        System.out.println("  " + "La conversion del numero 97 a codigo ASCII es: "+Metodos.Caracter(97));
        
        System.out.println("---------------------------------------------------------");
    }
    //Metodo estatico de tipo Booleano
    public static void ComparaCadenas (String S1 , String S2) {
        if (S1.equals(S2))
        System.out.println("  '" + S1 + "' y '" + S2 +"' son textos iguales.");
        else{
        System.out.println("  '" + S1 + "' y '" + S2 +"' No son textos iguales.");
        }
    }
    //Metodo estatico de tipo Entero
    public static void Multiplicacion (int m1 , int m2) {
        System.out.println("  El resultado de multiplicar " + m1 + "x" + m2 + " es " + m1*m2);
    } 
}
