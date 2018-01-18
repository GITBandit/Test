package pl.javastart.mvcdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.javastart.mvcdemo.db.UserBase;
import pl.javastart.mvcdemo.model.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserBase userBase;


    @Autowired
    public UserController(UserBase userBase) {
        this.userBase = userBase;
    }

    @GetMapping
    @ResponseBody
    public String printUsers(){
        List<User> userList = userBase.getUserList();
    return userList.toString();
    }

    @PostMapping("/add")
    //@ResponseBody
    public String addUser(@RequestParam("imie") String imie, @RequestParam("nazwisko") String nazwisko, @RequestParam("wiek") int wiek ){

        if(imie == "")
            return "redirect:http://localhost:8080/err.html";
        else
        userBase.addUser(new User(imie,nazwisko,wiek));
            return "redirect:http://localhost:8080/success.html";

/*        userBase.addUser(new User(imie,nazwisko,wiek));

        return "redirect:http://localhost:8080/success.html";*/
    }




}
