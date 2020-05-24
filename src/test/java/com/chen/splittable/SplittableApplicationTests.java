package com.chen.splittable;

import com.chen.splittable.mapper.LogMapper;
import com.chen.splittable.model.LogBean;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
@Log
class SplittableApplicationTests {
    @Autowired
    private LogMapper logMapper;

    @Test
    void contextLoads() {
        log.info("开始");
        List<LogBean> logBeans = logMapper.selectById();
        log.info("结果：{}" + logBeans);
    }

}
