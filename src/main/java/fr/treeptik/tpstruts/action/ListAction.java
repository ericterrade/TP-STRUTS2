package fr.treeptik.tpstruts.action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import fr.treeptik.tpstruts.model.Personne;
import fr.treeptik.tpstruts.service.PersonneService;

public class ListAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
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
