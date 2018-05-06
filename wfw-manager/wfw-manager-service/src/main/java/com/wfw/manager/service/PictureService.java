package com.wfw.manager.service;

import com.wfw.common.vo.UploadPictureResponseVO;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by killer9527 on 2018/5/1.
 */
public interface PictureService {
    UploadPictureResponseVO uploadPicture(MultipartFile multipartFile);
}
