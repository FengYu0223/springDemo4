package com.cj.springtest.mapper;

import com.cj.springtest.model.TbUserManage;
import com.cj.springtest.model.TbUserManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserManageMapper {
    int countByExample(TbUserManageExample example);

    int deleteByExample(TbUserManageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbUserManage record);

    int insertSelective(TbUserManage record);

    List<TbUserManage> selectByExample(TbUserManageExample example);

    TbUserManage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbUserManage record, @Param("example") TbUserManageExample example);

    int updateByExample(@Param("record") TbUserManage record, @Param("example") TbUserManageExample example);

    int updateByPrimaryKeySelective(TbUserManage record);

    int updateByPrimaryKey(TbUserManage record);
}