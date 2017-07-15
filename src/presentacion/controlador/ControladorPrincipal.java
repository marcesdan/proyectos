/*
 * UNTDF - Laboratorio de programación y lenguajes (2017)
 */
package presentacion.controlador;

import presentacion.factory.EmpleadoFactory;
import presentacion.factory.ProyectoFactory;
import presentacion.vista.Main;
import presentacion.vista.Vista;
import presentacion.vista.VistaPadre;
import presentacion.factory.AbstractFactoryCompleta;
import presentacion.factory.AsignacionFactory;

/**
 * Clase encargada de controlar la vista principal donde se encuentra la barra
 * de menú que llamará a las vistas: cliente, teatro, funcion y ticket.
 *
 * @author marces
 */
public class ControladorPrincipal implements Controlador {

    private AbstractFactoryCompleta factory;
    private Vista vistaPrincipal;
    private VistaPadre vistaPadre;
    private Controlador controlador;

    @Override
    public void setVista(Vista vista) {
        this.vistaPrincipal = vista;
    }

    /**
     * Se muestra la vista de los clientes y se le asigna su controlador
     */
    public void mostrarEmpleados() {
        factory = new EmpleadoFactory();
        cargar(factory);
    }

    /**
     * Se muestra la vista de las funciones y se le asigna su controlador
     */
    public void mostrarProyectos() {
        factory = new ProyectoFactory();
        cargar(factory);
    }

    /**
     * Se muestra la vista de los tickets y se le asigna su controlador
     */
    public void mostrarAsignaciones() {  
        factory = new AsignacionFactory();
        cargar(factory);
    }

    private void cargar(AbstractFactoryCompleta factory) {
        controlador = factory.crearControlador();
        vistaPadre = factory.crearVista();
        controlador.setVista(vistaPadre);
        vistaPadre.setControlador(controlador);
        Main.getInstance().mostrarPanelEnFrame(vistaPadre);
    }
}