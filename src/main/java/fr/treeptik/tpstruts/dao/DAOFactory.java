package fr.treeptik.tpstruts.dao;

import fr.treeptik.tpstruts.dao.impl.PersonneFileDAO;


public abstract class DAOFactory {

	private static PersonneDAO personneDAO;

	public static PersonneDAO getPersonneDAO() {

		if (personneDAO == null) {
			personneDAO = new PersonneFileDAO();
		}
		return personneDAO;
	}
}
