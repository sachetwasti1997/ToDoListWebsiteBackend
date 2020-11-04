package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

@JsonSerialize
@JsonDeserialize(as = ImmutableTasks.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Value.Immutable
public interface Tasks {

    /**
     *
     * @return
     */
    @Nullable
    Integer getTaskId();

    /**
     * @return
     */
    @NotNull
    String getTaskName();

    /**
     * @return
     */
    @NotNull
    Integer getPriority();

    /**
     * @return
     */
    String getTaskDescription();

}
