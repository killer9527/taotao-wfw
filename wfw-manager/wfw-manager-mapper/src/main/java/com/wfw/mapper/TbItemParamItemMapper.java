package com.wfw.mapper;

import com.wfw.entity.TbItemParamItemDO;

public interface TbItemParamItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItemParamItemDO record);

    int insertSelective(TbItemParamItemDO record);

    TbItemParamItemDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItemParamItemDO record);

    int updateByPrimaryKeyWithBLOBs(TbItemParamItemDO record);

    int updateByPrimaryKey(TbItemParamItemDO record);
}