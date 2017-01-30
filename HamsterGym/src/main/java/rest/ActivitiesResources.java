package rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import rest.dto.ActivitiesDto;
import Lalunaa.HamsterGym.Activities;


@Path("/activities")
@Stateless
public class ActivitiesResources {
	
	Mapper mapper = new DozerBeanMapper();
	
    @PersistenceContext
    EntityManager entityManager;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
    	List<ActivitiesDto> result = new ArrayList<ActivitiesDto>();
    	for(Activities a: entityManager.createNamedQuery("activities.all",Activities.class).getResultList()){
        	result.add(mapper.map(a, ActivitiesDto.class));
        }
        return Response.ok(new GenericEntity<List<ActivitiesDto>>(result){}).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") int id) {
    	Activities result = entityManager.createNamedQuery("activities.id", Activities.class)
                .setParameter("id", id)
                .getSingleResult();
        if (result == null) {
            return Response.status(404).build();
        }
        return Response.ok(result).build();
    }
	
}