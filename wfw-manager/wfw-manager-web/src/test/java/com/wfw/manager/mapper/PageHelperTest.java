package com.wfw.manager.mapper;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wfw.manager.dto.TbItemDTO;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by killer9527 on 2018/4/22.
 */
public class PageHelperTest extends TestCase{
    public void testPageHelper(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        TbItemMapper itemMapper = applicationContext.getBean(TbItemMapper.class);
        PageHelper.startPage(1, 10);
        List<TbItemDTO> tbItems = itemMapper.selectAll();
        PageInfo<TbItemDTO> pageInfo = new PageInfo<>(tbItems);
        tbItems.stream().forEach(item -> System.out.println(JSONObject.toJSONString(item)));
        System.out.println(pageInfo.getTotal());
    }
}
