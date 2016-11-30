package service;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import modele.Utilisateurs;

@Path("dto")
public class ServiceRest {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jdbc");

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public MessageDTO getDTO(@QueryParam("email") String email, @QueryParam("password") String password) {
		MessageDTO dto = new MessageDTO();
		dto.setBienvenue(recherche(email, password));
		dto.setRole("administrateur");
		return dto;
}
	
	private String recherche(String email, String password) {
		
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		Utilisateurs user = (Utilisateurs) em.createNativeQuery("SELECT * FROM UTILISATEURS WHERE EMAIL='"+email+"' AND PASSWORD='"+password+"'", Utilisateurs.class).getSingleResult();
		return user.getNom()+" "+user.getPrenom();
		} catch (Exception e) { return "inconnu"; }
		finally {
			em.getTransaction().commit();
			em.close();
		}		
	}
}
