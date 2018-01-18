package pl.javastart.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestyController {

    @RequestMapping("/test1")
    @ResponseBody
    public String sayCzesc(){
        return "string";
    }

}
