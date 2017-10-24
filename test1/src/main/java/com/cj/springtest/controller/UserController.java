
package com.cj.springtest.controller;
import redis.clients.jedis.Jedis;
import com.cj.springtest.model.User;
import com.cj.springtest.service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.cj.springtest.mapper.TbItemExtendMapper;
import com.cj.springtest.mapper.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class UserController  {

    @Resource
    IUser userService;

    @Resource
    HttpServletRequest request;

    @RequestMapping("register")
    public ModelAndView Register() {
        return new ModelAndView("register");
    }
    @RequestMapping("register2")
    public ModelAndView doRegister() {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
       String reginster2= userService.doRegister(userName, password);
        return (reginster2=="success")? new ModelAndView("login"): new ModelAndView("register");
    }


    @RequestMapping("login")
    public ModelAndView Login() {
        return new ModelAndView("login");
    }

    @RequestMapping("login3")
    public ModelAndView doLogin() {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String login3url=userService.doLogin(userName, password);
        if(login3url=="success") {
            login3url="redirect:/itemlist";
            }
        return new ModelAndView(login3url);
    }
}


