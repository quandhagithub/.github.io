/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.RegisterDAO;
import com.opensymphony.xwork2.ActionSupport;
import model.User;

/**
 *
 * @author ADMIN
 */
public class RegisterActionSupport extends ActionSupport {
    private String username;
    private String password;
    private String gender;
    private String nation;
    private String email;
    private final String FAIL = "fail";
    private final String SUCCESS = "success";
    
    public RegisterActionSupport() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public String execute() throws Exception {
        RegisterDAO dao = new RegisterDAO();
        boolean result = dao.newUser(new User(username, password, gender, nation, email,0));
        System.out.println("hihihi: "+getGender());
        return result ? SUCCESS : FAIL;
    }
    
}
