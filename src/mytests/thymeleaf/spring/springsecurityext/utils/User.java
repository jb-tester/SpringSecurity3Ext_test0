package mytests.thymeleaf.spring.springsecurityext.utils;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/23/2015.
 * Project: SpringSecurity3Ext_test0
 * *******************************
 */
public class User {
    String user_name;
    String user_role;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_nameArg) {
        user_name = user_nameArg;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_roleArg) {
        user_role = user_roleArg;
    }
}
