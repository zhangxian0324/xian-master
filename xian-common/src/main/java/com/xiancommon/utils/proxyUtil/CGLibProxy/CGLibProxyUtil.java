package com.xiancommon.utils.proxyUtil.CGLibProxy;

import com.xiancommon.utils.proxyUtil.dynamicProxyUtil.AgentLogin;
import com.xiancommon.utils.proxyUtil.dynamicProxyUtil.LoginInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhangxian
 */

public class CGLibProxyUtil implements MethodInterceptor {
    private final static Logger log = LoggerFactory.getLogger("CalUtil.class");

    public Object CreateProxyObj(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        log.info("CGlib==========");
        return methodProxy.invokeSuper(o,objects);
    }

}
