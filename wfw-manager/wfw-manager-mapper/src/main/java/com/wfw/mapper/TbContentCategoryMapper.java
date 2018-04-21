package com.wfw.mapper;

import com.wfw.entity.TbContentCategoryDO;

public interface TbContentCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbContentCategoryDO record);

    int insertSelective(TbContentCategoryDO record);

    TbContentCategoryDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbContentCategoryDO record);

    int updateByPrimaryKey(TbContentCategoryDO record);
}