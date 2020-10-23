package model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Tasks}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTasks.builder()}.
 */
@Generated(from = "Tasks", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableTasks implements Tasks {
  private final @Nullable Integer taskId;
  private final String taskName;
  private final Integer priority;

  private ImmutableTasks(
      @Nullable Integer taskId,
      String taskName,
      Integer priority) {
    this.taskId = taskId;
    this.taskName = taskName;
    this.priority = priority;
  }

  /**
   * @return
   */
  @JsonProperty("taskId")
  @Override
  public @Nullable Integer getTaskId() {
    return taskId;
  }

  /**
   * @return
   */
  @JsonProperty("taskName")
  @Override
  public String getTaskName() {
    return taskName;
  }

  /**
   * @return
   */
  @JsonProperty("priority")
  @Override
  public Integer getPriority() {
    return priority;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tasks#getTaskId() taskId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for taskId (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTasks withTaskId(@Nullable Integer value) {
    if (Objects.equals(this.taskId, value)) return this;
    return new ImmutableTasks(value, this.taskName, this.priority);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tasks#getTaskName() taskName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for taskName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTasks withTaskName(String value) {
    String newValue = Objects.requireNonNull(value, "taskName");
    if (this.taskName.equals(newValue)) return this;
    return new ImmutableTasks(this.taskId, newValue, this.priority);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tasks#getPriority() priority} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for priority
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTasks withPriority(Integer value) {
    Integer newValue = Objects.requireNonNull(value, "priority");
    if (this.priority.equals(newValue)) return this;
    return new ImmutableTasks(this.taskId, this.taskName, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTasks} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTasks
        && equalTo((ImmutableTasks) another);
  }

  private boolean equalTo(ImmutableTasks another) {
    return Objects.equals(taskId, another.taskId)
        && taskName.equals(another.taskName)
        && priority.equals(another.priority);
  }

  /**
   * Computes a hash code from attributes: {@code taskId}, {@code taskName}, {@code priority}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Objects.hashCode(taskId);
    h += (h << 5) + taskName.hashCode();
    h += (h << 5) + priority.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Tasks} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Tasks")
        .omitNullValues()
        .add("taskId", taskId)
        .add("taskName", taskName)
        .add("priority", priority)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Tasks", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Tasks {
    @Nullable Integer taskId;
    @Nullable String taskName;
    @Nullable Integer priority;
    @JsonProperty("taskId")
    public void setTaskId(@Nullable Integer taskId) {
      this.taskId = taskId;
    }
    @JsonProperty("taskName")
    public void setTaskName(String taskName) {
      this.taskName = taskName;
    }
    @JsonProperty("priority")
    public void setPriority(Integer priority) {
      this.priority = priority;
    }
    @Override
    public Integer getTaskId() { throw new UnsupportedOperationException(); }
    @Override
    public String getTaskName() { throw new UnsupportedOperationException(); }
    @Override
    public Integer getPriority() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTasks fromJson(Json json) {
    ImmutableTasks.Builder builder = ImmutableTasks.builder();
    if (json.taskId != null) {
      builder.taskId(json.taskId);
    }
    if (json.taskName != null) {
      builder.taskName(json.taskName);
    }
    if (json.priority != null) {
      builder.priority(json.priority);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Tasks} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Tasks instance
   */
  public static ImmutableTasks copyOf(Tasks instance) {
    if (instance instanceof ImmutableTasks) {
      return (ImmutableTasks) instance;
    }
    return ImmutableTasks.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTasks ImmutableTasks}.
   * @return A new ImmutableTasks builder
   */
  public static ImmutableTasks.Builder builder() {
    return new ImmutableTasks.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTasks ImmutableTasks}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Tasks", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TASK_NAME = 0x1L;
    private static final long INIT_BIT_PRIORITY = 0x2L;
    private long initBits = 0x3L;

    private @Nullable Integer taskId;
    private @Nullable String taskName;
    private @Nullable Integer priority;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Tasks} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(Tasks instance) {
      Objects.requireNonNull(instance, "instance");
      @Nullable Integer taskIdValue = instance.getTaskId();
      if (taskIdValue != null) {
        taskId(taskIdValue);
      }
      taskName(instance.getTaskName());
      priority(instance.getPriority());
      return this;
    }

    /**
     * Initializes the value for the {@link Tasks#getTaskId() taskId} attribute.
     * @param taskId The value for taskId (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("taskId")
    public final Builder taskId(@Nullable Integer taskId) {
      this.taskId = taskId;
      return this;
    }

    /**
     * Initializes the value for the {@link Tasks#getTaskName() taskName} attribute.
     * @param taskName The value for taskName 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("taskName")
    public final Builder taskName(String taskName) {
      this.taskName = Objects.requireNonNull(taskName, "taskName");
      initBits &= ~INIT_BIT_TASK_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Tasks#getPriority() priority} attribute.
     * @param priority The value for priority 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("priority")
    public final Builder priority(Integer priority) {
      this.priority = Objects.requireNonNull(priority, "priority");
      initBits &= ~INIT_BIT_PRIORITY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTasks ImmutableTasks}.
     * @return An immutable instance of Tasks
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTasks build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTasks(taskId, taskName, priority);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_TASK_NAME) != 0) attributes.add("taskName");
      if ((initBits & INIT_BIT_PRIORITY) != 0) attributes.add("priority");
      return "Cannot build Tasks, some of required attributes are not set " + attributes;
    }
  }
}
