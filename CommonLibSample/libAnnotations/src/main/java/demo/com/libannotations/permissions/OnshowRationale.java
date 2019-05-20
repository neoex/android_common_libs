package demo.com.libannotations.permissions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 是否显示记住选择
 */

@Target(ElementType.METHOD)//注解的种类-> 方法
@Retention(RetentionPolicy.CLASS)//被编译其记录在类文件里面，但是不会进入虚拟机-> 编译时可用
public @interface OnshowRationale {
    String[] value();
}
