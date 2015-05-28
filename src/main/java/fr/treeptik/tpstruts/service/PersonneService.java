package fr.treeptik.tpstruts.service;

import java.util.List;

import fr.treeptik.tpstruts.dao.DAOFactory;
import fr.treeptik.tpstruts.dao.PersonneDAO;
import fr.treeptik.tpstruts.exception.DAOException;
import fr.treeptik.tpstruts.exception.ServiceException;
import fr.treeptik.tpstruts.model.Personne;


public class PersonneService {

	private PersonneDAO personneDAO = DAOFactory.getPersonneDAO();

	public Personne create(Personne personne) throws DAOException, ServiceException{

		try {
			personne = personneDAO.create(personne);
		} catch (InstantiationException | IllegalAccessException e) {
			throw new ServiceException("Erreur Service create personne", e);
		}
		return personne;
	}

	public void remove(Personne personne) throws ServiceException {
		try {
			personneDAO.remove(personne);
		} catch (DAOException e) {
			throw new ServiceException("Erreur service remove personne", e);
		}
	}

	public Personne find(Personne personne) throws ServiceException, InstantiationException, IllegalAccessException {
		try {
			return personneDAO.find(personne);
		} catch (DAOException e) {
			throw new ServiceException("error find by id", e);
		}
	}

	public List<Personne> findAll() throws ServiceException, InstantiationException, IllegalAccessException {
		try {
			return personneDAO.findAll();
		} catch (DAOException e) {
			throw new ServiceException("erreur findall", e);
		}
	}

	public Personne update(Personne personne) {
		return personneDAO.update(personne);
	}
}
