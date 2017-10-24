
package com.cj.springtest.controller;

import com.cj.springtest.model.TbItem;
import com.cj.springtest.model.TbItemCar;
import com.cj.springtest.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * Created by fengyu1 on 2017/8/11.
 */

@Controller
public class CarController {

        @Autowired
        CarService carService;

        @Resource
        HttpServletRequest request;

        // car list
        @RequestMapping("car")
        public ModelAndView car(){

            ModelAndView mav = new ModelAndView();
            List<TbItemCar> carDet= carService.carDet();  //通过SQL查询购物车中的商品
           // List<TbItemCar> carDet= carService.carDetRedis();   //通过redis查询购物车中的商品
            mav.addObject("carDet", carDet);
            mav.setViewName("car");
            return mav;
        }

    @RequestMapping("addcar")
    @ResponseBody //此注解不能省略 否则ajax无法接受返回值
    public String addCar(String title ,String price) {
        Long lprice = Long.valueOf(price);
             carService.addCar(title,lprice);  //通过sql 加入购物车商品
       // carService.addCarRedis(title,lprice);
        return "dsuccess" ;
    }

    @RequestMapping("delcar")
    @ResponseBody
    public void delCar(String dtitle) {

            carService.delCar(dtitle);   //通过sql 删除购物车商品
            //carService.delCarRedis(dtitle);
    }
}

