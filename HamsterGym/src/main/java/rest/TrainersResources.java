package rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import rest.dto.TrainerDto;
import Lalunaa.HamsterGym.Trainer;

@Path("/trainers")
@Stateless
public class TrainersResources {
	
	Mapper mapper = new DozerBeanMapper();
	
    @PersistenceContext
    EntityManager entityManager;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
    	List<TrainerDto> result = new ArrayList<TrainerDto>();
    	for(Trainer t: entityManager.createNamedQuery("trainer.all",Trainer.class).getResultList()){
        	result.add(mapper.map(t, TrainerDto.class));
        }
        return Response.ok(new GenericEntity<List<TrainerDto>>(result){}).build();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response Add(Trainer trainer) {
        entityManager.persist(trainer);
        return Response.ok(trainer.getId()).build();
    }
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(@PathParam("id") int id){
		Trainer result = entityManager.createNamedQuery("trainer.id", Trainer.class).setParameter("id", id).getSingleResult();
		if(result==null){
			return Response.status(404).build();
		}
		return Response.ok(result).build();
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(@PathParam("id") int id, Trainer t){
		Trainer result = entityManager.createNamedQuery("trainer.id", Trainer.class).setParameter("id", id).getSingleResult();
		if(result==null){
			return Response.status(404).build();
		}
		result.setName(t.getName());
		result.setSurname(t.getSurname());
		entityManager.persist(result);
		return Response.ok().build();
	}
	
	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam("id") int id){
		Trainer result = entityManager.createNamedQuery("trainer.id", Trainer.class).setParameter("id", id).getSingleResult();
		if(result==null){
			return Response.status(404).build();
		}
		entityManager.remove(result);
		return Response.ok().build();
	}
	
}