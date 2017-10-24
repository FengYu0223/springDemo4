package com.cj.springtest.service.impl;

/**
 * Created by fengyu1 on 2017/8/3.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cj.springtest.mapper.TbUserManageExtendMapper;
import com.cj.springtest.model.TbUserManage;
import com.cj.springtest.service.UmanageService;

import java.util.List;
@Service
public class UmanageServiceImpl implements UmanageService {

    @Autowired
    TbUserManageExtendMapper tbUserManageExtendMapper;


    public void  rechangBalnce(String rusername, Long recharge) {

        tbUserManageExtendMapper.update(new TbUserManage(rusername, recharge));

    }
    //查余额balance
    public  Long finfBalance(){
        return tbUserManageExtendMapper.finfBalance();
    }
    //扣款后写入新balance
    public  void updateBalnce(Long nbalance){
        tbUserManageExtendMapper.updateBalnce(nbalance);

    }
}
