package mirror.android.app.servertransaction;

import android.content.Intent;
import android.content.pm.ActivityInfo;

import mirror.RefClass;
import mirror.RefObject;

/**
 * @author nemoqjzhang
 * @date 2019/8/5 20:12.
 */
public class LaunchActivityItem {
    public static Class<?> TYPE = RefClass.load(LaunchActivityItem.class, "android.app.servertransaction.LaunchActivityItem");
    public static RefObject<Intent> mIntent;
    public static RefObject<ActivityInfo> mInfo;
}
