package fr.treeptik.tpstruts.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.treeptik.tpstruts.exception.DAOException;
import fr.treeptik.tpstruts.model.Personne;

public interface PersonneDAO extends JpaRepository<Personne, Integer> {

	@Query("select p from Personne p")
	List<Personne> findAllPersonne() throws DAOException;

	@Query("select p from Personne p where p.username =?1")
	Personne findByUsername(String username);
	
}
