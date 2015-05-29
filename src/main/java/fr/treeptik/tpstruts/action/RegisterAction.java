package fr.treeptik.tpstruts.action;


import java.util.List;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import fr.treeptik.tpstruts.exception.ServiceException;
import fr.treeptik.tpstruts.model.Personne;
import fr.treeptik.tpstruts.service.PersonneService;

@Controller
public class RegisterAction extends ActionSupport {
	
	//static final Logger logger = Logger.getLogger(RegisterAction.class);

	private static final long serialVersionUID = 1L;
	@Autowired
	private PersonneService personneService;
	
	private List<Personne> personnes;
	private Personne personne;

	@SkipValidation
	// ignorer la validation c'est juste de la redirection de page
	@Action(value = "/index", results = @Result(name = "success", location = "/pages/index.jsp"))
	public String getHelloWorldPage() {
		return SUCCESS;

	}
	
	@SkipValidation
	// ignorer la validation c'est juste de la redirection de page
	@Action(value = "/remove", results = @Result(name = "success", location = "/pages/list-personne.jsp"))
	public String remove() throws ServiceException {
		System.out.println(personne);
		//System.out.println(id);
		personneService.remove(personne);
		addActionMessage("La personne a bien été supprimée !");
		return SUCCESS;

	}

	@SkipValidation
	// ignorer la validation c'est juste de la redirection de page
	@Action(value = "/register", results = @Result(name = "success", location = "/pages/register.jsp"))
	public String register() {
		return SUCCESS;

	}
	
	
	@SkipValidation
	// ignorer la validation c'est juste de la redirection de page
	@Action(value = "/updateList", results = @Result(name = "success", location = "/pages/searchResult.jsp"))
	public String updateList() throws InstantiationException, IllegalAccessException, ServiceException {
		setPersonnes(personneService.findAll());
		return SUCCESS;

	}
	
	
	@SkipValidation
	// ignorer la validation c'est juste de la redirection de page
	@Action(value = "/update", results = @Result(name = "success", location = "/pages/register.jsp"))
	public String update() throws InstantiationException, IllegalAccessException, ServiceException {
		personne = personneService.find(personne);
		return SUCCESS;

	}

	@Action(value = "registration", results = {
			@Result(name = "success", location = "/pages/registration-ok.jsp"),
			@Result(name = "input", location = "/pages/register.jsp"),
			@Result(name = "error", location = "/pages/registration-error.jsp") })
	public String registration() {
		if (personne.getUsername().equals(personne.getPassword())) {
			addActionError("Erreur le USERNAME ne doivent pas être égales!");
			return ERROR;

		}
		//logger.debug("registration!");
		try {
			personneService.save(personne);
			addActionMessage("enregistrement de " + personne.getUsername()
					+ " correctement effectué");
		} catch (Exception e) {
			addActionError("Erreur de création!");
		}

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
