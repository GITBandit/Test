package pl.javastart.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CzescController {

    @GetMapping("/czesc2")
    public String showCzesc(){
        return "czesc.html";
    }

    @PostMapping("/parametry")
    @ResponseBody
    public String testParametrow (HttpServletRequest request){
        String imie = request.getParameter("imie");
        String nazwisko = request.getParameter("nazwisko");
    return "Czesc " + imie + " " + nazwisko;
    }



}
