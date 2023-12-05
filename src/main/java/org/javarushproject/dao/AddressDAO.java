package org.javarushproject.dao;

import org.hibernate.SessionFactory;
import org.javarushproject.domain.Address;

public class AddressDAO extends GenericDAO<Address> {
    public AddressDAO( SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}
