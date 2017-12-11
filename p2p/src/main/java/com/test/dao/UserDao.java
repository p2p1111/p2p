package com.test.dao;

import com.test.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface UserDao {


    public User login(User user);

}
