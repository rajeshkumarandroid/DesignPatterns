package test.rajesh.com.Structural_DesignPatterns.composite;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import test.rajesh.com.dao_example.R;

/**
 * Created by Rajesh Kumar on 02-05-2018.
 */
public class ManageCompanyDetails extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Developer developer1 = new Developer(1,"rajesh","Kasimkota");
        Developer developer2 = new Developer(2,"kumar","Kasimkota");
        CompanyDB companyDB = new CompanyDB();
        companyDB.addEmployee(developer1);
        companyDB.addEmployee(developer2);

        Manager manager1 = new Manager(3,"Raaz","Vizag");
        Manager manager2 = new Manager(3,"Raaz kumar","Vizag");
        CompanyDB companyDB1 = new CompanyDB();
        companyDB1.addEmployee(manager1);
        companyDB1.addEmployee(manager2);

        CompanyDB final_adding = new CompanyDB();
        final_adding.addEmployee(companyDB);
        final_adding.addEmployee(companyDB1);
        final_adding.showEmployeeDetails();
    }
}
