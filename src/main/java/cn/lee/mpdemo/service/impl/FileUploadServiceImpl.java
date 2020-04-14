package cn.lee.mpdemo.service.impl;

import cn.lee.mpdemo.entity.UploadFile;
import cn.lee.mpdemo.mapper.FileMapper;
import cn.lee.mpdemo.service.IFileUploadService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class FileUploadServiceImpl  extends ServiceImpl<FileMapper, UploadFile> implements IFileUploadService {

    @Override
    public boolean upload(String fileName,String filePath) {
        UploadFile upload = new UploadFile();

        upload.setFileName(fileName).setFilePath(filePath).setCreatedTime(new Date()).setModifiedTime(new Date());

        return save(upload);
    }
}
