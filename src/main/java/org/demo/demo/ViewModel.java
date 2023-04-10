package org.demo.demo;

import lombok.Data;
import org.demo.demo.dto.CompanyDto;
import org.demo.demo.entity.Company;
import org.demo.demo.repository.CompanyDAO;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;

@Data
@VariableResolver({CompanyDto.class, CompanyDAO.class})
public class ViewModel {
	public static final String SUBMIT_COMMAND = "submit";
	public static final String RESPONSE = "Данные сохранены";

	@WireVariable
	CompanyDto cmp;

	@WireVariable
	CompanyDAO companyDAO;

	public String getResponse() {
		return String.format(RESPONSE + " %s!", cmp.toString());
	}

	@Command(SUBMIT_COMMAND)
	@NotifyChange("response")
	public void save() {
		Company company = new Company();
		company.setName(cmp.company_name);
		company.setForm(cmp.company_form);
		companyDAO.persist(company);
	}
}
