package org.javarushproject.dao;

import org.hibernate.SessionFactory;
import org.javarushproject.domain.Actor;

public class ActorDAO extends GenericDAO<Actor>{
    public ActorDAO(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}
