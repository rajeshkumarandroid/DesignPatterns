package test.rajesh.com.Structural_DesignPatterns.composite;

import android.util.Log;

/**
 * Created by Rajesh Kumar on 02-05-2018.
 */
public class Developer implements Employee {

    int id;
    String name;
    String address;
    public Developer(int id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    @Override
    public void showEmployeeDetails() {
        Log.e("developer details ","<><><>"+name);
    }
}
