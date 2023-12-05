package org.javarushproject.dao;

import org.hibernate.SessionFactory;
import org.javarushproject.domain.Film;

public class FilmDAO extends GenericDAO<Film>{
    public FilmDAO(SessionFactory sessionFactory) {
        super(Film.class, sessionFactory);
    }
}
