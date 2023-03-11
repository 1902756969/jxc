package com.atguigu.jxc.service;

import com.atguigu.jxc.domain.ServiceVO;
import com.atguigu.jxc.entity.Role;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @description
 */
public interface RoleService {

    ServiceVO saveRole(Role role, HttpSession session);

    Map<String,Object> listAll();

    Map<String, Object> list(Integer page, Integer rows, String roleName);

    ServiceVO save(Role role);

    ServiceVO delete(Integer roleId);

    ServiceVO setMenu(Integer roleId,String menus);
}
