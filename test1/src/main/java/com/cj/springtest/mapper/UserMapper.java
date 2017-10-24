package com.cj.springtest.mapper;

import com.cj.springtest.model.User;
import com.cj.springtest.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserMapper {

    void insert(User record);
    void update(User record);
    User findById(int id);
    User findByUserName(String userName);
    public int findUserId();
}