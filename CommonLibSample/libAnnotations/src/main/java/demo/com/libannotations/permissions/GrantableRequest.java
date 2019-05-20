package demo.com.libannotations.permissions;

/**
 * Created by HW on 2019/5/17.
 */

public interface GrantableRequest extends PermissionRequest {
    void grant();
}
