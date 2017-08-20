package domain;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 20.08.2017.
 */
public class Project {
    private long id;
    private String name;
    private User projectDeveloper;
    private User projectManager;
    private List<Task> tasks;
    private String projectDescription;

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public User getProjectDeveloper() {
        return projectDeveloper;
    }

    public void setProjectDeveloper(User projectDeveloper) {
        this.projectDeveloper = projectDeveloper;
    }

    public User getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(User projectManager) {
        this.projectManager = projectManager;
    }

    private Date createDate;

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

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
