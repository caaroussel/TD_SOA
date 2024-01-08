package fr.insa.soa.RestProject;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;

@Path("userservice")

public class UserService {
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void addUser (NHelpUser user)
    {
        System.out.println("User with the name " + user.getName() + "the age " + String.valueOf(user.getAge()) + " and mission name" + user.getMission().getName());
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public NHelpUser getUserWithID (int id)
    {
        NHelpUser user = new NHelpUser();
        user.setAge(id);
        user.setName("test");
        Mission mission = new Mission();
        mission.setName("TestMission");
        mission.setStatus("StatusMission");
        user.setMission(mission);
        return user;
    }

}