package com.wfw.manager.mapper;

import com.wfw.manager.entity.TbItemParamDO;

public interface TbItemParamMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItemParamDO record);

    int insertSelective(TbItemParamDO record);

    TbItemParamDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItemParamDO record);

    int updateByPrimaryKeyWithBLOBs(TbItemParamDO record);

    int updateByPrimaryKey(TbItemParamDO record);

    TbItemParamDO selectByCategoryId(Long id);
}