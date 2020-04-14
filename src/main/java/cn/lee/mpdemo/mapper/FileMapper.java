package cn.lee.mpdemo.mapper;

import cn.lee.mpdemo.entity.UploadFile;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author Lee
 * @date 2020-03-20 10:38:51
 * 文件上传 Mapper
 */
public interface FileMapper extends BaseMapper<UploadFile> {

    /** 根据文件id查找文件名 */
    String selectFileNameById(Long fid);

    /**
     * 根据文件名查找文件
     */
    UploadFile selectFileByName(String fileName);
}
