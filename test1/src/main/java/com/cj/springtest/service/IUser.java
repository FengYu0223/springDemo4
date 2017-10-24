package com.cj.springtest.service;

import com.cj.springtest.model.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by chenjun on 2016/10/13.
 */
//
public interface IUser {

    public String doLogin(String username, String password);

    public String doRegister(String username, String password);

    public  void update(String rusername, String rpassword);
}
