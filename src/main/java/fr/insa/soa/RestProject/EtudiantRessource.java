package fr.insa.soa.RestProject;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.core.Context;


@Path("etudiant")
public class EtudiantRessource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Etudiant getEtudiant(@Context UriInfo uriInfo) { //UriInfo est utilisee pour acceder aux informations des requetes
		Etudiant etudiant= new Etudiant(); 
		etudiant.setNom("N");
		etudiant.setPrenom("G"); 
		etudiant.setID(01); 
		etudiant.addLink(getUriforSelf(uriInfo, etudiant), "self", "GET");
		etudiant.addLink(getUriforStage(uriInfo), "Stage", "GET");
		return etudiant; 
	}
	
	private String getUriforStage(UriInfo uriInfo) {
		String url = uriInfo.getBaseUriBuilder()// http://localhost:8080/RestProject/webapi
					.path(StageRessource.class)
					.build()
					.toString();
		return url; 
		
	}
	
	private String getUriforSelf(UriInfo uriInfo, Etudiant etudiant) {
		String url = uriInfo.getBaseUriBuilder()// http://localhost:8080/RestProject/webapi
				.path(EtudiantRessource.class)
				.path(Long.toString(etudiant.getId())) 
				.build()
				.toString();
	return url; 
	}
	
	
	
	
	//@GET
	//@Path("/{idEtudiant}")
	//@Produces(MediaType.APPLICATION_JSON)
	//public Etudiant getEtudiant(@PathParam("idEtudiant") int id) {
		//Etudiant etudiant= new Etudiant(); 
		//etudiant.setNom("Farhat"); 
		//etudiant.setPrenom("Salma"); 
	//	return etudiant; 
	//}
	
	/*@POST
	@Path("/{idEtudiant}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addEtudiant(Etudiant etudNouv) {
		System.out.println("Ajout de l'etudiant " + etudNouv.getNom()+ " " + etudNouv.getPrenom() + " Yess done");
		System.out.println("Son binome est " + etudNouv.getBinome().getPrenom() + " " + etudNouv.getBinome().getNom() ); 
	}
	

}*/
	
}	
