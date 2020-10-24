import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class ToDoListServiceConfiguration extends Configuration {

    @Valid
    @NotNull
    @JsonProperty
    private String applicationName;

    @NotNull
    @JsonProperty
    private String environmentName;

    public String getApplicationName(){return applicationName;}

    public String getEnvironmentName(){return environmentName;}

}
