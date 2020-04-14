package cn.lee.mpdemo.serviceTest;

import cn.lee.mpdemo.service.IFileUploadService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
public class FileServiceTest {
    @Autowired
    private IFileUploadService uploadService;

    @Test
    void test1(){
        File file = new File("text.txt");
        String name = file.getName();
        String path = file.getAbsolutePath();
        System.err.println(name);
        System.err.println(path);
    }
}
