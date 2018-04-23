package com.wfw.manager.mapper;

import com.wfw.manager.dto.TbItemCategoryNodeDTO;
import com.wfw.manager.entity.TbItemCatDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemCatMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItemCatDO record);

    int insertSelective(TbItemCatDO record);

    TbItemCatDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItemCatDO record);

    int updateByPrimaryKey(TbItemCatDO record);

    List<TbItemCategoryNodeDTO> selectByParentId(@Param("parentId") Long parentId);
}