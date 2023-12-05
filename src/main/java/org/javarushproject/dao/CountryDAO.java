package org.javarushproject.dao;

import org.hibernate.SessionFactory;
import org.javarushproject.domain.Country;

public class CountryDAO extends GenericDAO<Country> {
    public CountryDAO(SessionFactory sessionFactory) {
        super(Country.class, sessionFactory);
    }
}
