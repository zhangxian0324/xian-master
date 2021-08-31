package com.xiancommon.utils.proxyUtil.dynamicProxyUtil;
import static com.xiancommon.utils.proxyUtil.dynamicProxyUtil.LoginStatusEnum.SUCCESS;
import static com.xiancommon.utils.proxyUtil.dynamicProxyUtil.LoginStatusEnum.FIAL;
import static com.xiancommon.utils.proxyUtil.dynamicProxyUtil.LoginStatusEnum.UNKOWN;

/**
 * @author zhangxian
 */
public class AgentLogin implements LoginInterface {
    private Object LoginStatusEnum;
    @Override
    public LoginStatusEnum login() {
        System.out.println("agent login--------");
        /**
         * 登录逻辑；
         */
        LoginStatusEnum REUSLT = SUCCESS;
        switch (REUSLT) {
            case SUCCESS:
                System.out.println(SUCCESS.name());
                break;
            case FIAL:
                System.out.println(FIAL.name());
                break;
            case UNKOWN:
                System.out.println(UNKOWN.name());
                break;
            default:
                System.out.println("default");

        }
        return REUSLT;
    }
}
