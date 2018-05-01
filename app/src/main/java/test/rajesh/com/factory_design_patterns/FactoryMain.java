package test.rajesh.com.factory_design_patterns;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import test.rajesh.com.dao_example.R;

/**
 * Created by Rajesh Kumar on 01-05-2018.
 */
public class FactoryMain extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlanFactory planFactory = new PlanFactory();

        Plan plan = planFactory.getPlanType("Commerical");
        plan.getPlan();
        Log.e("plan bill is ","<><><>"+plan.PrepateBill(20));
    }
}
