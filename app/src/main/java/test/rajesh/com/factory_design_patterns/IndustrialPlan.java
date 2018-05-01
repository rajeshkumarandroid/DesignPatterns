package test.rajesh.com.factory_design_patterns;

/**
 * Created by Rajesh Kumar on 01-05-2018.
 */
public class IndustrialPlan extends Plan {
    int rate;
    @Override
    public void getPlan() {
        rate = 10;
    }
}
