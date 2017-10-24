package com.cj.springtest.service.impl;

import com.cj.springtest.mapper.*;
import com.cj.springtest.model.TbOrder;
import com.cj.springtest.model.TbUserManage;
import com.cj.springtest.model.TbOrderDet;
import com.cj.springtest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;

/**
 * Created by fengyu1 on 2017/8/8.
 */
@Service
public class OrderServiceImp implements OrderService{
    @Autowired
    TbItemExtendMapper tbItemExtendMapper;

    @Autowired
    UserMapper userIdMapper;

    @Autowired
   TbOrderExtendMapper tbOrderExtendMapper;

   @Autowired
    TbUserManageExtendMapper tbUserManageExtendMapper;

   @Autowired
    TbOrderDetExtendMapper tbOrderDetExtendMapper;


   //createorder
   public void orderCreate(TbOrder tbOrder){
       tbOrderExtendMapper.orderCreate(tbOrder);
   }

   // TbItem itemordli;
   int userid;
    public void orderList(String title,Integer number){
        userid=userIdMapper.findUserId(); //获得当前获得用户
        TbUserManage tbUserManage1=findManageByuserId(userid); //获得用户资料

        Long price=tbItemExtendMapper.getPrice(title);//通过title获得价格

        tbOrderDetExtendMapper.insertOrderDet(
                new TbOrderDet(title,price,number));

    }

    //通过userId查询账户信息(
    public TbUserManage findManageByuserId(int userId){

        return tbUserManageExtendMapper.findManageByuId(userId);
    }

    //list order detail
  /*  public List<TbOrderDet> settlement(){
        return tbOrderDetExtendMapper.settlement();
    }*/
   /* //通过加入订单的title，查询商品信息
    public void orderitem(long itemid){
        itemordli =tbItemExtendMapper.findByItemId(itemid);
        userid=userIdMapper.findUserId();
        int status= tbOrderExtendMapper.findstatus();

        //status状态：1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭
        if(tbOrderExtendMapper.findstatus()!=1|| ObjectUtils.isEmpty(status)) {
            createorder(userid); //创建订单
        }
        createorderDet(); //创建订单详情
    }
       //通过userId查询账户信息(
    public TbUserManage findManageByuserId(int userId){
       return tbUserManageExtendMapper.findManageByuId(userId);
    }
   //通过userId创建订单
    public TbOrder createorder(int userId){
        return tbOrderExtendMapper.insertOrder(userId);

    }
    //创建订单详情
    public void createorderDet(){
          int orderId=tbOrderExtendMapper.findoderid(userid);

          TbUserManage tbUserManage1=findManageByuserId(userid);

        tbOrderDetExtendMapper.insertOrderDet(
                 new TbOrderDet(orderId,
                         itemordli.getId(),itemordli.getTitle(),itemordli.getPrice(),
                         tbUserManage1.getAddress(),tbUserManage1.getPhone()));
    }
    //list order detail
    public List<TbOrderDet> settlement(){
        return tbOrderDetExtendMapper.settlement();
    }
*/
    //

}
