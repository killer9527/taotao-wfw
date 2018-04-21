package com.wfw.mapper;

import com.wfw.entity.TbItemDescDO;

public interface TbItemDescMapper {
    int deleteByPrimaryKey(Long itemId);

    int insert(TbItemDescDO record);

    int insertSelective(TbItemDescDO record);

    TbItemDescDO selectByPrimaryKey(Long itemId);

    int updateByPrimaryKeySelective(TbItemDescDO record);

    int updateByPrimaryKeyWithBLOBs(TbItemDescDO record);

    int updateByPrimaryKey(TbItemDescDO record);
}