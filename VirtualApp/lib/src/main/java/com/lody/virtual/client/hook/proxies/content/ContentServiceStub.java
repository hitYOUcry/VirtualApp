package com.lody.virtual.client.hook.proxies.content;

import android.os.Build;
import android.util.Log;

import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

import mirror.android.content.IContentService;

/**
 * @author Lody
 * @see IContentService
 */

public class ContentServiceStub extends BinderInvocationProxy {

    private static final String TAG = "ContentServiceStub_";

    public ContentServiceStub() {
        super(IContentService.Stub.asInterface, "content");
    }

    @Override
    protected void onBindMethods() {
        super.onBindMethods();
        if (VirtualCore.get().isVAppProcess()) {
            addMethodProxy(new MethodProxy() {
                @Override
                public String getMethodName() {
                    return "registerContentObserver";
                }

                @Override
                public Object call(Object who, Method method, Object... args) throws Throwable {
                    Log.i(TAG, ">registerContentObserver " + Arrays.toString(args));
                    if (args != null) {
                        int indexOfTargetSDK = args.length - 1;
                        if (indexOfTargetSDK > 0
                                && (args[indexOfTargetSDK] instanceof Integer)
                                && (((int) args[indexOfTargetSDK]) >= Build.VERSION_CODES.O)) {
                            args[indexOfTargetSDK] = Build.VERSION_CODES.N;
                        }
                    }
                    return super.call(who, method, args);
                }
            });


            addMethodProxy(new MethodProxy() {
                @Override
                public String getMethodName() {
                    return "notifyChange";
                }

                @Override
                public Object call(Object who, Method method, Object... args) throws Throwable {
                    Log.i(TAG, ">notifyChange " + Arrays.toString(args));
                    if (args != null) {
                        int indexOfTargetSDK = args.length - 1;
                        if (indexOfTargetSDK > 0
                                && (args[indexOfTargetSDK] instanceof Integer)
                                && (((int) args[indexOfTargetSDK]) >= Build.VERSION_CODES.O)) {
                            args[indexOfTargetSDK] = Build.VERSION_CODES.N;
                        }
                    }
                    return super.call(who, method, args);
                }
            });
        }
    }
}
