package stu.lt.demo.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import stu.lt.demo.base.BaseTest;
import stu.lt.demo.entity.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @Author LinuY
 * @Date 2020/7/16 10:18
 */
public class UserMapperTest extends BaseTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void list() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", null);
        map.put("name", null);
        map.put("sex", null);
        map.put("mobileNumber", null);
        map.put("isUsing",null);

        List<User> users = userMapper.list(map);
        for (User user : users) {
            System.out.println(user);
        }
    }
}