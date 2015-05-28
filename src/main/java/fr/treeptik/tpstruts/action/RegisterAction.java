package fr.treeptik.tpstruts.action;


import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import fr.treeptik.tpstruts.model.Personne;
import fr.treeptik.tpstruts.service.PersonneService;

@Controller
public class RegisterAction extends ActionSupport {
	
	static final Logger logger = Logger.getLogger(RegisterAction.class);

	private static final long serialVersionUID = 1L;
	@Autowired
	private PersonneService personneService;
	
	private Personne personne;

	@SkipValidation
	// ignorer la validation c'est juste de la redirection de page
	@Action(value = "/index", results = @Result(name = "success", location = "/pages/index.jsp"))
	public String getHelloWorldPage() {
		return SUCCESS;

	}

	@SkipValidation
	// ignorer la validation c'est juste de la redirection de page
	@Action(value = "/register", results = @Result(name = "success", location = "/pages/register.jsp"))
	public String register() {
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
		logger.debug("registration!");
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

}
