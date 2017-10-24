package com.cj.springtest.service;

/**
 * Created by fengyu1 on 2017/8/8.
 */
import com.cj.springtest.model.TbUserManage;
import com.cj.springtest.model.TbOrder;
import com.cj.springtest.model.TbOrderDet;

import java.util.List;

public interface OrderService {
   /* public void orderitem(long itemid);
    public TbOrder createorder(int userId);
    public void createorderDet( );
    */
  /* List<TbOrderDet> settlement();*/
    //
    public void orderList(String title,Integer number);
    public void orderCreate(TbOrder tbOrder);
}
