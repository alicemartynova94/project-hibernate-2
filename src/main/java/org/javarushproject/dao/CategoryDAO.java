package org.javarushproject.dao;

import org.hibernate.SessionFactory;
import org.javarushproject.domain.Category;

public class CategoryDAO extends GenericDAO<Category> {
    public CategoryDAO(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
