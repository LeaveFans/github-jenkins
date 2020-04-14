package cn.lee.mpdemo.components.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 自定义的AOP切面类，实现日志的打印
 */
@Aspect     //声明切面类
@Component  //声明组件
public class MyLogAspect {

    /*
     * PointCut表示这是一个切点，@annotation表示这个切点切到一个注释上，后面带注释的全类名
     * 切面最主要的就是切点，所有的操作都是围绕切点进行的，logPointCut()代表切点的名称
     */
    @Pointcut("@annotation(cn.lee.mpdemo.components.annotations.MyLog)")
    public void logPointCut(){};

    //环绕通知
    @Around("logPointCut()")
    public void logAround(ProceedingJoinPoint joinPoint){
        //获取方法名称
        String methodName = joinPoint.getSignature().getName();
        //获取入参
        Object[] params = joinPoint.getArgs();

        StringBuilder builder = new StringBuilder();
        for(Object obj : params){
            builder.append(obj+";");
        }
        System.out.println("(AOP:)进入["+methodName+"]方法，参数为"+builder.toString());

        try {
            joinPoint.proceed();
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }

        System.out.println("(AOP:)方法执行结束。");
    }
}
