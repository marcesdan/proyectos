/*
 * UNTDF - Laboratorio de programación y lenguajes (2017)
 */
package presentacion.factory;

import presentacion.controlador.ControladorFactory;
import presentacion.controlador.ControladorHijo;
import presentacion.controlador.ControladorPadre;
import presentacion.vista.VistaHija;
import presentacion.vista.VistaPadre;
import presentacion.vista.panel.PanelFactory;

/**
 *
 * @author marces
 */
public abstract class AbstractFactory {
    
    protected final PanelFactory panelFactory; 
    protected final ControladorFactory controladorFactory;
    
    public AbstractFactory() {
        panelFactory = new PanelFactory();
        controladorFactory = new ControladorFactory();
    }
    
    public abstract VistaPadre crearVista();
    public abstract ControladorPadre crearControlador();
    public abstract VistaHija crearVistaHija();   
    public abstract ControladorHijo crearControladorHijo();
}
