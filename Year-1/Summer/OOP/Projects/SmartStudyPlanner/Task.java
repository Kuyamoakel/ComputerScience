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

    public Task(String title, String description, Priority priority, Subject subject, boolean completed, LocalDate deadline) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.subject = subject;
        this.completed = completed;
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
        
        if (title.isEmpty()) {
            System.out.println("Title must not be empty!");
            return;
        }

        this.title = title;
    }

    public void setDescription(String description) {

        if (description.isEmpty()) {
            System.out.println("Description must not be empty!");
            return;
        }

        this.description = description;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
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