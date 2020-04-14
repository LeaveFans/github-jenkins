package cn.lee.mpdemo.service.impl;

import cn.lee.mpdemo.entity.User;
import cn.lee.mpdemo.mapper.UserMapper;
import cn.lee.mpdemo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 *
 * @author Lee
 * @since 2020-03-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
