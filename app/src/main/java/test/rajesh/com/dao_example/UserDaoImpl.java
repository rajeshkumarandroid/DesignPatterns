package test.rajesh.com.dao_example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajesh Kumar on 01-05-2018.
 */
public class UserDaoImpl implements UserDao {


    List<User> users;

    public UserDaoImpl(){
        users = new ArrayList<>();
        users.add(new User(1,"Rajesh","kasimkota"));
        users.add(new User(2,"Kumar","Visakhaptnam"));
        users.add(new User(3,"Raaz","Kakinada"));
    }
    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUser(int id) {
        return users.get(id-1);
    }

    @Override
    public void saveUser(User user) {

        users.add(user);
    }

    @Override
    public void removeUser(User user) {
        users.remove(user);
    }
}
