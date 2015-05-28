package fr.treeptik.tpstruts.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.treeptik.tpstruts.dao.PersonneDAO;
import fr.treeptik.tpstruts.exception.DAOException;
import fr.treeptik.tpstruts.model.Personne;

public class PersonneFileDAO implements PersonneDAO {

	File file = new File("/home/stagiaire/personnes.csv");

	@Override
	public Personne create(Personne personne) throws DAOException {
		FileWriter writer = null;
		try {
			writer = new FileWriter(file, true);
			StringBuilder builder = new StringBuilder();
			builder.append(personne.getNom());
			builder.append(";");
			builder.append(personne.getPrenom());
			builder.append(";");
			builder.append(personne.getAge());
			builder.append(";");
			builder.append(personne.getEmail());
			builder.append(";");
			builder.append(personne.getUsername());
			builder.append(";");
			builder.append(personne.getPassword());
			writer.write(builder.toString());
			writer.append("\n");

		} catch (IOException e) {
			throw new DAOException("Erreur creation personne", e);
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				throw new DAOException("Erreur creation personne", e);
			}
		}

		return personne;
	}

	@Override
	public void remove(Personne personne) {
		// TODO Auto-generated method stub

	}

	@Override
	public Personne find(Personne personne) throws DAOException {
		Personne newPersonne = null;
		FileReader reader = null;
		BufferedReader buffReader = null;
		try {
			reader = new FileReader(file);
			buffReader = new BufferedReader(reader);
			String line = "";
			while (buffReader.ready()) {
				line = buffReader.readLine();
				String[] personneText = line.split(";");
				if (personne.getUsername().equals(personneText[4])
						&& personne.getPassword().equals(personneText[5])) {
					newPersonne = new Personne(personneText[0],
					personneText[1], Integer.parseInt(personneText[2]),
					personneText[3], personneText[4], personneText[5]);
				}

			}

		} catch (IOException e) {
			throw new DAOException("erreur findall de type ioexception", e);
		} finally {
			try {
				buffReader.close();
				reader.close();
			} catch (IOException e) {
				throw new DAOException("erreur findall de type ioexception", e);

			}

		}
		return newPersonne;
	}

	@Override
	public List<Personne> findAll() throws DAOException {
		List<Personne> personnes = new ArrayList<Personne>();
		FileReader reader = null;
		BufferedReader buffReader = null;
		try {
			reader = new FileReader(file);
			buffReader = new BufferedReader(reader);
			String line = "";
			while (buffReader.ready()) {
				line = buffReader.readLine();
				String[] personneText = line.split(";");
				Personne personne = new Personne(personneText[0],
						personneText[1], Integer.parseInt(personneText[2]),
						personneText[3], personneText[4], personneText[5]);
				personnes.add(personne);

			}

		} catch (IOException e) {
			throw new DAOException("erreur findall de type ioexception", e);
		} finally {
			try {
				buffReader.close();
				reader.close();
			} catch (IOException e) {
				throw new DAOException("erreur findall de type ioexception", e);

			}

		}

		return personnes;
	}

	@Override
	public Personne update(Personne personne) {
		// TODO Auto-generated method stub
		return null;
	}

}
