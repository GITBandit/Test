package pl.javastart.mvcdemo.db;

import org.springframework.stereotype.Repository;
import pl.javastart.mvcdemo.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserBase {

    private List<User> userList = new ArrayList<>();


    public void addUser (User user){
        userList.add(user);
    }

    public List<User> getUserList() {
        return userList;
    }
}
