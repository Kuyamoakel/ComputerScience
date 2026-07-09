import java.time.LocalDate;

enum Priority {
    LOW,
    MEDIUM,
    HIGH
}

enum Subject {
    MINISTRY,
    FAITH,
    MATH,
    CODING,
    SQL
}

public class Task {
    private String title;
    private String description;
    private boolean completed;
    private static final String PREFIX = "SR";
    private static int idCounter = 0;
    private final String id;
    private final Priority priority;
    private final Subject subject;
    private final LocalDate createdDate;
    private final LocalDate deadline;

    public Task(String title, String description, Priority priority, Subject subject, LocalDate deadline) {

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Task name cannot be empty!");
        }

        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description cannot be empty!");
        } 
        
        if (priority == null) {
            throw new IllegalArgumentException("Priority cannot be empty!");
        }

        if (subject == null) {
            throw new IllegalArgumentException("Subject cannot be empty!");
        }

        if (deadline.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Deadline cannot be in the past!");
        }


        this.title = title;
        this.description = description;
        this.id = PREFIX + idCounter++;
        this.priority = priority;
        this.subject = subject;
        this.completed = false;
        this.createdDate = LocalDate.now();
        this.deadline = deadline;
    }

    public void complete() {
        this.completed = true;
    }

    public void reopen() {
        this.completed = false;
    }

    // Getters
    public String getTitle() {
        return title;
    }   

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public Priority getPriority() {
        return priority;
    }

    public Subject getSubject() {
        return subject;
    }

    // Setters
    
    public void setTitle(String title) {
        
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title must not be empty!");
        }

        this.title = title;
    }

    public void setDescription(String description) {

        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description must not be empty!");
        }

        this.description = description;
    }

    public void setPriority(Priority priority) {

        if (priority == null) {
            throw new IllegalArgumentException("Priort must not be null!");
        }

        this.priority = priority;
    }

    public void setSubject(Subject subject) {

        if (subject == null) {
            throw new IllegalArgumentException("Subject must not be null!");
        }

        this.subject = subject;
    }

    public void setDeadline(LocalDate deadline) {

        if (deadline == null) {
            throw new IllegalArgumentException("deadline must not be null!");
        }

        if (deadline.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Deadline cannot be in the past!");
        } 

        this.deadline = deadline;
    }

    @Override
    public String toString() {

        return """
        --------------------------
        Title        :  %s
        Description  :  %s 
        TaskID       :  %s
        Priority     :  %s
        Subject      :  %s
        Completed    :  %s 
        CreatedDate  :  %s
        DeadLine     :  %s
        --------------------------
                """.formatted(title, description, id,
                              priority, subject, completed,
                              createdDate, deadline);
    }
}