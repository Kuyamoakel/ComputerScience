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
    private Priority priority;
    private Subject subject;
    private String completed;
    private String createdDate;
    private String deadline;

    Task(String title, String description, Priority priority, Subject subject, String completed, String createdDate, String deadline) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.subject = subject;
        this.completed = completed;
        this.createdDate = createdDate;
        this.deadline = deadline;
    }

    // Getters
    public String getTitle() {
        return title;
    } 

    public String getDescription() {
        return description;
    }

    public String getCompleted() {
        return completed;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public String getDeadline() {
        return deadline;
    }

    // Setters
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setComplted(String completed) {
        this.completed = completed;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Title: " + title +
               "\nDescription: " + description +
               "\nPriority: " + priority +
               "\nSubject: " + subject +
               "\nCompleted: " + completed +
               "\nCreatedDate: " + createdDate +
               "\nDeadLine: " + deadline;
    }
}