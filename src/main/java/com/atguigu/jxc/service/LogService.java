package com.atguigu.jxc.service;

import com.atguigu.jxc.entity.Log;

/**
 * @description
 */
public interface LogService {

    /**
     * 保存日志
     * @param log 日志实体
     */
    void save(Log log);

    String list(String logType,String trueName,String sTime,String eTime,Integer page,Integer rows);
}
