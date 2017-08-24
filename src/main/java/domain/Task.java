package domain;

import java.util.List;

/**
 * Created by User on 20.08.2017.
 */
public class Task {
    private long id;
    private String name;
    private User taskDeveloper;
    private User taskManager;
    private String taskDescription;
    private List<Comment> comments;
    private int status;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getTaskDeveloper() {
        return taskDeveloper;
    }

    public void setTaskDeveloper(User taskDeveloper) {
        this.taskDeveloper = taskDeveloper;
    }

    public User getTaskManager() {
        return taskManager;
    }

    public void setTaskManager(User taskManager) {
        this.taskManager = taskManager;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}