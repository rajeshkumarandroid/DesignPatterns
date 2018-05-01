package test.rajesh.com.factory_design_patterns;

/**
 * Created by Rajesh Kumar on 01-05-2018.
 */
public abstract class Plan {
    int rate ;
    public abstract void getPlan();


    public int PrepateBill(int intrest){

        return rate*intrest;
    }

}
