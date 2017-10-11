package com.taotao.controller;

import com.taotao.utils.FastDFSClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Small Bear
 * @Description:图片的上传
 * @Data:Create in 21:37 2017/10/11
 * @Modified By:Small Bear
 */
@Controller
public class ImageController {
    //引用配置文件
    @Value("${IMAGE_SERVER_URL}")
    private String IMAGE_SERVER_URL;
    @RequestMapping("/pic/upload")
    @ResponseBody
    public Map uploadImage(MultipartFile uploadFile){
        try {
            //接收上传的文件
            //取扩展名
            String originalFilename = uploadFile.getOriginalFilename();
            String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
            //上传到图片服务器
            FastDFSClient fastDFSClient = new FastDFSClient("classpath:client.conf");
            String url = fastDFSClient.uploadFile(uploadFile.getBytes(), extName);
            url = IMAGE_SERVER_URL + url;
            //响应上传图片的url
            Map result = new HashMap<>();
            result.put("error", 0);
            result.put("url", url);
            return result;
        }catch (Exception e){
            e.printStackTrace();
            Map result=new HashMap<>();
            result.put("error",1);
            result.put("message","图片上传失败");
            return result;
        }

    }
}
