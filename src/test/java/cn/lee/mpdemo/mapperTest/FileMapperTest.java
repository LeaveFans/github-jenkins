package cn.lee.mpdemo.mapperTest;

import cn.lee.mpdemo.entity.UploadFile;
import cn.lee.mpdemo.mapper.FileMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class FileMapperTest {
    @Autowired
    private FileMapper mapper;

    @Test
    void testSelect(){
        System.out.println(mapper.selectFileNameById(1L));
    }

    @Test
    void testInsert(){
        Date now = new Date();
        Integer rows = mapper.insert(new UploadFile(0L,"firstInsertTest","empty",now,now));
        System.err.println("插入成功！"+rows);
    }

    @Test
    void selectTest(){
        UploadFile file = mapper.selectFileByName("firstInsertTest");
        System.err.println(file);
    }
}
