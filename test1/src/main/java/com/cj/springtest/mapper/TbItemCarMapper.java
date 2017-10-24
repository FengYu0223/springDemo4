package com.cj.springtest.mapper;

import com.cj.springtest.model.TbItemCar;
import com.cj.springtest.model.TbItemCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemCarMapper {
    int countByExample(TbItemCarExample example);

    int deleteByExample(TbItemCarExample example);

    int deleteByPrimaryKey(Integer carId);

    int insert(TbItemCar record);

    int insertSelective(TbItemCar record);

    List<TbItemCar> selectByExample(TbItemCarExample example);

    TbItemCar selectByPrimaryKey(Integer carId);

    int updateByExampleSelective(@Param("record") TbItemCar record, @Param("example") TbItemCarExample example);

    int updateByExample(@Param("record") TbItemCar record, @Param("example") TbItemCarExample example);

    int updateByPrimaryKeySelective(TbItemCar record);

    int updateByPrimaryKey(TbItemCar record);
}