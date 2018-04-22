package com.wfw.manager.mapper;

import com.wfw.manager.dto.TbItemDTO;
import com.wfw.manager.entity.TbItemDO;
import org.apache.ibatis.annotations.Param;

public interface TbItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItemDO record);

    int insertSelective(TbItemDO record);

    TbItemDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItemDO record);

    int updateByPrimaryKey(TbItemDO record);

    TbItemDTO selectByItemId(@Param("itemId") long itemId);
}