package cn.bdqn.service.impl;

import cn.bdqn.dao.UserMapper;
import cn.bdqn.pojo.User;
import cn.bdqn.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userService")
public class UserServiceImpl implements UserService {
   @Resource
   private UserMapper userMapper;
    @Override
    public User getUserById(String id) {
        try {
            return userMapper.getUserById(id);
        }catch (Exception e){
            e.printStackTrace();
            return  null;
        }

    }
}
