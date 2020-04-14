package cn.lee.mpdemo.components.interceptor;

import cn.lee.mpdemo.components.annotations.LoginRequired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SourceAccessInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.err.println("进入拦截器并且进行了拦截！");

        //反射获取方法上的LoginRequired注解
        HandlerMethod handlerMethod = (HandlerMethod)handler;
        LoginRequired loginRequired = handlerMethod.getMethod().getAnnotation(LoginRequired.class);

        //如果没有相关的注解，那就直接放行
        if(loginRequired == null){
            return true;
        }

        //有 LoginRequired 注解说明该方法访问需要登录，提示用户需要登录
        response.setContentType("application/json: charset=utf-8");
        response.getWriter().print("你访问的资源需要登录！");
        return false;
    }
}
