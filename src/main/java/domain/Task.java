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

}