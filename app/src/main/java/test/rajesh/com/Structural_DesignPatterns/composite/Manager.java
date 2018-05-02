package test.rajesh.com.Structural_DesignPatterns.composite;

import android.util.Log;

/**
 * Created by Rajesh Kumar on 02-05-2018.
 */
public class Manager implements Employee {

    int id;
    String name;
    String address;
    public Manager(int id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    @Override
    public void showEmployeeDetails() {
        Log.e("Manager details ","<><><>"+name);
    }
}
