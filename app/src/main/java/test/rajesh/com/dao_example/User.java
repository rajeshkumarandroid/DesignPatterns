package test.rajesh.com.dao_example;

/**
 * Created by Rajesh Kumar on 01-05-2018.
 */
public class User {

    public User(int id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    int id;
    String name;
    String address;
}
