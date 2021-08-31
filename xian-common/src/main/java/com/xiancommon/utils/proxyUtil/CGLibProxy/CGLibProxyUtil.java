package com.xiancommon.utils.proxyUtil.CGLibProxy;

import com.xiancommon.utils.proxyUtil.dynamicProxyUtil.AgentLogin;
import com.xiancommon.utils.proxyUtil.dynamicProxyUtil.LoginInterface;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhangxian
 */
public class CGLibProxyUtil implements MethodInterceptor {

    public Object CreateProxyObj(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGlib==========");
        return methodProxy.invokeSuper(o,objects);
    }

}
