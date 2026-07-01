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

        this.title = title;
        this.description = description;
        this.priority = priority;
        this.subject = subject;
        this.completed = false;
        this.createdDate = LocalDate.now();
        this.deadline = deadline;
    }

    // Getters
    public String getTitle() {
        return title;
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
               "\nPriority     : " + priority +
               "\nSubject      : " + subject +
               "\nCompleted    : " + completed +
               "\nCreatedDate  : " + createdDate +
               "\nDeadLine     : " + deadline + 
               "\n----------------------------";
    }
}