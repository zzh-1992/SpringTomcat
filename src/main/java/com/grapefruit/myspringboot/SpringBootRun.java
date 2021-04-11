package com.grapefruit.myspringboot;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
public class SpringBootRun {
    public static void run() throws LifecycleException {
        // 启动tomcat
        Tomcat tomcat = new Tomcat();
        Connector connector = new Connector();
        connector.setPort(8888);
        connector.setURIEncoding("UTF-8");

        tomcat.getService().addConnector(connector);

        tomcat.addWebapp("/project","G:/Aop/SpringAopWithCode");

        tomcat.start();
        // 阻塞tomcat,等待请求
        tomcat.getServer().await();
    }
}
