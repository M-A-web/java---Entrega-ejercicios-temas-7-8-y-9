import com.matiasayala.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// llamo a la funcion reverse
        reverse("!hola mundo");



   // 1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        System.out.println("--------- \n ejercico 1:");
        ArrayUnidimencional mostrarArray = new ArrayUnidimencional();
        mostrarArray.recorrerArray();

        System.out.println('\n');
        // 2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        System.out.println("--------- \n ejercico 2:");
        ArrayBidimencional mostrarArrayBidi = new ArrayBidimencional();
        mostrarArrayBidi.recorrerArrayBi();

        // 3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        System.out.println("--------- \n ejercico 3:");
        VectorNombres verNombres = new VectorNombres();
        verNombres.nombres();

        // 4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        System.out.println("--------- \n ejercico 4:");
        System.out.println(" Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo?\n\n" +
                "  Si utilizamos la capacidad por defeto, esmos generando consumo imnecesario en memoria, es decir,\n" +
                "           cada vez que ocupemos la capacidad por defecto(10) se va a generar una copia de la misma y ademas crear una memoria por el doble de valor.\n" +
                "           en este caso quedaria 1000 de copia mas 2000 del duplicado en total estariamos ocupando unos 3000 en memoria imnecesariamente.");
        /*
           Si utilizamos la capacidad por defeto, esmos generando consumo imnecesario en memoria, es decir,
           cada vez que ocupemos la capacidad por defecto(10) se va a generar una copia de la misma y ademas crear una memoria por el doble de valor.
           en este caso quedaria 1000 de copia mas 2000 del duplicado en total estariamos ocupando unos 3000 en memoria imnecesariamente.
           */

        // 5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

        System.out.println("--------- \n ejercico 5:");
        ArrayList_LinkedList Array_Linked = new ArrayList_LinkedList();
        Array_Linked.arrayList();

        // 6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        System.out.println("--------- \n ejercicio 6:");
        ArrayList_int numeros_int = new ArrayList_int();
        numeros_int.array_int();

      // 7.  Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".



        System.out.println("--------- \n ejercico 7:");

        Scanner scannerNum = new Scanner(System.in);
        System.out.println("Que numeros quieres dividir: ");
        System.out.print("Numero 1: ");
          int a = scannerNum.nextInt();
        System.out.print("Numero 2: ");
          int b = scannerNum.nextInt();
        try {
            System.out.println("Resultado: " + DividePorCero.Dividir(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }


       // 8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

        Scanner scannerFichero = new Scanner(System.in);
        System.out.println("Introduce el fichero de origen: ");
        String fileIn = scannerFichero.nextLine();
        System.out.println("Introduce el fichero de destino: ");
        String fileOut = scannerFichero.nextLine();
        copiar(fileIn, fileOut);
    }


// funcion reverse
      public static String reverse(String texto) {
        String saludo = texto;

        for(int i = saludo.length() -1; i >= 0; i--){

            System.out.print(saludo.charAt(i));
    }

        return saludo;
    }
 // fin de la funcion reverse

// funcion divicion

    public static class DividePorCero {

        private static int Dividir(int a, int b) throws ArithmeticException {
            return a / b;
        }

}

// fin de la funcion divicion


    // funcion "fileIn" y "fileOut"

    private static void copiar(String fileIn, String fileOut) {
        try {
            InputStream entrada = new FileInputStream(fileIn);
            byte[] datos = entrada.readAllBytes();
            entrada.close();

            PrintStream salida = new PrintStream(fileOut);
            salida.write(datos);
            salida.close();
        } catch (Exception e) {
            System.out.println("'Excepcion': " + e.getMessage());
        }
    }
}