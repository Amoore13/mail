package com.dmitryk;

import com.dmitryk.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Dmitry on 06.04.2018.
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String view(@RequestParam(value = "name",
    required = false, defaultValue = "stranger")String name, Model model) {
        model.addAttribute("msg","Hello "+name);
        return "index";
    }

    @GetMapping("/json")
    @ResponseBody
    public String raw() {
        return "JSON body";
    }

    @GetMapping("/user")
    public String user(Model model) {
        List<User> list = Arrays.asList(new User("dmitry","k","k@email.ru"),
                new User("serg", "s", "serg@mail.ru"));
    }


}
