package cn.lee.mpdemo.serviceTest;

import cn.lee.mpdemo.entity.User;
import cn.lee.mpdemo.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private IUserService userService;

    @Test
    void test(){
        User user = userService.getById(1);
        System.err.println(user);
    }
}
