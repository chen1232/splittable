package com.chen.splittable;

import com.chen.splittable.mapper.LogMapper;
import com.chen.splittable.model.LogBean;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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
    void query() {
        log.info("开始");
        PageHelper.offsetPage(2, 5);
        List<LogBean> logBeans = logMapper.selectById();
        long total = ((Page) logBeans).getTotal();
        log.info("总数：{}" + total);
        for (LogBean logBean : logBeans) {
            log.info("结果：{}" + logBeans.toString());
        }
    }

    @Test
    void count() {
        log.info("开始");
        long count = logMapper.selectCount();
        log.info("结果：{}" + count);
    }

    @Test
    void insert() {
        log.info("开始");
        LogBean logBean = new LogBean();
        int id = 4;
        System.out.println("取余：" + id % 3);
        logBean.setId(id);
        logBean.setName("5");
        logBean.setTitle("5");
        Integer insert = logMapper.insert(logBean);
        System.out.println(insert);
    }

}
