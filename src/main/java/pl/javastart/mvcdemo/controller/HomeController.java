package pl.javastart.mvcdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.javastart.mvcdemo.component.RandomGenerator;

@Controller
public class HomeController {

    private RandomGenerator generator;

    @Autowired
    public HomeController(RandomGenerator generator) {
        this.generator = generator;
    }
/*

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "Hello world from Spring";
    }
*/

    @GetMapping("/jeden")
    @ResponseBody
    public String jeden(){
        return "Hello jeden";
    }

    @GetMapping("/losuj")
    @ResponseBody
    public String losowanie(){
        return "Losowa liczba to " + generator.getRandomInt();
    }

}
