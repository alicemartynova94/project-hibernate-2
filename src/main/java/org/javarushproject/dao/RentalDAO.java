package org.javarushproject.dao;

import org.hibernate.SessionFactory;
import org.javarushproject.domain.Rental;

public class RentalDAO extends GenericDAO<Rental>{
    public RentalDAO(SessionFactory sessionFactory) {
        super(Rental.class, sessionFactory);
    }
}
