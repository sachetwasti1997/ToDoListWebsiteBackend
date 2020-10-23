import com.google.inject.Guice;
import com.google.inject.Injector;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.slf4j.Logger;
import io.dropwizard.Application;
import org.slf4j.LoggerFactory;
import resource.TaskResource;

public class ToDoListApplication extends Application<ToDoListServiceConfiguration> {
    public static final String APPLICATION_NAME = "todolist-application";
    private static final Logger LOGGER = LoggerFactory.getLogger(ToDoListApplication.class);

    @Override
    public String getName(){return APPLICATION_NAME;}

    @Override
    public void initialize(Bootstrap<ToDoListServiceConfiguration> bootstrap) {
        super.initialize(bootstrap);
    }

    @Override
    public void run(ToDoListServiceConfiguration toDoListServiceConfiguration, Environment environment) throws Exception {
        Injector injector = Guice.createInjector(new ToDoListServiceModel(toDoListServiceConfiguration));
        environment.jersey().register(injector.getInstance(TaskResource.class));
        environment.jersey().register(MultiPartFeature.class);
    }

    public static void main(String [] args) throws Exception{
        new ToDoListApplication().run(args);
    }

}
