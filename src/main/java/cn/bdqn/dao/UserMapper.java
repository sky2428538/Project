package cn.bdqn.dao;

import cn.bdqn.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    public User getUserById(@Param("id") String id);
}
