package com.wfw.manager.mapper;

import com.wfw.manager.entity.TbItemDO;

public interface TbItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItemDO record);

    int insertSelective(TbItemDO record);

    TbItemDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItemDO record);

    int updateByPrimaryKey(TbItemDO record);
}