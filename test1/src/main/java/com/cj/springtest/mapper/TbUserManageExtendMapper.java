package com.cj.springtest.mapper;

import java.util.List;

import com.cj.springtest.model.TbOrder;
import com.cj.springtest.model.TbUserManage;
/**
 * Created by fengyu1 on 2017/8/3.
 */
public interface TbUserManageExtendMapper {

    void update(TbUserManage ibUserManage);
    public TbUserManage  findManageByuId(int userid);
    public Long finfBalance();
    public  void updateBalnce(Long nbalance);


}
