package ch.better.u.rest;

import ch.better.u.domain.aggregate.Improvement;
import ch.better.u.domain.usecase.ImprovementManager;
import ch.better.u.domain.usecase.ImprovementReader;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import java.util.List;

@Path("/improvement")
@Dependent
public class ImprovementResource {

    @Inject
    ImprovementManager improvementManager;

    @GET
    @Path("/list")
    public List<Improvement> getImprovments() {
        return ImprovementReader.readDataLineByLine();
    }

    @POST
    @Path("/add")
    public void addImprovement(@RequestBody Improvement improvement) {
        improvementManager.add(improvement);
    }

}
