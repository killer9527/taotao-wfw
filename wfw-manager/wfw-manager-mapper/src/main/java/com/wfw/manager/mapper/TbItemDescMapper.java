package com.wfw.manager.mapper;

import com.wfw.manager.entity.TbItemDescDO;

public interface TbItemDescMapper {
    int deleteByPrimaryKey(Long itemId);

    int insert(TbItemDescDO record);

    int insertSelective(TbItemDescDO record);

    TbItemDescDO selectByPrimaryKey(Long itemId);

    int updateByPrimaryKeySelective(TbItemDescDO record);

    int updateByPrimaryKeyWithBLOBs(TbItemDescDO record);

    int updateByPrimaryKey(TbItemDescDO record);
}