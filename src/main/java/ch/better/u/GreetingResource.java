package ch.better.u;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/")
public class GreetingResource {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("/improvements")
    @Produces(MediaType.TEXT_PLAIN)
    public List<String> getImprovementList() {
        List<String> improvements = new ArrayList<>();
        improvements.add("Brush teeth");
        improvements.add("Clean kitchen");
        return improvements;
    }

}
