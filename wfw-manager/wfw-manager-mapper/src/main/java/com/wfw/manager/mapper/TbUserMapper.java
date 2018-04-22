package com.wfw.manager.mapper;

import com.wfw.manager.entity.TbUserDO;

public interface TbUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbUserDO record);

    int insertSelective(TbUserDO record);

    TbUserDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbUserDO record);

    int updateByPrimaryKey(TbUserDO record);
}