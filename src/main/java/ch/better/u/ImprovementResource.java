package ch.better.u;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/improvement")
public class ImprovementResource {
    @GET
    @Path("/list")
    public List<Improvement> getImprovments() {
        return ImprovementReader.readDataLineByLine();
    }

}
