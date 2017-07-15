/*
 * Alumno: Mariano César D'Angelo.
 * Título: Trabajo Práctico Integrador: Control De Proyectos.
 * Asignatura: Programación y Diseño Orientada a Objetos (2017).
 * Universidad Nacional de Tierra del Fuego (UNTDF).
 *
 */
package presentacion.vista;

/**
 *
 * @author marces
 */
public interface VistaPadre extends Vista{
    
    public void actualizar();
    
    public boolean confirmacionBorrado();
}
