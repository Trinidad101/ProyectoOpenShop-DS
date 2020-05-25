// Fig. 3.7: LibroCalificaciones.java
// Clase LibroCalificaciones que contiene una variable de instancia nombreDelCurso
// y métodos para establecer y obtener un valor.
package pruebacalificaciones2;

public class LibroCalificaciones 
{
    private String nombreDelCurso; // nombre del curso para este LibroCalificaciones
    
    //método para establecer el nombre del curso
    public void establecerNombreDelCurso ( String nombre )
    {
        nombreDelCurso = nombre; // almacena el nombre del curso
    } // fin del método establecerNombreDelCurso
    
    // método para obtener el nombre del curso
    public String obtenerNombreDelCurso()
    {
        return nombreDelCurso;
    }// fin del método obtenerNombreDelCurso
    
    //muestra un mensaje de bienvenida al usuario de LibroCalificaciones
    public void mostrarMensaje()
    {
        // esta instruccion llama de bienvenida al usuario de LibroCalificaciones
        // nombre del curso que representa este LibroCalificaciones
        System.out.printf( "Bienvenido al libro de calificaciones para\n%s!\n",
                obtenerNombreDelCurso());
        
    }// fin del método mostrarMensaje
      
}// fin de la clase LibroCalificaciones
