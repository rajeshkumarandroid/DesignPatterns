package test.rajesh.com.dao_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserDao userDao = new UserDaoImpl();

        for(int i=0;i<userDao.getAllUsers().size();i++){
            Log.e("all users ","<><><><>"+userDao.getAllUsers().get(i).getName());
        }

        Log.e("user name based on id","<>><>"+userDao.getUser(1).getName());




    }
}
