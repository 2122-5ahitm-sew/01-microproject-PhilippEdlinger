package at.htl.boundary;

import at.htl.entity.Plant;
import at.htl.entity.PlantType;
import at.htl.repository.PlantRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/plant")
public class PlantResource {

    @Inject
    PlantRepository plantRepository;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createPlant(
            @FormParam("plantName") String plantName,
            @FormParam("plantType") String plantType
    ){

        Plant plant = new Plant();
        plant.setPlantName(plantName);
        plant.setPlantType(PlantType.valueOf(plantType));

        plantRepository.save(plant);

        return Response
                .accepted(plant)
                .build();

    }

}
