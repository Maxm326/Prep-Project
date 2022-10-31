package com.stackleader.service;

import com.stackleader.PrepDto;
import com.stackleader.model.Property;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class JPARegistration {

    @Inject
    EntityManager em;

    public List<PrepDto> findAllPropertiesWithJpql() {
        List<Property> queryResults = em.createQuery("select p from Property p", Property.class).getResultList();
        List<PrepDto> prepDtos = new ArrayList<>();
        for (Property a : queryResults) {
            PrepDto prepDto = new PrepDto(a.getUuid().toString(), a.getName());
            prepDtos.add(prepDto);
        }
        return prepDtos;
    }
}
