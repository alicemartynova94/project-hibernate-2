package org.javarushproject.dao;

import org.hibernate.SessionFactory;
import org.javarushproject.domain.City;

public class CityDAO extends GenericDAO<City> {

    public CityDAO( SessionFactory sessionFactory) {
        super(City.class, sessionFactory);
    }
}
