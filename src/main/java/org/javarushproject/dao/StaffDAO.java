package org.javarushproject.dao;

import org.hibernate.SessionFactory;
import org.javarushproject.domain.Staff;

public class StaffDAO extends GenericDAO<Staff>{

    public StaffDAO(SessionFactory sessionFactory) {
        super(Staff.class, sessionFactory);
    }
}
