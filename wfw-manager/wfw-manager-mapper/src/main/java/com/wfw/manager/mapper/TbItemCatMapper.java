package com.wfw.manager.mapper;

import com.wfw.manager.entity.TbItemCatDO;

public interface TbItemCatMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItemCatDO record);

    int insertSelective(TbItemCatDO record);

    TbItemCatDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItemCatDO record);

    int updateByPrimaryKey(TbItemCatDO record);
}