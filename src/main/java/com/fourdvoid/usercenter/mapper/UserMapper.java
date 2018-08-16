package com.fourdvoid.usercenter.mapper;

import com.fourdvoid.usercenter.po.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from wxuser")
    List<User> getAllUsers();

    @Select("select * from wxuser where openid = #{openid}")
    User getByOpenId(String openid);

    @Insert("insert into wxuser(openid, appid, unionid, nickname) values (#{openid}, #{appid}, #{unionid}, #{nickname})")
    void Add(String openid, String appid, String unionid, String nickname);
}
