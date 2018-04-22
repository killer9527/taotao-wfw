package com.wfw.manager.mapper;

import com.wfw.manager.entity.TbContentDO;

public interface TbContentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbContentDO record);

    int insertSelective(TbContentDO record);

    TbContentDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbContentDO record);

    int updateByPrimaryKeyWithBLOBs(TbContentDO record);

    int updateByPrimaryKey(TbContentDO record);
}