package org.javarushproject.dao;

import org.hibernate.SessionFactory;
import org.javarushproject.domain.Payment;

public class PaymentDAO extends GenericDAO<Payment>{

    public PaymentDAO(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}
