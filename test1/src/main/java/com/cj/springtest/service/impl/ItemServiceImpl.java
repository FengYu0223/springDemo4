package com.cj.springtest.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cj.springtest.mapper.TbItemExtendMapper;
import com.cj.springtest.model.TbItem;
import com.cj.springtest.service.ItemService;


@Service
public class ItemServiceImpl implements ItemService{

        @Autowired
        TbItemExtendMapper tbItemExtendMapper;

     //商品列表
    public List<TbItem> itemlist(){
            return tbItemExtendMapper.itemlist();
        }

    //添加商品
    public String additem(String title, Long price, Integer num) {
        tbItemExtendMapper.additem(new TbItem(title, price, num));
            return "success";
    }

    //删除商品
    public void deleteitem(String dtitle){

        tbItemExtendMapper.deleteitem(dtitle);
    }
}
