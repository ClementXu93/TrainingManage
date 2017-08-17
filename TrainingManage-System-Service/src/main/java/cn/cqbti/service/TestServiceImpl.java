package cn.cqbti.service;


import cn.cqbti.core.service.TestService;
import cn.cqbti.mapper.QjkUserMapper;
import cn.cqbti.model.QjkUser;
import com.baomidou.mybatisplus.service.IService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * @Author: clement
 * @Description:
 * @Date: Create in 13:13 2017/8/15
 */
@Service(value = "testService")
public class TestServiceImpl extends ServiceImpl<QjkUserMapper, QjkUser>implements TestService {
    protected final Logger logger = LogManager.getLogger(TestServiceImpl.class);

    public boolean test(String text) {
        logger.info("访问成功"+text);
        QjkUser qjkUser = new QjkUser();
        qjkUser.setUserid(1);
        qjkUser.setLeaderid(99999);
        Integer integer = baseMapper.insert(qjkUser);
        if (integer == 1) {
            return true;
        } else {
            return false;
        }
    }
}
