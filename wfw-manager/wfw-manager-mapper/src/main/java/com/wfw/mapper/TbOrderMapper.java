package com.wfw.mapper;

import com.wfw.entity.TbOrderDO;

public interface TbOrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(TbOrderDO record);

    int insertSelective(TbOrderDO record);

    TbOrderDO selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(TbOrderDO record);

    int updateByPrimaryKey(TbOrderDO record);
}