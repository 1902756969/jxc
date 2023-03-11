package com.atguigu.jxc.service;

import com.atguigu.jxc.domain.ServiceVO;
import com.atguigu.jxc.entity.User;
import com.atguigu.jxc.entity.UserLogin;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @description
 */
public interface UserService {

    ServiceVO login(UserLogin userLogin, HttpSession session);

    Map<String,Object> loadUserInfo(HttpSession session);

    Map<String, Object> list(Integer page,Integer rows,String userName);

    ServiceVO save(User user);

    ServiceVO delete(Integer userId);

    ServiceVO setRole(Integer userId, String roles);

    ServiceVO updatePassword(String newPassword, HttpSession session);
}
