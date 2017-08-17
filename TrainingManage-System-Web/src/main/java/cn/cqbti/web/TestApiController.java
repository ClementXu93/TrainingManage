package cn.cqbti.web;

import cn.cqbti.core.service.TestService;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: clement
 * @Description:
 * @Date: Create in 15:56 2017/8/14
 */
@Controller
@RequestMapping(value = "/v1/api")
public class TestApiController {
    protected final Logger logger = LogManager.getLogger(TestApiController.class);

//    @MotanReferer(basicReferer = "motanClientBasicConfig",group = "motan-rpc", directUrl = "127.0.0.1:8002")
//    private TestService testService;

    @Autowired
    private TestService testService;

    @ApiOperation(value = "first test", notes = "fisrt test")
    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Map<String,Object> firstTest(String text) {
        Map<String,Object> map = new HashMap<>();
////        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:application-config.xml");
//        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
//        Object motanReferer = webApplicationContext.getBean("motanReferer");
////        TestService testService = (TestService) ctx.getBean("motanReferer");
//        boolean b = testService.test(text);
        logger.info("===================================");
        logger.info(testService.test(text));
        logger.info("===================================");
//        map.put("text", b);
        return map;
    }

}
