import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class ToDoListServiceConfiguration extends Configuration {

    @NotNull
    @Valid
    private DataSourceFactory database = new DataSourceFactory();

    @Valid
    @NotNull
    @JsonProperty
    private String applicationName;

    @NotNull
    @JsonProperty
    private String environmentName;

    public String getApplicationName(){return applicationName;}

    public String getEnvironmentName(){return environmentName;}

    @JsonProperty
    public DataSourceFactory getDataSourceFactory(){
        return database;
    }

}
