package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by daier on 2018/1/11.
 */

/*
    DAO 层实现方式：
        1、写一个类实现接口中的所有方法，需在实现类上添加 @Mapper，如果在启动类中使用了 @MapperScan 则不需要添加
        2、在接口中用注解的方式实现增删改查,只需在接口上添加 @Mapper
 */
//@Mapper
public interface UserMapper {

//    @Insert("insert into user(username,password,age) values(#{username}, #{password}, #{age})")
    void addUser(User user);

//    @Update("update user set username=#{username}, password=#{password}, age=#{age} where id=#{id}")
    void updateUser(User user);

//    @Delete("delete from user where id=#{id}")
    void deleteUser(int id);

//    @Select("select * from user")
    List<User> getAllUser();

}
