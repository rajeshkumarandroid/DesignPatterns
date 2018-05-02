package test.rajesh.com.Structural_DesignPatterns.composite;

import java.util.ArrayList;

/**
 * Created by Rajesh Kumar on 02-05-2018.
 */
public class CompanyDB implements Employee {

    ArrayList<Employee> employees = new ArrayList<>();

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee e){
        employees.add(e);
    }


    public void removeEmployee(Employee e){
        employees.remove(e);
    }

    @Override
    public void showEmployeeDetails() {

        for(Employee e:employees){
            e.showEmployeeDetails();
        }
    }
}
