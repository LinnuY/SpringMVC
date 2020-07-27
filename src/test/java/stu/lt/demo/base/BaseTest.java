package stu.lt.demo.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author LinuY
 * @Date 2020/7/16 10:19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:META-INF/spring/spring-dao.xml",
        "classpath:META-INF/spring/spring-service.xml"})
public class BaseTest {
}
