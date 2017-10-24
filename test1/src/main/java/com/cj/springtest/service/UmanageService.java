package com.cj.springtest.service;

import com.cj.springtest.model.TbUserManage;

import java.util.List;

/**
 * Created by fengyu1 on 2017/8/3.
 */
public interface UmanageService {

    public  void rechangBalnce(String rusername, Long recharge);
    public  void updateBalnce(Long balance);
    public  Long finfBalance();
}
