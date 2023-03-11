package com.atguigu.jxc.dao;

import com.atguigu.jxc.entity.RoleMenu;

/**
 * @description 角色菜单
 */
public interface RoleMenuDao {

    // 根据角色id删除该角色的所有菜单权限
    Integer deleteRoleMenuByRoleId(Integer roleId);

    // 为角色新增一条菜单权限
    Integer save(RoleMenu roleMenu);
}
