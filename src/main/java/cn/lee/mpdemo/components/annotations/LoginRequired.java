package cn.lee.mpdemo.components.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解拦截，如果controller中方法上添加了该注解，那么就会提示用户该接口需要登录才能够访问，否则就不需要提示
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginRequired {

}
