//package fr.treeptik.tpstruts.dao.impl;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import fr.treeptik.tpstruts.dao.PersonneDAO;
//import fr.treeptik.tpstruts.exception.DAOException;
//import fr.treeptik.tpstruts.model.Personne;
//
//public class PersonneFileDAO implements PersonneDAO {
//
//	File file = new File("/home/stagiaire/personnes.csv");
//
//	private Integer count = null;
//	
//	@Override
//	public Personne create(Personne personne) throws DAOException {
//		FileWriter writer = null;
//		count = count == null ? this.initCount() : count;
//		personne.setId(++count);
//		try {
//			writer = new FileWriter(file, true);
//			StringBuilder builder = new StringBuilder();
//			builder.append(personne.getId());
//			builder.append(";");
//			builder.append(personne.getNom());
//			builder.append(";");
//			builder.append(personne.getPrenom());
//			builder.append(";");
//			builder.append(personne.getAge());
//			builder.append(";");
//			builder.append(personne.getEmail());
//			builder.append(";");
//			builder.append(personne.getUsername());
//			builder.append(";");
//			builder.append(personne.getPassword());
//			writer.write(builder.toString());
//			writer.append("\n");
//
//		} catch (IOException e) {
//			throw new DAOException("Erreur creation personne", e);
//		} finally {
//			try {
//				writer.close();
//			} catch (IOException e) {
//				throw new DAOException("Erreur creation personne", e);
//			}
//		}
//
//		return personne;
//	}
//
//	@Override
//	public Personne find(Personne personne) throws DAOException {
//		Personne newPersonne = null;
//		FileReader reader = null;
//		BufferedReader buffReader = null;
//		try {
//			reader = new FileReader(file);
//			buffReader = new BufferedReader(reader);
//			String line = "";
//			while (buffReader.ready()) {
//				line = buffReader.readLine();
//				String[] personneText = line.split(";");
//				if (personne.getUsername().equals(personneText[4])
//						&& personne.getPassword().equals(personneText[5])) {
//					newPersonne = new Personne(Integer.parseInt(personneText[0]),personneText[1],
//							personneText[2], Integer.parseInt(personneText[3]),
//							personneText[4], personneText[5], personneText[6]);
//				}
//
//			}
//
//		} catch (IOException e) {
//			throw new DAOException("erreur findall de type ioexception", e);
//		} finally {
//			try {
//				buffReader.close();
//				reader.close();
//			} catch (IOException e) {
//				throw new DAOException("erreur findall de type ioexception", e);
//
//			}
//
//		}
//		return newPersonne;
//	}
//
//	@Override
//	public List<Personne> findAllPersonne() throws DAOException, NumberFormatException {
//		List<Personne> personnes = new ArrayList<Personne>();
//		FileReader reader = null;
//		BufferedReader buffReader = null;
//		try {
//			reader = new FileReader(file);
//			buffReader = new BufferedReader(reader);
//			String line = "";
//			while (buffReader.ready()) {
//				line = buffReader.readLine();
//				String[] personneText = line.split(";");
//				Personne personne = new Personne(Integer.parseInt(personneText[0]),personneText[1],
//						personneText[2], Integer.parseInt(personneText[3]),
//						personneText[4], personneText[5], personneText[6]);
//				personnes.add(personne);
//
//			}
//
//		} catch (IOException e) {
//			throw new DAOException("erreur findall de type ioexception", e);
//		} finally {
//			try {
//				buffReader.close();
//				reader.close();
//			} catch (IOException e) {
//				throw new DAOException("erreur findall de type ioexception", e);
//
//			}
//
//		}
//
//		return personnes;
//	}
//
//	@Override
//	public <S extends Personne> S save(S entity) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends Personne> Iterable<S> save(Iterable<S> entities) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Personne findOne(Integer id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean exists(Integer id) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public Iterable<Personne> findAll(Iterable<Integer> ids) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public long count() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void delete(Integer id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void delete(Personne entity) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void delete(Iterable<? extends Personne> entities) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteAll() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public List<Personne> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	private int initCount() throws DAOException {
//		return this.findAll().stream().mapToInt(p -> p.getId()).max()
//				.getAsInt();
//	}
//
//}
