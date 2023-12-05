package org.javarushproject.dao;

import org.hibernate.SessionFactory;
import org.javarushproject.domain.Store;

public class StoreDAO extends GenericDAO<Store>{
    public StoreDAO(SessionFactory sessionFactory) {
        super(Store.class, sessionFactory);
    }
}
