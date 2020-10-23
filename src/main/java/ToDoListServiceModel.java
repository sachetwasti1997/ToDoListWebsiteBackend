import com.google.inject.AbstractModule;

public class ToDoListServiceModel extends AbstractModule {
    private final ToDoListServiceConfiguration configuration;

    public ToDoListServiceModel(ToDoListServiceConfiguration configuration){
        this.configuration = configuration;
    }

}
