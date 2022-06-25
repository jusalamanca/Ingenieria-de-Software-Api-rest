
package co.unicauca.travelagency;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
/**
 * Clase que indice el Path base desde el cual estará respondiendo la API Rest.
 * Este path corresponde a la URL a partir de la cual se expondrá nuestros
 * servicios. Para lograr esto, será necesario crear una clase que extienda de
 * “Application”, esta clase puede llamarse como sea y puede colocarse en
 * cualquier paquete.

/**
 *
 * @author juan-sala
 */
@ApplicationPath("customer-service")
public class AppConfiguration extends Application {
    
}
