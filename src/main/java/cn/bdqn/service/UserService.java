package cn.bdqn.service;

import cn.bdqn.pojo.User;

public interface UserService {
    /**
     * 通过userId获取user
     * @param id
     * @return
     * @throws Exception
     */
    public User getUserById(String id);

}
