package org.javarushproject.dao;

import org.hibernate.SessionFactory;
import org.javarushproject.domain.FilmText;

public class FilmTextDAO extends GenericDAO<FilmText> {
    public FilmTextDAO(SessionFactory sessionFactory) {
        super(FilmText.class, sessionFactory);
    }
}
