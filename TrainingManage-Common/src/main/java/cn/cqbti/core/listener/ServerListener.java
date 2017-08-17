package cn.cqbti.core.listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class ServerListener implements ServletContextListener {
    protected final Logger logger = LogManager.getLogger(ServerListener.class);
    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("=============================");
        logger.info("系统[{}]启动完成", sce.getServletContext().getServletContextName());
        logger.info("=============================");
    }
}
