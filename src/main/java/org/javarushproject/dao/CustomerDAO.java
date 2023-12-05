package org.javarushproject.dao;

import org.hibernate.SessionFactory;
import org.javarushproject.domain.Customer;

public class CustomerDAO extends GenericDAO<Customer> {
    public CustomerDAO(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}
