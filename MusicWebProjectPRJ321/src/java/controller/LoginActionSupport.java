/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.LoginDAO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;

/**
 *
 * @author ADMIN
 */
public class LoginActionSupport extends ActionSupport {
    
    public LoginActionSupport() {
    }
    
    private int role;
    private String username;
    private String pass;
    private final String FAIL = "fail";
    private final String SUCCESS = "success";

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public String execute() throws Exception {
        LoginDAO dao = new LoginDAO();
        int result = dao.checkLogin(username, pass);
        Map session = ActionContext.getContext().getSession();
        session.put("role",result);
        String URL = FAIL;
        if (result>=0) {          
            session.put("USERNAME", getUsername());
            URL = SUCCESS;
        }
        return URL;
    }
    
    public String logout() throws Exception{
        Map session = ActionContext.getContext().getSession();
        session.remove("USERNAME");
        return SUCCESS;
    }
}
