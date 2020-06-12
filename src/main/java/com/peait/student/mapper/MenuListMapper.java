package com.peait.student.mapper;


import com.peait.student.entity.MenuList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface MenuListMapper {
    int deleteByPrimaryKey(String id);

    int insert(MenuList record);

    int insertSelective(MenuList record);

    MenuList selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MenuList record);

    int updateByPrimaryKey(MenuList record);

    List<MenuList> queryByUserId(String authorization);
}