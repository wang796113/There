package com.qf.mapper;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface userMapper {
    @Select("Select * from user")
    List<User> selectUser();
    int updateUser(User user);
    @Select("select * from user where id = #{id}")
    User select(Integer id);
    int deleteUser(Integer id);
    int insertUser(User user);

}
