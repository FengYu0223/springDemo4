package com.cj.springtest.mapper;

import com.cj.springtest.model.TbOrderDet;

import java.util.List;

/**
 * Created by fengyu1 on 2017/8/9.
 */
public interface TbOrderDetExtendMapper {
    public void insertOrderDet(TbOrderDet tbOrderDet);
    public List<TbOrderDet> settlement();
}
