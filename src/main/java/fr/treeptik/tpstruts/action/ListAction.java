package fr.treeptik.tpstruts.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import fr.treeptik.tpstruts.model.Personne;
import fr.treeptik.tpstruts.service.PersonneService;

@Controller
public class ListAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	@Autowired
	private PersonneService personneService = new PersonneService();
	private List<Personne> personnes;
	private Personne personne;

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Override
	public String execute() throws Exception {

		setPersonnes(personneService.findAll());

		return Action.SUCCESS;
	}

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}


}
