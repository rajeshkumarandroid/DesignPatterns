package test.rajesh.com.dao_example;

import java.util.List;

/**
 * Created by Rajesh Kumar on 01-05-2018.
 */
public interface UserDao {
    List<User> getAllUsers();
    User getUser(int id);
    void saveUser(User user);
    void removeUser(User user);
}
