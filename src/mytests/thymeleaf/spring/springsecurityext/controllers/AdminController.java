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
public class AdminController {

    @RequestMapping("/admin/p1")
    public String test2Mapping(ModelMap model, HttpSession session){

        model.addAttribute("roleName", "ROLE_ADMIN");
        return "adminPage1";
    }
}
