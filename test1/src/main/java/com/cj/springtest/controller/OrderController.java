package com.cj.springtest.controller;

import com.cj.springtest.jediscomp.*;
import com.cj.springtest.service.UmanageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cj.springtest.service.OrderService;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.cj.springtest.model.TbOrder;
import com.cj.springtest.model.TbUserManage;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.cj.springtest.vo.Constants;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

import com.alibaba.fastjson.JSONObject;
/**
 * Created by fengyu1 on 2017/8/8.
 */
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    @Resource
    HttpServletRequest request;

    @Autowired
    UmanageService umanageService;
    //清空redis
    @Autowired
    private JedisClient jedisClient;

    Map<String, Integer> itemMap = new HashMap<String, Integer>();
    List<Map> parseArray; //     解析json数组字符串:购物车商品
    String rname;
    String raddress;
    String rphone;
    TbUserManage rtbUserManage; //暂时存放收件人信息
    Long mUserBalance;

    //购物车入订单
    @RequestMapping(value = {"/orderlist"}, method = {RequestMethod.POST, RequestMethod.GET})
    public @ResponseBody String orderList(HttpServletRequest request) {
        JSONObject jo = new JSONObject();
        try {
            String str = request.getParameter("jsonStr");

            //如果页面传的是json数组字符串，用下列方式解析
            parseArray = jo.parseArray(str, Map.class);
            //string转list
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "success";
    }

    //编辑订单:填写收件人信息
    @RequestMapping("rececheck")
    public ModelAndView receCheck(){
        return new ModelAndView("rececheck");
    }

    //编辑订单(填写联系人之后跳转):1.充值，2.支付
    @RequestMapping("ordercheck")
   // public ModelAndView orderCheck(String rname, String raddress, String rphone) {HttpServletRequest request
    public ModelAndView orderCheck(HttpServletRequest request){
         rname=request.getParameter("rname");
         raddress=request.getParameter("raddress");
         rphone=request.getParameter("rphone");

        mUserBalance = umanageService.finfBalance();//查到当前用户余额
        rtbUserManage = new TbUserManage(rname, raddress, rphone, mUserBalance);//暂时存放收件人信息
        ModelAndView mav = new ModelAndView();

        mav.addObject("ocheck", parseArray);
        mav.addObject("rtbUserManage", rtbUserManage);

        mav.setViewName("ordercheck");
        return mav;
    }
    //编辑订单(填写联系人之后跳转):1.充值:去充值之后跳转回到确认支付页面，2.支付
    @RequestMapping("ordercheckp")
    public ModelAndView orderCheckp(){
        mUserBalance = umanageService.finfBalance();//查到当前用户余额
        rtbUserManage = new TbUserManage(rname, raddress, rphone, mUserBalance);//暂时存放收件人信息
        ModelAndView mav = new ModelAndView();

        mav.addObject("ocheck", parseArray);
        mav.addObject("rtbUserManage", rtbUserManage);

        mav.setViewName("ordercheck");
        return mav;
    }

    //写入支付
    @RequestMapping("orderpay")
    @ResponseBody
    public int orderPay(long paySum) {
        System.out.println("paySum" + paySum);
        Long rpbalance = mUserBalance - paySum;

        if (rpbalance >= 0) {
            //把扣后余额，商品信息，收件人，写入数据库
            umanageService.updateBalnce(rpbalance);
            //解析商品List<Map>
            for (int i = 0; i < parseArray.size(); i++) {

                Map map1 = parseArray.get(i);
                   /* System.out.println( " map1.get(i)" + map1.get("title"))*/
                   String title=(String) map1.get("title");
                   Integer number=Integer.valueOf((String) map1.get("number"));
                   Long price=Long.valueOf((String) map1.get("price"));
                orderService.orderCreate(new TbOrder(rtbUserManage.getUserName(),title,number,
                        price,paySum,rtbUserManage.getPhone(),
                        rtbUserManage.getAddress(),2));

            }
           // jedisClient.flushall();   //使用redi时，下单后清空redis缓存
            return Constants.LoginStatus.SUCCESS;
        }
        return Constants.LoginStatus.FAIL;
    }
    //编辑订单支付后跳转的页面：配送中
    @RequestMapping("orderpayed")
    public ModelAndView orderPayed(){
        return new ModelAndView("orderpayed");
    }
}
