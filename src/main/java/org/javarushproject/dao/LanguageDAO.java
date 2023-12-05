package org.javarushproject.dao;

import org.hibernate.SessionFactory;
import org.javarushproject.domain.Language;

public class LanguageDAO extends GenericDAO<Language>{
    public LanguageDAO(SessionFactory sessionFactory) {
        super(Language.class, sessionFactory);
    }
}
