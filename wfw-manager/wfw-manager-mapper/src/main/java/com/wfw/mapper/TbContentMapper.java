package com.wfw.mapper;

import com.wfw.entity.TbContentDO;

public interface TbContentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbContentDO record);

    int insertSelective(TbContentDO record);

    TbContentDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbContentDO record);

    int updateByPrimaryKeyWithBLOBs(TbContentDO record);

    int updateByPrimaryKey(TbContentDO record);
}