package test.rajesh.com.factory_design_patterns;

/**
 * Created by Rajesh Kumar on 01-05-2018.
 */
public class PlanFactory  {

    public Plan getPlanType(String  plan_type){
                if(plan_type.equalsIgnoreCase("")){
                    return null;
                }else if(plan_type.equalsIgnoreCase("Commerical")){
                    return new CommericalPlan();
                }else if(plan_type.equalsIgnoreCase("Industrail")){
                    return new IndustrialPlan();
                }


        return null;



    }
}
