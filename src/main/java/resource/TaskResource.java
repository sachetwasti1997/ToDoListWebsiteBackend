package resource;

import databasedaoimplementation.TaskDAOimplementation;
import model.Task;
import service.TaskService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;

@Path("/tasks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TaskResource {

    private final TaskService taskService;

    @Inject
    public TaskResource(TaskService taskService){
        this.taskService = taskService;
    }

    @GET
    public Response getTasks(){
        try {
            List<Task> taskList = taskService.getTasks();
            if (taskList == null) {
                return Response.status(404).entity("No task found in the server").build();
            }
            return Response.ok().entity(taskList).build();
        } catch (SQLException e){
            return Response.status(500).entity(e.getMessage()).build();
        }
    }

    @GET
    @Path("/{id}")
    public Response getTaskById(@PathParam("id")int id){
        try{
        Task task = taskService.getTaskById(id);
        if (task == null){
            return Response.status(404).entity("No task found with the given id").build();
        }
        return Response.ok().entity(task).build();
        }catch (SQLException e){
            return Response.status(500).entity(e.getMessage()).build();
        }
    }

    @POST
    public Response addTask(Task task){
        try {
            if(task.getTask_name().equals("") || task.getTask_priority() == 0){
                return Response.status(Response.Status.BAD_REQUEST).entity("Cannot build tasks as the fields task name and task priority is empty").build();
            }
            Task taskAdded = taskService.addTask(task);
            return Response.ok().entity(taskAdded).build();
        }catch (SQLException e){
            return Response.status(500).entity(e.getMessage()).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deleteTask(@PathParam("id")int id){
        try {
            String message = taskService.deleteTask(id);
            if (message == null) {
                return Response.status(404).entity("Cannot find task with given id").build();
            }
            return Response.ok().entity(message).build();
        }catch (SQLException e){
            return Response.status(500).entity(e.getMessage()).build();
        }
    }

    @PUT
    @Path("/{id}")
    public Response updateTask(@PathParam("id")int id, Task task){
        if (id != task.getTask_id()){
            return Response.status(400).entity("The task id in body and path must be equal").build();
        }
        try {
            Task updatedTask = taskService.updateTaskById(id, task);
            if (updatedTask == null) {
                return Response.status(404).entity("Cannot find task with given id").build();
            }
            return Response.ok().entity(updatedTask).build();
        }catch (SQLException e){
            return Response.status(500).entity(e.getMessage()).build();
        }
    }

}
