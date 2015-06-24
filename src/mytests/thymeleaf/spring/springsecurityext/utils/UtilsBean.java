package mytests.thymeleaf.spring.springsecurityext.utils;

import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/23/2015.
 * Project: SpringSecurity3Ext_test0
 * *******************************
 */
public class UtilsBean {
    private String[] myRolesProperty;
    private boolean myFlagProperty;
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> usersArg) {
        users = usersArg;
    }

    public void setRoles(String[] roles) {
        myRolesProperty = roles;
    }

    public String[] getRoles() {
        return myRolesProperty;
    }

    public void setFlag(boolean flag) {
        myFlagProperty = flag;
    }

    public boolean getFlag() {
        return myFlagProperty;
    }
}
