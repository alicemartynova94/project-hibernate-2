package org.javarushproject.dao;

import org.hibernate.query.Query;
import org.hibernate.SessionFactory;
import org.javarushproject.domain.City;

public class CityDAO extends GenericDAO<City> {

    public CityDAO(SessionFactory sessionFactory) {
        super(City.class, sessionFactory);
    }

    public City getByName(String name) {
        Query<City> query = getCurrentSession().createQuery("select c from City c where c.name = :NAME", City.class);
        query.setParameter("NAME", name);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}
