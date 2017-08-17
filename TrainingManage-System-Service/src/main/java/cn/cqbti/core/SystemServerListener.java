package cn.cqbti.core;

import cn.cqbti.core.listener.ServerListener;
import com.weibo.api.motan.common.MotanConstants;
import com.weibo.api.motan.util.MotanSwitcherUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletContextEvent;

/**
 * @Author: clement
 * @Description:
 * @Date: Create in 11:52 2017/8/16
 */
public class SystemServerListener extends ServerListener{
    protected final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    public void contextInitialized(ServletContextEvent sce) {
//        MotanSwitcherUtil.setSwitcherValue(MotanConstants.REGISTRY_HEARTBEAT_SWITCHER, true);
        super.contextInitialized(sce);
    }
}
