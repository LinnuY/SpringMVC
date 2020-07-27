package stu.lt.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import stu.lt.demo.entity.User;
import stu.lt.demo.mapper.UserMapper;
import stu.lt.demo.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author LinuY
 * @Date 2020/7/16 9:36
 */
@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> list() {
        Map<String, Object> map = new HashMap<>();

        List<User> users = userMapper.list(map);
        for (User user : users) {
            System.out.println(user);
        }

        return users;
    }
}
