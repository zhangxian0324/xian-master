package com.xiancommon.utils.proxyUtil.dynamicProxyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.xiancommon.utils.proxyUtil.dynamicProxyUtil.LoginStatusEnum.SUCCESS;
import static com.xiancommon.utils.proxyUtil.dynamicProxyUtil.LoginStatusEnum.FIAL;
import static com.xiancommon.utils.proxyUtil.dynamicProxyUtil.LoginStatusEnum.UNKOWN;

/**
 * @author zhangxian
 */
public class AgentLogin implements LoginInterface {
    private final static Logger log = LoggerFactory.getLogger("AgentLogin.class");

    private Object LoginStatusEnum;
    @Override
    public LoginStatusEnum login() {
        log.info("agent login--------");
        /**
         * 登录逻辑；
         */
        LoginStatusEnum REUSLT = SUCCESS;
        switch (REUSLT) {
            case SUCCESS:
                log.info(SUCCESS.name());
                break;
            case FIAL:
                log.info(FIAL.name());
                break;
            case UNKOWN:
                log.info(UNKOWN.name());
                break;
            default:
                log.info("default");

        }
        return REUSLT;
    }
}
