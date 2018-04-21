package com.wfw.mapper;

import com.wfw.entity.TbOrderItemDO;

public interface TbOrderItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(TbOrderItemDO record);

    int insertSelective(TbOrderItemDO record);

    TbOrderItemDO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TbOrderItemDO record);

    int updateByPrimaryKey(TbOrderItemDO record);
}