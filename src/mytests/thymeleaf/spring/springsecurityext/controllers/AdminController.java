package mytests.thymeleaf.spring.springsecurityext.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.access.expression.WebSecurityExpressionRoot;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/18/2015.
 * Project: SpringSecurity3Ext_test0
 * *******************************
 */
@Controller
public class AdminController {

    @RequestMapping("/admin")
    public String test2Mapping(ModelMap model, HttpSession session){

        model.addAttribute("testattr1", "testattr1");
        return "adminPage";
    }
}
