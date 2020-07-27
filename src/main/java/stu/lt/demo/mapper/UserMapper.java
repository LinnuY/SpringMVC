package stu.lt.demo.mapper;

import stu.lt.demo.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @Author LinuY
 * @Date 2020/7/16 9:22
 */
public interface UserMapper {

    List<User> list(Map<String, Object> map);
}
