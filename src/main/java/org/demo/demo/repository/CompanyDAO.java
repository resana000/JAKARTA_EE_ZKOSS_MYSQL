package org.demo.demo.repository;

import org.demo.demo.entity.Company;
import org.zkoss.xel.VariableResolver;
import org.zkoss.xel.XelException;

import javax.enterprise.inject.Model;

@Model
public class CompanyDAO implements VariableResolver {

    public void persist(Company company){
        JPAService.getInstance().getEntityManager().persist(company);
    }

    public Company findOne(Long id){
        return JPAService.getInstance().getEntityManager().find(Company.class, id);
    }

    public Company update(Company company){
        return JPAService.getInstance().getEntityManager().merge(company);
    }

    @Override
    public Object resolveVariable(String s) throws XelException {
        return this;
    }
}
