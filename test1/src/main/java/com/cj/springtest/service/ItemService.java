package com.cj.springtest.service;

import java.util.List;
import com.cj.springtest.model.TbItem;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by fengyu1 on 2017/7/29.
 */
public interface ItemService {
    List<TbItem> itemlist();
    //public List<TbItem> itemsearch(String title);
    public String additem( String title, Long price, Integer num);
    public void deleteitem(String dtitle);
   /* public List<TbItem> itemord(Long itemId);*/
}
