//package cn.cqbti.motanAnnotation;
//
//import com.weibo.api.motan.config.springsupport.AnnotationBean;
//import com.weibo.api.motan.config.springsupport.BasicServiceConfigBean;
//import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
//import com.weibo.api.motan.config.springsupport.RegistryConfigBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @Author: clement
// * @Description:
// * @Date: Create in 11:41 2017/8/16
// */
//@Configuration
//public class AnnotationRpcServer {
//
//    @Bean
//    static AnnotationBean motanAnnotationBean() {
//        AnnotationBean motanAnnotationBean = new AnnotationBean();
//        motanAnnotationBean.setPackage("com.cqbti.service");
//        return motanAnnotationBean;
//    }
//
//    @Bean(name = "motan")
//    public ProtocolConfigBean protocolConfig() {
//        ProtocolConfigBean config = new ProtocolConfigBean();
//        config.setDefault(true);
//        config.setName("motan");
//        config.setMaxContentLength(1048576);
//        return config;
//    }
//
//    @Bean(name="registryConfig")
//    public RegistryConfigBean registryConfig() {
//        RegistryConfigBean config = new RegistryConfigBean();
//        config.setRegProtocol("local");
////        config.setAddress("127.0.0.1:2181");
//        return config;
//    }
//
//    @Bean
//    public BasicServiceConfigBean baseServiceConfig() {
//        BasicServiceConfigBean config = new BasicServiceConfigBean();
//        config.setExport("motan:8002");
//        config.setGroup("motan-rpc");
//        config.setAccessLog(false);
//        config.setShareChannel(true);
//        config.setModule("motan-rpc");
//        config.setApplication("myMotan");
//        config.setRegistry("registryConfig");
//        return config;
//    }
//
//}
