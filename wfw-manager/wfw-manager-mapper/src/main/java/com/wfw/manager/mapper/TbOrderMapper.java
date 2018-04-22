package com.wfw.manager.mapper;

import com.wfw.manager.entity.TbOrderDO;

public interface TbOrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(TbOrderDO record);

    int insertSelective(TbOrderDO record);

    TbOrderDO selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(TbOrderDO record);

    int updateByPrimaryKey(TbOrderDO record);
}