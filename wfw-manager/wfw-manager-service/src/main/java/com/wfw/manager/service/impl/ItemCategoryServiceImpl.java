package com.wfw.manager.service.impl;

import com.wfw.common.vo.EUTreeNodeVO;
import com.wfw.manager.dto.TbItemCategoryNodeDTO;
import com.wfw.manager.mapper.TbItemCatMapper;
import com.wfw.manager.service.ItemCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by killer9527 on 2018/4/23.
 */
@Service
public class ItemCategoryServiceImpl implements ItemCategoryService {
    @Autowired
    private TbItemCatMapper itemCatMapper;

    @Override
    public List<EUTreeNodeVO> getItemCategory(long parentId) {
        List<TbItemCategoryNodeDTO> itemCategoryNodes = this.itemCatMapper.selectByParentId(parentId);
        List<EUTreeNodeVO> euTreeNodes = itemCategoryNodes.stream().map(item -> convert(item))
                .collect(Collectors.toList());
        return euTreeNodes;
    }

    /**
     * 模型转换
     * @param itemCategoryNodeDTO
     * @return
     */
    private EUTreeNodeVO convert(TbItemCategoryNodeDTO itemCategoryNodeDTO){
        EUTreeNodeVO euTreeNodeVO = new EUTreeNodeVO();
        euTreeNodeVO.setId(itemCategoryNodeDTO.getId());
        euTreeNodeVO.setText(itemCategoryNodeDTO.getName());
        euTreeNodeVO.setState(itemCategoryNodeDTO.getParent() ? "closed" : "open");
        return euTreeNodeVO;
    }
}
