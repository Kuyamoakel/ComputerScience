public class Department {
    private String deptID;
    private String deptName;

    public Department(String deptID, String deptName) {
        this.deptID = deptID;
        this.deptName = deptName;
    }

    // getters
    public String getDepartmentID() {
        return deptID;
    }

    public String getDepartmentName() {
        return deptName;
    }

    public void printDeptInfo() {
        System.out.println("Department ID: " + deptID);
        System.out.println("Department Name: " + deptName);
    }
}
