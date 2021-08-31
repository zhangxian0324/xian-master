package com.xiancommon.utils.proxyUtil.dynamicProxyUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhangxian
 */
public class DynamicProxyUtil implements InvocationHandler {

    private Object target;
    public void setTarget(Object target) {
      this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("111111111111111");
        return method.invoke(target,args);
    }

    public Object creatProxyObject() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

}
