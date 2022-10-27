package com.stackleader.service;

import com.stackleader.model.JPAModel;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@Stateless
public class JPARegistration {

    @Inject
    EntityManager em;

    public List<JPAModel> findAllPropertiesWithJpql() {
        return em.createQuery("FROM entity", JPAModel.class).getResultList();
    }
}
