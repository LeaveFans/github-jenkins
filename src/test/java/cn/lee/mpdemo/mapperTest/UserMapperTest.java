package cn.lee.mpdemo.mapperTest;

import cn.lee.mpdemo.entity.User;
import cn.lee.mpdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    void testSelected(){
        System.out.println("----------selectAll method Test----------");
        List<User> userList = userMapper.selectList(null);
        /*Assertions.assertEquals(5, userList.size());
        userList.forEach(System.out::println);*/
        System.err.println(userList);
    }
}
