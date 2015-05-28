package fr.treeptik.tpstruts.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.treeptik.tpstruts.dao.PersonneDAO;
import fr.treeptik.tpstruts.exception.ServiceException;
import fr.treeptik.tpstruts.model.Personne;

@Service
public class PersonneService {

	@Autowired
	private PersonneDAO personneDAO;// = DAOFactory.getPersonneDAO();

	@Transactional
	public Personne save(Personne personne) throws ServiceException {
		personne = personneDAO.save(personne);
		return personne;
	}

	@Transactional
	public void remove(Personne personne) throws ServiceException {
		personneDAO.delete(personne);
	}

	public Personne find(Personne personne) throws ServiceException,
			InstantiationException, IllegalAccessException {
		return personneDAO.findOne(personne.getId());
	}

	public List<Personne> findAll() {
		return personneDAO.findAll();
	}

	public Personne identifier(Personne personne) {
		return personneDAO.findByUsername(personne.getUsername());
	}

}
