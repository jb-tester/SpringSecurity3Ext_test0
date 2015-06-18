package mytests.thymeleaf.spring.springsecurityext.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/18/2015.
 * Project: SpringSecurity3Ext_test0
 * *******************************
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test2Mapping(ModelMap model, HttpSession session){
        model.addAttribute("testattr1", "testattr1");
        return "testPage";
    }
}
