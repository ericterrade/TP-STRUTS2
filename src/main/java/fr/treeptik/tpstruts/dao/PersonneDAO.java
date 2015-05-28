package fr.treeptik.tpstruts.dao;

import java.util.List;

import fr.treeptik.tpstruts.exception.DAOException;
import fr.treeptik.tpstruts.model.Personne;

public interface PersonneDAO {

	Personne create(Personne personne) throws DAOException, InstantiationException, IllegalAccessException;

	void remove(Personne personne) throws DAOException;

	Personne find(Personne personne) throws DAOException, InstantiationException, IllegalAccessException;

	List<Personne> findAll() throws DAOException, InstantiationException, IllegalAccessException;

	Personne update(Personne personne);
}
