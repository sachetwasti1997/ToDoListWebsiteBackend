package resource;

import model.ImmutableTasks;
import model.Tasks;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("tasks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TaskResource {

    @GET
    public Tasks getName(){
        Tasks myTask = ImmutableTasks.builder()
                .taskId(1)
                .taskName("Java")
                .priority(1)
                .build();
        return myTask;
    }

}
