package model;

public class Task {
    int task_id;
    String task_name;
    String task_description;
    int task_priority;

    public Task(){}

    public Task(String task_name, int task_priority, String task_description) {
        this.task_name = task_name;
        this.task_priority = task_priority;
        this.task_description = task_description;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public int getTask_priority() {
        return task_priority;
    }

    public void setTask_priority(int task_priority) {
        this.task_priority = task_priority;
    }

    public void setTask_description(String task_description){this.task_description = task_description;}

    public String getTask_description(){return task_description;}

    @Override
    public String toString() {
        return "Task[ task_id= "+task_id+", task_name= "+task_name+", task_priority= "+task_priority+
                ", task_description= "+task_description+" ]";
    }
}
