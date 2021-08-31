package com.xiancommon.utils.proxyUtil;

import com.xiancommon.utils.proxyUtil.CGLibProxy.CGLibProxyUtil;
import com.xiancommon.utils.proxyUtil.dynamicProxyUtil.AgentLogin;
import com.xiancommon.utils.proxyUtil.dynamicProxyUtil.DynamicProxyUtil;
import com.xiancommon.utils.proxyUtil.dynamicProxyUtil.LoginInterface;

public class ProxyMain {
    public static void main(String[] args) {
        /**
         * 静态代理
         */
        DynamicProxyUtil proxyUtil = new DynamicProxyUtil();
        LoginInterface agentLogin = new AgentLogin();
        proxyUtil.setTarget(agentLogin);
        Object obj = proxyUtil.creatProxyObject();
        LoginInterface login = (LoginInterface) obj;
        login.login();

        /**
         * CGlib 代理
         */

        CGLibProxyUtil CGlibProxyUtil = new CGLibProxyUtil();
        LoginInterface a = (LoginInterface)CGlibProxyUtil.CreateProxyObj(AgentLogin.class);
        a.login();
    }
}
