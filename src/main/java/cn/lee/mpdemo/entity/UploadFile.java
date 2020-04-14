package cn.lee.mpdemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author Lee
 * @Date 2020-03-20 10:31:52
 * 文件上传实体类
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)    //开启链式存取
@TableName("file")          //数据库中对应的表名
public class UploadFile extends Model<UploadFile> {

    /** 文件id */
    private Long fid;

    /** 文件名 */
    private String fileName;

    /** 文件路径 */
    private String filePath;

    /** 创建时间 */
    private Date createdTime;

    /** 修改时间 */
    private Date modifiedTime;

}
