package com.wfw.manager.mapper;

import com.wfw.manager.entity.TbOrderShippingDO;

public interface TbOrderShippingMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(TbOrderShippingDO record);

    int insertSelective(TbOrderShippingDO record);

    TbOrderShippingDO selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(TbOrderShippingDO record);

    int updateByPrimaryKey(TbOrderShippingDO record);
}