package com.taotao.service.impl;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Small Bear
 * @Description:
 * @Data:Create in 19:59 2017/10/9
 * @Modified By:Small Bear
 */
@Service("itemServiceImpl")
public class ItemServiceImpl implements ItemService{
    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById(long itemId) {
        return tbItemMapper.selectByPrimaryKey(itemId);
    }
}
