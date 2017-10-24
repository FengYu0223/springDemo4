package com.cj.springtest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cj.springtest.model.TbItem;
import com.cj.springtest.service.ItemService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by fengyu1 on 2017/7/29.
 */
// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class ItemController {
    @Autowired
    ItemService itemService;

    @Resource
    HttpServletRequest request;

      //商城list
    @RequestMapping("itemlist")
    public ModelAndView listitem(){
        ModelAndView mav = new ModelAndView();

        List<TbItem> cs= itemService.itemlist();

        mav.addObject("cs", cs);
        mav.setViewName("itemshow");
        return mav;
    }

    @RequestMapping("additem")
    public ModelAndView additem() {
        return new ModelAndView("additem");
    }

    //additemed：additem之后跳转的页面
    @RequestMapping("additemed")
    public ModelAndView additemed() {

        String title = request.getParameter("title");
        Long price = Long.parseLong(request.getParameter("price"));
        Integer num = Integer.valueOf(request.getParameter("num"));

        String additemurl="redirect:/itemlist";
        //String additemurl="redirect:/usermanage";
           itemService.additem(title, price, num);
           return new ModelAndView(additemurl);
    }

    @RequestMapping("deleteitem")
    @ResponseBody
    public void deleteitem(String dtitle) {
       itemService.deleteitem(dtitle);
    }
}

