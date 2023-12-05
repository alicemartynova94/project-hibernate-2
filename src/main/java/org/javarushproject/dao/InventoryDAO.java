package org.javarushproject.dao;

import org.hibernate.SessionFactory;
import org.javarushproject.domain.Inventory;

public class InventoryDAO extends GenericDAO<Inventory>{
    public InventoryDAO(SessionFactory sessionFactory) {
        super(Inventory.class, sessionFactory);
    }
}
