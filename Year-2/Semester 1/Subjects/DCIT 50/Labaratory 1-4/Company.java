import java.util.ArrayList;

public class Company {
    ArrayList<Task> tasks;
    ArrayList<Employee> employees;
    ArrayList<Department> departments;

    public Company() {
        this.tasks = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    // Employee

    public Employee findEmployee(String employeeId) {

        for (Employee e : employees) {
            if (e.getEmployeeId().equals(employeeId)) {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {

        Employee result = findEmployee(employee.getEmployeeId());

        if (result == null) {
            employees.add(employee);
            System.out.println("Succesfully Added!");
        } else {
            System.out.println("Employee ID Already Exist!");
        }
    }

    // Task

    public Task findTask(String taskId) {

        for (Task t : tasks) {
            if (t.getTaskId().equals(taskId)) {
                return t;
            }
        }
        return null;
    }

    public void addTask(Task task) {

        Task result = findTask(task.getTaskId());

        if (result == null) {
            addTask(task);
            System.out.println("Succesfully Added!");
        } else {
            System.out.println("Task ID already exists!");
            System.out.println("Task creation will be cancelled. . .");
        }
    }

    public void checkTasks() {
         for (Employee employee : employees) {
            employee.printEmployees();
        }
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    // departments

    public void addDepartment(Department department) {

        for (Department d : departments) {
            if (d.getDepartmentID().equals(department.getDepartmentID())) {
                System.out.println("Department ID Already Exist");
                return;
            }
        }

        departments.add(department);
        System.out.println("Departmetn Succesfully Added!");
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

}