package com.atguigu.jxc.dao;


import com.atguigu.jxc.entity.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 菜单
 */
public interface MenuDao {

    List<Menu> getMenuByRoleId(Integer roleId);

    // 根据菜单父ID获取当前角色下的菜单信息
    List<Menu> getMenuByParentId(@Param("parentId") Integer parentId, @Param("roleId") Integer roleId);

    // 根据菜单父ID获取属于该菜单id的所有菜单
    List<Menu> getAllMenuByParentId(Integer parentId);
}
