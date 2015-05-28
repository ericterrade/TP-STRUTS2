package fr.treeptik.tpstruts.action;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import fr.treeptik.tpstruts.exception.ServiceException;
import fr.treeptik.tpstruts.model.Personne;
import fr.treeptik.tpstruts.service.PersonneService;

@Controller
public class LoginAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	@Autowired
	private PersonneService personneService;

	private Personne personne;

	private SessionMap<String, Object> session;

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@SkipValidation
	@Action(value = "/loginForm", results = @Result(name = "success", location = "/pages/login.jsp"))
	public String getLoginForm() {
		return SUCCESS;

	}

	@SkipValidation
	@Action(value = "/logout", results = @Result(name = "success", location = "/pages/login.jsp"))
	public String logout() {
		session.invalidate();
		return SUCCESS;

	}

	@SkipValidation
	@Action(value = "/login", results = {
			@Result(name = "success", location = "/pages/login-success.jsp"),
			@Result(name = "error", location = "/pages/login.jsp") })
	public String getLoginSuccess() throws InstantiationException,
			IllegalAccessException, ServiceException {
		Personne goodPersonne = personneService.identifier(personne);
		if (goodPersonne != null) {
			session.put("USER", goodPersonne.getUsername());
			addActionMessage("Vous avez bien été identifié ! "
					+ personne.getUsername());
			return SUCCESS;
		} else {
			addActionError("Essaye encore!");
			return ERROR;
		}

	}

}
