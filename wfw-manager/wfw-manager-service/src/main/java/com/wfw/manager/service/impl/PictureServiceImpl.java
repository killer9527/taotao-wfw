package com.wfw.manager.service.impl;

import com.wfw.common.vo.UploadPictureResponseVO;
import com.wfw.manager.service.PictureService;
import com.wfw.utils.FtpUtil;
import com.wfw.utils.UniqueIdUtil;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created by killer9527 on 2018/5/1.
 */
@Service
public class PictureServiceImpl implements PictureService {
    @Value("${ftp.url}")
    private String ftpUrl;

    @Value("${ftp.port}")
    private int ftpPort;

    @Value("${ftp.username}")
    private String ftpUserName;

    @Value("${ftp.password}")
    private String ftpPassword;

    @Value("${ftp.base.path}")
    private String ftpBasePath;

    @Value("${image.base.path}")
    private String imagePathPre;

    @Override
    public UploadPictureResponseVO uploadPicture(MultipartFile multipartFile) {
        if (multipartFile == null || multipartFile.isEmpty()){
            return new UploadPictureResponseVO(1, "请选择上传图片");
        }
        //生成图片名称
        String picName = UniqueIdUtil.genImageName();
        //获取图片后缀
        String originalFilename = multipartFile.getOriginalFilename();
        String extension = originalFilename.substring(originalFilename.lastIndexOf('.'));
        if (StringUtils.isBlank(extension)){
            UploadPictureResponseVO response = new UploadPictureResponseVO(1, "", "上传图片无扩展名");
            return response;
        }
        picName += extension;
        //获取文件上传的相对目录
        String imagePath = new DateTime().toString("/yyyy/MM/dd");
        //上传图片
        try {
            boolean uploadResult = FtpUtil.uploadFile(ftpUrl, ftpPort, ftpUserName, ftpPassword, ftpBasePath,
                    imagePath, picName, multipartFile.getInputStream());
            if (uploadResult){
                String url = imagePathPre + imagePath + "/" + picName;
                return new UploadPictureResponseVO(0, url, "OK");
            } else {
                return new UploadPictureResponseVO(1, "", "上传文件失败");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return new UploadPictureResponseVO(1, "上传文件出现异常", e.getMessage());
        }
    }
}
