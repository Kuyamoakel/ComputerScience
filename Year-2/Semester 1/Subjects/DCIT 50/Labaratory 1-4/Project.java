public class Project extends Task {
    private String projectName;


    public Project(String taskId, String taskName, String taskDesc, Department department, String projectName) {
        super(taskId, taskName, taskDesc, department);
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    @Override 
    public void printTask() {
        System.out.println("ProjectName: " + projectName);
        super.printTask();
    }
}