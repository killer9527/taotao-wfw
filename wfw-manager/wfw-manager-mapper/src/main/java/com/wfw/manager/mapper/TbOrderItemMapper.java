package com.wfw.manager.mapper;

import com.wfw.manager.entity.TbOrderItemDO;

public interface TbOrderItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(TbOrderItemDO record);

    int insertSelective(TbOrderItemDO record);

    TbOrderItemDO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TbOrderItemDO record);

    int updateByPrimaryKey(TbOrderItemDO record);
}