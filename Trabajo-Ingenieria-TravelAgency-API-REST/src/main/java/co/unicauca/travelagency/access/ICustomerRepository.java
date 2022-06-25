/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.travelagency.access;

import co.unicauca.travelagency.domain.entity.Customer;
import java.util.List;

/**
 *
 * @author juan-sala
 */
public interface ICustomerRepository {
    List<Customer> findAll();

    Customer findById(String id);

    boolean create(Customer newCustomer);

    boolean update(Customer newCustomer);

    boolean delete(String id);
}
