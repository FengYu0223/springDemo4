package com.cj.springtest.mapper;

import com.cj.springtest.model.TbOrderDet;
import com.cj.springtest.model.TbOrderDetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderDetMapper {
    int countByExample(TbOrderDetExample example);

    int deleteByExample(TbOrderDetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbOrderDet record);

    int insertSelective(TbOrderDet record);

    List<TbOrderDet> selectByExample(TbOrderDetExample example);

    TbOrderDet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbOrderDet record, @Param("example") TbOrderDetExample example);

    int updateByExample(@Param("record") TbOrderDet record, @Param("example") TbOrderDetExample example);

    int updateByPrimaryKeySelective(TbOrderDet record);

    int updateByPrimaryKey(TbOrderDet record);
}