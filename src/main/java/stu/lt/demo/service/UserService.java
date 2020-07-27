package stu.lt.demo.service;

import org.springframework.stereotype.Service;
import stu.lt.demo.entity.User;

import java.util.List;

/**
 * @Author LinuY
 * @Date 2020/7/16 9:35
 */
public interface UserService {

    List<User> list();
}
