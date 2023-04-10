package org.demo.demo.dto;

import lombok.Data;
import lombok.ToString;
import org.zkoss.xel.VariableResolver;
import org.zkoss.xel.XelException;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.List;

@Named("cmp")
@ToString
@Data
public class CompanyDto implements VariableResolver {

    public String company_name;
    public String company_form;
    public String company_address_index;
    public String company_address_city;
    public String company_address_street;
    public String company_address_house;
    public String company_address_appartment;
    public List<String> company_departments;

    @Override
    public Object resolveVariable(String s) throws XelException {
        return this;
    }
}
