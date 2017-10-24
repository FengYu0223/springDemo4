package com.cj.springtest.mapper;

import com.cj.springtest.model.TbItem;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
/**
 * Created by fengyu1 on 2017/7/29.
 */
@Component
public interface TbItemExtendMapper {

    public List<TbItem> itemlist();
    public TbItem  findByItemId(long itemid);
    public TbItem  findByItemTitle(String title);
    public void additem(TbItem ibItem);
    public  void deleteitem(String dtitle);
    public Long getPrice(String title);

}
