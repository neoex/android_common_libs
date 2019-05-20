package demo.com.libannotations.permissions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 权限被拒绝
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)//编译可用
public @interface OnPermissionDenied {
    String[] value();
}
