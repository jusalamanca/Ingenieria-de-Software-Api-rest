package co.unicauca.travelagency.access;

import co.unicauca.travelagency.domain.entity.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Default;


/**
 * Implementación de ICustomerRepository. Utilliza arreglos en memoria
 *
 * @author juan-sala
 */
@Default
public final class CustomerRepositoryImplArrays implements ICustomerRepository {

    /**
     * Array List de clientes
     */
    private static List<Customer> customers;

    public CustomerRepositoryImplArrays() {
        if (customers == null){
            customers = new ArrayList();
            
        }
        if(customers.isEmpty()){
            inicializar();
        }
    }

    public void inicializar() {
        customers.add(new Customer("98000001", "Andrea", "Sanchez", "Calle 14 No 11-12 Popayan", "3145878752", "andrea@hotmail.com", "Femenino"));
        customers.add(new Customer("98000002", "Libardo", "Pantoja", "Santa Barbar Popayan", "3141257845", "libardo@gmail.com", "Masculino"));
        customers.add(new Customer("98000003", "Carlos", "Pantoja", "Santa Barbar Popayan", "3141257846", "carlos@gmail.com", "Masculino"));
        customers.add(new Customer("98000004", "Fernanda", "Arevalo", "Calle 16 No 12-12 Popayan", "3154562133", "fercha@hotmail.com", "Femenino"));
        customers.add(new Customer("98000005", "Manuel", "Perez", "Calle 12 No 12-12 Popayan", "3154575845", "fer@hotmail.com", "Masculino"));
        customers.add(new Customer("98000006", "Alejandro", "Mosquera", "Calle 12 No 12-12 Popayan", "3154575845", "fer@hotmail.com", "Masculino"));
        customers.add(new Customer("98000007", "Cesar", "Gutierres Sanchez", "Calle 12 No 12-12 Popayan", "3154575845", "fer@hotmail.com", "Masculino"));
        customers.add(new Customer("98000008", "Julio", "Bravo Bravo", "Calle 12 No 12-12 Popayan", "3154575845", "fer@hotmail.com", "Masculino"));
        customers.add(new Customer("98000009", "Alberto", "Mendez Bravo", "Calle 12 No 12-12 Popayan", "3154575845", "fer@hotmail.com", "Masculino"));
        customers.add(new Customer("98000010", "Alexander", "Ponce Yepes", "Calle 12 No 12-12 Popayan", "3154575845", "fer@hotmail.com", "Masculino"));

    }

    /**
     * Busca u Customer en el arreglo
     *
     * @param id cedula del customer
     * @return objeto Customer
     */
  
    public Customer findCustomer(String id) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    
    public String createCustomer(Customer customer) {
        customers.add(customer);
        return customer.getId();
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findById(String id) {
        for (Customer cust : customers) {
            if (cust.getId().equals(id)) {
                return cust;
            }
        }
        return null;
    }

    @Override
    public boolean create(Customer newCustomer) {
        Customer cust = this.findById(newCustomer.getId());
        if (cust != null) {
            //Ya existe
            return false;
        }
        customers.add(newCustomer);
        return true;
    }

    @Override
    public boolean update(Customer newCustomer) {
        Customer cust = this.findById(newCustomer.getId());
        if (cust != null) {
            cust.setFirstName(newCustomer.getFirstName());
            cust.setLastName(newCustomer.getLastName());
            cust.setAddress(newCustomer.getAddress());
            cust.setGender(newCustomer.getAddress());
            cust.setEmail(newCustomer.getEmail());
            cust.setMobile(newCustomer.getMobile());
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        for (Customer cust : customers) {
            if (cust.getId().equals(id)) {
                customers.remove(id);
                return true;
            }
        }
        return false;
    }

}
