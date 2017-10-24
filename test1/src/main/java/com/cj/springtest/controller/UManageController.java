package com.cj.springtest.controller;

/**
 * Created by fengyu1 on 2017/8/3.
 */
import java.util.List;

import com.cj.springtest.mapper.UserMapper;
import com.cj.springtest.service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cj.springtest.model.TbUserManage;
import com.cj.springtest.service.UmanageService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/manage")
public class UManageController {
    @Resource
    IUser userService;

    @Autowired
    UmanageService umanageService;

    @Resource
    HttpServletRequest request;

    @RequestMapping("eduser")
    public ModelAndView edUser() {
        return new ModelAndView("eduser");
    }

    //edusered:eduser改密码之后跳转到页面
     @RequestMapping("edusered")
  public ModelAndView edUsered() {
        //查俩次数据库
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String rpassword = request.getParameter("rpassword");

        //返回的revisepurl：success，login，null
        String revisepurl=userService.doLogin(userName, password);

        if(revisepurl=="success") {
            //返回的revisepurl2 ：success，error
        userService.update(userName,rpassword);

            return new ModelAndView("eduser");
        } else{

           ModelAndView mav = new ModelAndView();
            mav.setViewName("eduser");
            mav.addObject("message","New password:error!");
            return mav;
        }
    }

    @RequestMapping("rechargeitem")
    public ModelAndView rechargeItem() {
        return new ModelAndView("rechargeitem");
    }
    @RequestMapping("rechargeitemed")
    public ModelAndView rechargeItemed() {
        //查俩次数据库
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        Long recharge =  Long.parseLong(request.getParameter("recharge"));

        //返回的revisepurl：success，login，null  验证用户
        String revisepurl=userService.doLogin(userName, password);
        if(revisepurl=="success") {
            //返回的revisepurl2 ：success，error  更改balance
            umanageService.rechangBalnce(userName,recharge);
            ModelAndView mav = new ModelAndView();
            mav.setViewName("redirect:/itemlist");
            mav.addObject("message","recharge:success!");
            return mav;
        } else {
            ModelAndView mav = new ModelAndView();
            mav.setViewName("redirect:/rechargeitem"); //返回的文件名
            mav.addObject("message","Recharge:error!");
            return mav;
        }
    }
    @RequestMapping("recharge")
    public ModelAndView Recharge() {
        return new ModelAndView("recharge");
    }
    //recharged:充值之后跳转的页面recharge
    @RequestMapping("recharged")
    public ModelAndView Recharged() {
        //查俩次数据库
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        Long recharge =  Long.parseLong(request.getParameter("recharge"));

         //返回的revisepurl：success，login，null  验证用户
        String revisepurl=userService.doLogin(userName, password);
        if(revisepurl=="success") {
            //返回的revisepurl2 ：success，error  更改balance
            umanageService.rechangBalnce(userName,recharge);
            ModelAndView mav = new ModelAndView();
            mav.setViewName("redirect:/ordercheckp"); //返回的文件名
            mav.addObject("message","recharge:success!");
            return mav;
        } else {
            ModelAndView mav = new ModelAndView();
            mav.setViewName("redirect:/recharge"); //返回的文件名
            mav.addObject("message","Recharge:error!");
            return mav;
        }
    }
}
