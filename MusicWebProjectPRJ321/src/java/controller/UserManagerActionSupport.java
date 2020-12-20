/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.UserDAO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author Inpiron
 */
public class UserManagerActionSupport extends ActionSupport {
    
    public UserManagerActionSupport() {
    }
    private String username;
    private String usernameDel;
    private String usernameOp;
    private String usernameDeop;
    private List<User> dsuser = new ArrayList<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<User> getDsuser() {
        return dsuser;
    }

    public void setDsuser(List<User> dsuser) {
        this.dsuser = dsuser;
    }

    public String getUsernameDel() {
        return usernameDel;
    }

    public void setUsernameDel(String usernameDel) {
        this.usernameDel = usernameDel;
    }

    public String getUsernameOp() {
        return usernameOp;
    }

    public void setUsernameOp(String usernameOp) {
        this.usernameOp = usernameOp;
    }

    public String getUsernameDeop() {
        return usernameDeop;
    }

    public void setUsernameDeop(String usernameDeop) {
        this.usernameDeop = usernameDeop;
    }
    
    
    
    public String execute() throws Exception {
        UserDAO sd = new UserDAO();
        String username = getUsername();
        dsuser = sd.listUser(username);
        return "success";
    }
    
    public String delete() throws Exception{
        UserDAO sd = new UserDAO();
        String username = getUsername();
        String usernameDel = getUsernameDel();
        sd.delete(usernameDel);
        dsuser = sd.listUser(username);
        return "success";
    }
    
    public String opuser() throws Exception{
        UserDAO sd = new UserDAO();
        String username = getUsername();
        String usernameOp = getUsernameOp();     
        sd.opUser(usernameOp);
        dsuser = sd.listUser(username);
        return "success";
    }
    
    public String deopuser() throws Exception{
        UserDAO sd = new UserDAO();
        String username = getUsername();
        String usernameDeop = getUsernameDeop();     
        sd.deopUser(usernameDeop);
        dsuser = sd.listUser(username);
        return "success";
    }
}
