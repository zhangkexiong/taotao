package com.taotao.controller;

import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Small Bear
 * @Description:
 * @Data:Create in 21:25 2017/10/9
 * @Modified By:Small Bear
 */
@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping(value = "/item/{id}")
    @ResponseBody
    public TbItem getItemsById(@PathVariable Long id){
        System.out.println(id);
        TbItem tbItem=itemService.getItemById(id);
        return tbItem;
    }
    @RequestMapping("/item")
    @ResponseBody
    public String getString(){
        return "aa";
    }
}
