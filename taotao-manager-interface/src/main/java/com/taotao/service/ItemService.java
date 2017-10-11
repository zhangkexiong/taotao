package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;

/**
 * @Author: Small Bear
 * @Description:
 * @Data:Create in 19:57 2017/10/9
 * @Modified By:Small Bear
 */
public interface ItemService {
    TbItem getItemById(long itemId);
    EasyUIDataGridResult getItemList(int page, int rows);
}
