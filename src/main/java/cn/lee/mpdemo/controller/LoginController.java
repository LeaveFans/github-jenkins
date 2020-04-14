package cn.lee.mpdemo.controller;

import cn.lee.mpdemo.components.annotations.LoginRequired;
import cn.lee.mpdemo.components.annotations.MyLog;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {

    @RequestMapping("a")
    public String loginTest1(){
        return "访问A节点成功！";
    }

    /**
     * 测试注解 @LoginRequired
     */
    @LoginRequired
    @RequestMapping("b")
    public String loginTest2(){
        return "访问B节点成功！";
    }

    /**
     * 测试注解 @MyLog
     */
    @MyLog
    @RequestMapping("c/{source_name}")
    public String loginTest3(@PathVariable("source_name")String sourceName){
        return "你正在访问Test3资源！";
    }

}
