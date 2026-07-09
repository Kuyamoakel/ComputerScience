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
    private static int idCounter = 0;
    private static final String PREFIX = "SR";
    private String taskId;
    private String title;
    private String description;
    private Priority priority;
    private Subject subject;
    private boolean completed;
    private LocalDate createdDate;
    private LocalDate deadline;

    public Task(String title, String description, Priority priority, Subject subject, LocalDate deadline) {

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Task name cannot be empty!");
        }

        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description cannot be empty!");
        } 

        if (deadline.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Deadline cannot be in the past!");
        }

        if (priority == null) {
            throw new IllegalArgumentException("Priority cannot be empty!");
        }

        if (subject == null) {
            throw new IllegalArgumentException("Subject cannot be empty!");
        }

        this.title = title;
        this.description = description;
        this.taskId = PREFIX + idCounter++;
        this.priority = priority;
        this.subject = subject;
        this.completed = false;
        this.createdDate = LocalDate.now();
        this.deadline = deadline;
    }

    public void complete() {
        this.completed = true;
    }

    public void reOpen() {
        this.completed = false;
    }

    // Getters
    public String getTitle() {
        return title;
    } 

    public String getId() {
        return taskId;
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

    @Override
    public String toString() {
        return "--------------------------" +
               "\nTitle        : " + title +
               "\nDescription  : " + description +
               "\nTaskID       : " + taskId +
               "\nPriority     : " + priority +
               "\nSubject      : " + subject +
               "\nCompleted    : " + completed +
               "\nCreatedDate  : " + createdDate +
               "\nDeadLine     : " + deadline + 
               "\n----------------------------";
    }
}