package com.example.demo.mapper.mapperImpl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by daier on 2018/1/11.
 */
@Repository
@Mapper
public class UserMapperImpl implements UserMapper{

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addUser(User user){
        jdbcTemplate.update("INSERT INTO user VALUES (?,?,?)",new PreparedStatementSetter(){
            public void setValues(PreparedStatement preparedStatement) throws SQLException{
                preparedStatement.setString(1,user.getUsername());
                preparedStatement.setString(2,user.getPassword());
                preparedStatement.setInt(3,user.getAge());
            }
        });
    }

    @Override
    public void updateUser(User user){
        jdbcTemplate.update("UPDATE user set username=?,password=?,age=? WHERE id=?",new PreparedStatementSetter(){
            public void setValues(PreparedStatement preparedStatement) throws SQLException{
                preparedStatement.setString(1,user.getUsername());
                preparedStatement.setString(2,user.getPassword());
                preparedStatement.setInt(3,user.getAge());
                preparedStatement.setInt(4,user.getId());
            }
        });
    }

    @Override
    public void deleteUser(int id){
        jdbcTemplate.update("DELETE FROM user where id=?",id);
    }

    @Override
    public List<User> getAllUser(){
        List list = jdbcTemplate.queryForList("SELECT * FROM user");
        return list;
    }
}
