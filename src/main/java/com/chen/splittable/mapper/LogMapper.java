package com.chen.splittable.mapper;

import com.chen.splittable.model.LogBean;

import java.util.List;

public interface LogMapper {
    List<LogBean> selectById();
}
