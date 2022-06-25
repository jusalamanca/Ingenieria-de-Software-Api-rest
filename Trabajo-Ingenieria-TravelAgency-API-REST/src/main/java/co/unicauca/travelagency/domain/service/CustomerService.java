package co.unicauca.travelagency.domain.service;

import co.unicauca.travelagency.domain.entity.Customer;
import co.unicauca.travelagency.access.ICustomerRepository;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

/**
 * Fachada de acceso al negocio por parte de la presentación. Usa el repositorio
 * por defecto. Si no se pone @Default tambien funciona, pues inyecta la
 * implementación por defecto
 *
 * @author juan-sala
 */
@RequestScoped
public class CustomerService {

     /**
     * Inyecta una implementación del repositorio
     */
    @Inject
    @Default
    ICustomerRepository repo;

    /**
     * Constructor 
     */
    public CustomerService() {    }
    public List<Customer> findAll() {
        return repo.findAll();
    }
    /**
     * Buscar un cliente
     *
     * @param id cedula
     * @return objeto tipo Customer
     */
    public Customer findById(String id) {
        return repo.findById(id);
    }
    /**
     * Crea un nuevo customer.
     * @param cust 
     * @return devuelve un true o false si fue posible crear el cliente
     */
    public boolean create(Customer cust) {
        return repo.create(cust);
    }
    /**
     * Edita un customer.
     * @param cust 
     * @return devuelve devuelve un true o false si fue posible actualizar el cliente
     */
    public boolean update(Customer cust) {
        return repo.update(cust);
    }
    /**
     * Elimina un customer.
     * @param id cedula 
     * @return devuelve devuelve un true o false si fue posible eliminar el cliente
     */
    public boolean delete(String id) {
        return repo.delete(id);
    }
}
