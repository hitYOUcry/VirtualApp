package mirror.android.app.servertransaction;

import android.app.servertransaction.ClientTransactionItem;
import android.os.IBinder;

import java.util.List;

import mirror.RefClass;
import mirror.RefObject;

/**
 * @author nemoqjzhang
 * @date 2019/8/5 20:12.
 */
public class ClientTransaction {
    public static Class<?> TYPE = RefClass.load(ClientTransaction.class, "android.app.servertransaction.ClientTransaction");
    public static RefObject<List<ClientTransactionItem>> mActivityCallbacks;
    public static RefObject<IBinder> mActivityToken;
}
