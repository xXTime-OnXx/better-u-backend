package ch.better.u.rest;

import ch.better.u.domain.aggregate.Improvement;
import ch.better.u.domain.usecase.ImprovementReader;
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
