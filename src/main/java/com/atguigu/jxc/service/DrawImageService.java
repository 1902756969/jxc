package com.atguigu.jxc.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description
 */
public interface DrawImageService {

    void drawImage(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
