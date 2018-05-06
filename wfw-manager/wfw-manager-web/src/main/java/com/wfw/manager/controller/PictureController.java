package com.wfw.manager.controller;

import com.wfw.common.vo.UploadPictureResponseVO;
import com.wfw.manager.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by killer9527 on 2018/5/1.
 */
@RestController
@RequestMapping(value = "/pic")
public class PictureController {
    @Autowired
    private PictureService pictureService;

    @ResponseBody
    @RequestMapping(value = "/upload")
    public UploadPictureResponseVO uploadPicture(MultipartFile uploadFile){
        UploadPictureResponseVO response =  this.pictureService.uploadPicture(uploadFile);
        return response;
    }
}
