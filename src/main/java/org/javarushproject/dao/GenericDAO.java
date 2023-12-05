package org.javarushproject.dao;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import java.util.List;

public abstract class GenericDAO<T> {

    private final Class<T> tClass;

    private SessionFactory sessionFactory;

    public GenericDAO(final Class<T> classToSet, SessionFactory sessionFactory) {
        this.tClass =classToSet;
        this.sessionFactory = sessionFactory;
    }

    public T getById(final int id){
        return (T) getCurrentSession().get(tClass, id);
    }

    public List<T> getItemsWithOffset(int offset, int count){
        Query query = getCurrentSession().createQuery("from" + tClass.getName(), tClass);
        query.setFirstResult(offset);
        query.setMaxResults(count);
        return query.getResultList();
    }

    public List<T> findAll(){
        return getCurrentSession().createQuery("from" + tClass.getName(), tClass).list();
    }

    public T save(final T entity){
        getCurrentSession().saveOrUpdate(entity);
        return entity;
    }

    public T update(final T entity){
        return (T) getCurrentSession().merge(entity);
    }

    public void delete(final T entity){
        getCurrentSession().delete(entity);
    }

    public void deleteByID(final int entityId){
        final T entity = getById(entityId);
        delete(entity);
    }

    protected Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
}
