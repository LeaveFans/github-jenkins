package cn.lee.mpdemo.service;

import cn.lee.mpdemo.entity.UploadFile;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author Lee
 * @since 2020-03-20 11:28:49
 * 上传文件的Service层
 */
public interface IFileUploadService extends IService<UploadFile> {

    /**
     * 上传
     * @param fileName 上传的文件
     * @param filePath 上传文件所要保存的路径
     * @return boolean,上传成功则返回true
     */
    boolean upload(String fileName,String filePath);

}
