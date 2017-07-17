/*
 * Alumno: Mariano César D'Angelo.
 * Título: Trabajo Práctico Integrador: Control De Proyectos.
 * Asignatura: Programación y Diseño Orientada a Objetos (2017).
 * Universidad Nacional de Tierra del Fuego (UNTDF).
 *
 */
package presentacion.controlador;

import dao.DaoFactory;
import dominio.Empleado;
import presentacion.factory.EmpleadoFactory;
import presentacion.vista.Main;
import presentacion.vista.Vista;
import presentacion.vista.VistaHija;
import presentacion.vista.VistaPadre;
import presentacion.modelo.ATableModel;
import static presentacion.vista.info.InfoEmpleado.crearInfoEmpleado;
import dao.EmpleadoDao;
import presentacion.factory.AbstractFactory;

/**
 *
 * @author marces
 */
public class ControladorEmpleado implements ControladorPadre {
    
    private VistaPadre vistaPadre;
    private VistaHija vistaHija;
    private ControladorHijo controladorHijo;
    
    @Override
    public void setVista(Vista vista) {
        this.vistaPadre = (VistaPadre) vista;
    }
   
    @Override
    public void nuevo() {
        // Se setean las vistas y los controladores mutuamente.
        cargar();
        // Y se muestra la vista hija en pantalla
        Main.getInstance().mostrarPanelEnDialog(vistaHija, ""
                    + "Nuevo empleado");
    }
    
    @Override
    public void modificar(ATableModel model, int fila) {
        
        if (fila != -1 ) { // Si se se seleccionó una fila...
            
            // Se setean las vistas y los controladores mutuamente.
            cargar();
            // Nos quedamos con el campo id de fila seleccionada en la tabla
            Long id = model.getId(fila);
            
            // Realizamos la busqueda y nos quedamos con el empleado a modificar.
            Empleado empleado = new DaoFactory()
                    .crearEmpleadoDao()
                    .read(id); 
            
            /* 
            * Preparamos los datos del empleado a modificar para mostrarlos en
            * pantalla. Para ello, se setean los campos de infoEmpleado (Strings).
            * (Parameter Object Refactoring).
            */
            vistaHija.setCamposDeTexto(crearInfoEmpleado()
                    .withId(empleado.getId()) // Tambien disponemos de "id"...
                    .withApellido(empleado.getApellido())
                    .withNombre(empleado.getNombre())
                    .withDocumento(empleado.getDocumento().toString())
                    .withNacimiento(empleado.getNacimientoLocalDate())
                    .withCalle(empleado.getDireccion().getCalle())
                    .withAltura(empleado.getDireccion().getAltura())
                    .withBarrio(empleado.getDireccion().getBarrio())
                    .withTelefono(empleado.getContacto().getTelefono())
                    .withCelular(empleado.getContacto().getCelular())
                    .withEmail(empleado.getContacto().getEmail())
            );
            
            // Mostramos la vista hija con los datos del empleado a modificar.
            Main.getInstance().mostrarPanelEnDialog(vistaHija, ""
                    + "Modifición de empleado");
        }
        
        // De lo contrario, no se selecciono ningún empleado (fila) para modificar.
        else vistaPadre.mostrarMensaje(""
                + "Primero debe seleccionar una fila de la tabla");
    }   
    
    @Override
    public void eliminar(ATableModel model, int fila) {
        // Si se se seleccionó una fila...
        if (fila != -1 ) {
            // Se requiere una confirmación
            if (vistaPadre.confirmacionBorrado()) {
                
                Long id = model.getId(fila);
                String nombre = (String) model.getValueAt(fila, 1);
                
                // Buscamos y eliminamos.
                EmpleadoDao dao = new DaoFactory().crearEmpleadoDao();
                dao.delete(dao.read(id));
                
                // Se actializa el listado en pantalla.
                vistaPadre.actualizar();
                vistaPadre.mostrarMensaje("El empleado "+nombre+""
                        + " fue borrado exitosamente");
            }
        }
        else vistaPadre.mostrarMensaje(""
                + "Primero debe seleccionar una fila de la tabla");
    }
    
    /** Se setean las vistas y los controladores mutuamente. */
    private void cargar() {
        AbstractFactory factory = new EmpleadoFactory();
        controladorHijo = factory.crearControladorHijo();
        vistaHija = factory.crearVistaHija();
        controladorHijo.setVista(vistaHija);
        controladorHijo.setVistaPadre(vistaPadre);
        vistaHija.setControlador(controladorHijo);
    }
}
