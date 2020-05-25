// Fig 3.8: PruebaLibroCalificaciones.java
// Crea y manipula un objeto LibroCalificaciones
package pruebacalificaciones2;
import java.util.Scanner; // el programa usa la clase Scanner 

public class PruebaCalificaciones2 
{
    // el metodo main empieza la ejecucion del programa
    public static void main(String[] args) 
    {
        //crea un objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner (System.in);
        
        // crea un objeto LibroCalificaciones y lo asigna a miLibroCalificaciones
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();
        
        //muestra el valor inicial de nombreDelCurso
        System.out.printf( "El nombre inicial del curso es: %s\n\n",
                miLibroCalificaciones.obtenerNombreDelCurso());
        
        // pide y lee el nombre del curso
        System.out.println( "Escriba el nombre del curso: ");
        String elNombre = entrada.nextLine(); // lee una línea de texto
        miLibroCalificaciones.establecerNombreDelCurso(elNombre); // establece el nombre del curso
        System.out.println(); // imprime una linea en blanco
        
        // muestra el mensaje de bienvenida despues de especificar el nombre del curso
        miLibroCalificaciones.mostrarMensaje();
    
    } // fin de main
    
}// fin de la clase PruebaCalificaciones2
