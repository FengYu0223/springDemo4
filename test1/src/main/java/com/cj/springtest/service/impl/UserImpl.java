package com.cj.springtest.service.impl;

import com.cj.springtest.vo.Constants;
import com.cj.springtest.mapper.UserMapper;

import com.cj.springtest.model.User;
import com.cj.springtest.service.IUser;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

@Service
public class UserImpl implements IUser {

   @Resource
   UserMapper userMapper;

    public String doLogin(String username, String password) {
        String resultUrl = null, modelName = null, modelObject = null;
        switch (realLogin(username, password)) {
            case Constants.LoginStatus.SUCCESS:
                resultUrl = "success";
                modelName = "username";
                modelObject = username;
                break;
            case Constants.LoginStatus.NO_USER:
                resultUrl = "login";
                modelName = "error";
                modelObject = "用户不存在，请先注册！";
                break;
            case Constants.LoginStatus.ERRPR_PWD:
                resultUrl = "login";
                modelName = "error";
                modelObject = "密码不正确";
                break;
        }
        if(StringUtils.isEmpty(resultUrl)) {
            return null;
        }

        else {
            return resultUrl;
        }
    }

    public String doRegister(String username, String password) {

        User user=userMapper.findByUserName(username);
        if(user == null) {
            userMapper.insert(new User(username,password));
            return "success"; //"用户注册成功！"
        } else {
            // 提示用户用户名重复
            return "error";// "用户名重复!"
        }
    }

    /**
     *
     * @param userName
     * @param password
     * @return 0: 成功，1: 用户名为空, 2: 密码为空, 3: 用户不存在，请先注册！, 4: 密码不正确
     */
    private int realLogin(String userName, String password) {
        User user=userMapper.findByUserName(userName);
        if(user == null) {
            // 未查询到该用户
            return Constants.LoginStatus.NO_USER;
        } else {
            if(password.equals(user.getUserPassword())) {
                return Constants.LoginStatus.SUCCESS;
            } else {
                // 用户密码错误
                return Constants.LoginStatus.ERRPR_PWD;
            }
        }
    }
    public void  update(String rusername, String rpassword) {
        userMapper.update(new User(rusername, rpassword));

    }
}
