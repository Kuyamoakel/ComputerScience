public class Position {
    private String positionName;
    private Department department;

    public Position(String positionName, Department department) {
        this.positionName = positionName;
        this.department = department;
    }

    public String getPositionName() {
        return positionName;
    }

    public Department getDepartment() {
        return department;
    }

    public void printPositionInfo() {
        System.out.println("Position: " + positionName);
        System.out.println("Department: " + department.getDepartmentName());
    }
}