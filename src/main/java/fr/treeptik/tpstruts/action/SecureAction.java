package fr.treeptik.tpstruts.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import fr.treeptik.tpstruts.exception.ServiceException;
import fr.treeptik.tpstruts.model.Personne;
import fr.treeptik.tpstruts.service.PersonneService;

@Controller
@ParentPackage("secure")
public class SecureAction extends ActionSupport{

	@Autowired
	private PersonneService personneService = new PersonneService();
	private List<Personne> personnes;
	private Personne personne;

	private static final long serialVersionUID = 1L;

	@SkipValidation
	@Action(value = "/listPersonne", results = @Result(name = "success", location = "/pages/list-personne.jsp"))
	public String getSecurePage() throws InstantiationException,
			IllegalAccessException, ServiceException {
		personnes = personneService.findAll();
		return SUCCESS;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

}
