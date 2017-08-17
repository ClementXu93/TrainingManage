//package cn.cqbti.motanAnnotation;
//
//import com.weibo.api.motan.config.springsupport.BasicRefererConfigBean;
//import com.weibo.api.motan.config.springsupport.AnnotationBean;
//import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
//import com.weibo.api.motan.config.springsupport.RegistryConfigBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @Author: clement
// * @Description:
// * @Date: Create in 12:25 2017/8/16
// */
//@Configuration
//public class AnnotationRpcClient {
//
//    @Bean
//    static AnnotationBean motanAnnotationBean() {
//        AnnotationBean motanAnnotationBean = new AnnotationBean();
//        motanAnnotationBean.setPackage("com.cqbti.web");
//        return motanAnnotationBean;
//    }
//
//    @Bean(name = "motan")
//    public ProtocolConfigBean demoMotanProtocolConfig() {
//        ProtocolConfigBean config = new ProtocolConfigBean();
//        //Id无需设置
////        config.setId("demoMotan");
//        config.setName("motan");
//        config.setDefault(true);
//        config.setMaxContentLength(1048576);
//        config.setHaStrategy("failover");
//        config.setLoadbalance("roundrobin");
//        return config;
//    }
//
//    @Bean(name = "registry")
//    public RegistryConfigBean registryConfig() {
//        RegistryConfigBean config = new RegistryConfigBean();
//        config.setRegProtocol("local");
////        config.setAddress("127.0.0.1:2181");
//        return config;
//    }
//
//    @Bean(name = "motanClientBasicConfig")
//    public BasicRefererConfigBean baseRefererConfig() {
//        BasicRefererConfigBean config = new BasicRefererConfigBean();
//        config.setProtocol("motan");
//        config.setGroup("motan-rpc");
//        config.setModule("motan-rpc");
//        config.setApplication("myMotan");
//        config.setRegistry("registry");
//        config.setCheck(false);
//        config.setAccessLog(true);
//        config.setRetries(2);
//        config.setThrowException(true);
//        return config;
//    }
//}
